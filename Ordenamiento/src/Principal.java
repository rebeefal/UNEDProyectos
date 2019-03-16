
//Clase Principal, se va a utilizar para la clase main y para crear el GUI de la aplicación
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Principal extends JFrame {

    int edad, puntaje, x=0;
    String nombre, pais;

    JPanel jPanel1;

    // Etiquetas que indican que informacion debe ser ingresada en cada espacio de texto. 
    JLabel nombreEti;
    JLabel paisEti;
    JLabel edadEti;
    JLabel puntajeEti;

    //Espacios para ingresar la informacion de los tenistas
    JTextField nombreTex;
    JTextField paisTex;
    JTextField edadTex;
    JTextField puntajeTex;

    // Este boton agrega los datos de los tenistas a la lista
    JButton agregarBot;

    // Estos botones se utilizan para elegir el algoritmo de ordenamiento que va a ser utilizado
    JButton listaOriginalBot;
    JButton opcion1Bot;
    JButton opcion2Bot;
    JButton opcion3Bot;

    JList algoritmoLista;
    JLabel algoritmoListaEtiqueta;

    JLabel opcionesOrdenamientoOpcion1;
    JLabel opcionesOrdenamientoOpcion2;
    JLabel opcionesOrdenamientoOpcion3;

    JTable tenistasTabla;
    
    JScrollPane jScrollPane1;

    private GroupLayout jPanel1Layout;

    public Principal() {
        //Dentro de este constructor se van a crear los elementos del GUI    

        JTabbedPane pestanas = new JTabbedPane();
        add(pestanas);

        JPanel jPanel1 = new JPanel();
 
        jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setAutoCreateGaps(true);
        jPanel1Layout.setAutoCreateContainerGaps(true);

  
        nombreEti = new JLabel("Nombre");
        nombreEti.setFont(new Font("Arial", Font.BOLD, 12));
        nombreEti.setForeground(new Color(77, 66, 74));

        paisEti = new JLabel("País");
        paisEti.setFont(new Font("Arial", Font.BOLD, 12));
        paisEti.setForeground(new Color(77, 66, 74));

        edadEti = new JLabel("Edad");
        edadEti.setFont(new Font("Arial", Font.BOLD, 12));
        edadEti.setForeground(new Color(77, 66, 74));

        puntajeEti = new JLabel("Puntaje");
        puntajeEti.setFont(new Font("Arial", Font.BOLD, 12));
        puntajeEti.setForeground(new Color(77, 66, 74));

        nombreTex = new JTextField(10);
        nombreTex.setBackground(Color.white);

        paisTex = new JTextField(10);
        paisTex.setBackground(Color.white);
        edadTex = new JTextField(10);
        edadTex.setBackground(Color.white);
        puntajeTex = new JTextField(10);
        puntajeTex.setBackground(Color.white);

        agregarBot = new JButton("Agregar");
        agregarBot.setPreferredSize(new Dimension(90, 30));
        agregarBot.setBackground(new Color(170, 175, 182));

        listaOriginalBot = new JButton("Original");
        listaOriginalBot.setPreferredSize(new Dimension(90, 30));
        listaOriginalBot.setBackground(new Color(170, 175, 182));

        opcion1Bot = new JButton("Opcion 1");
        opcion1Bot.setPreferredSize(new Dimension(90, 30));
        opcion1Bot.setBackground(new Color(170, 175, 182));

        opcion2Bot = new JButton("Opcion 2");
        opcion2Bot.setPreferredSize(new Dimension(90, 30));
        opcion2Bot.setBackground(new Color(170, 175, 182));

        opcion3Bot = new JButton("Opcion 3");
        opcion3Bot.setPreferredSize(new Dimension(90, 30));
        opcion3Bot.setBackground(new Color(170, 175, 182));

        String algoritmoOrdenamiento[] = {"Shellsort", "Quicksort"};
        algoritmoLista = new JList(algoritmoOrdenamiento);
        algoritmoLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        algoritmoLista.setVisibleRowCount(3);

        algoritmoLista.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoLista.setForeground(new Color(77, 66, 74));
        algoritmoLista.setBackground(new Color(170, 175, 182));

        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77, 66, 74));

        opcionesOrdenamientoOpcion1 = new JLabel("Opcion 1. Mostrar tenistas ordenados en forma descendente según puntaje \n");
        opcionesOrdenamientoOpcion2 = new JLabel("Opcion 2. Mostrar tenistas ordenados en forma ascendente según edad. \n ");
        opcionesOrdenamientoOpcion3 = new JLabel("Opcion 3. Mostrar tenistas ordenados alfabéticamente en forma ascendente según su país. \n ");

        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77, 66, 74));

        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77, 66, 74));

        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77, 66, 74));

        CreadorDeObjectParaTable creadorDeObjectParaTable = new CreadorDeObjectParaTable();

        jScrollPane1 = new JScrollPane();
        
        tenistasTabla = new JTable();
        jScrollPane1.setViewportView(tenistasTabla);

        TableModel modelo = new DefaultTableModel();

        agregarBot.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                do {
                    try {

                        nombre = nombreTex.getText();
                        pais = paisTex.getText();
                        edad = Integer.parseInt(edadTex.getText());
                        puntaje = Integer.parseInt(puntajeTex.getText());

                        // creo un tenista 
                        Tenista tenista = new Tenista(nombre, pais, edad, puntaje);

                        // agrego al tenista a la lista por medio de la funcion
                        creadorDeObjectParaTable.agregarTenistaALista(tenista);

                        x = 2;

                    } catch (NumberFormatException numberFormatException) {

                        JOptionPane.showMessageDialog(null,
                                "El valor ingresado no es válido");
                    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {

                        JOptionPane.showMessageDialog(null,
                                "El límite de tenistas se ha alcanzado");
                    }

                } while (x == 1);
            }
        });

       
        opcion1Bot.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {

                do {
                
                    try {

                       creadorDeObjectParaTable.cambiaArrayListAObject();
                       Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                       TableModel modelo = new DefaultTableModel(
                               creadorDeObjectParaTable.cambiaArrayListAObject(),
                               nombreColumnas);
                       tenistasTabla.setModel(modelo); 

                       x=2;
                   }catch(IndexOutOfBoundsException indexOutOfBoundsException) {

                        JOptionPane.showMessageDialog(null,
                                "Ha ingresado menos de 15 tenistas");
                   }                               
                }while(x==0);
            }
        });

        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
						
                        .addComponent(nombreTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
					
                        .addContainerGap()
						
                        .addComponent(nombreEti)
                        .addGap(20, 20, 20)))
						
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
					
                        .addComponent(paisTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edadTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(puntajeTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(agregarBot)
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(paisEti)
                        .addGap(51, 51, 51)
                        .addComponent(edadEti)
                        .addGap(38, 38, 38)
                        .addComponent(puntajeEti)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(opcion2Bot)
                    .addComponent(opcion1Bot)
                    .addComponent(opcion3Bot))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
		
		
		
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(puntajeEti)
                    .addComponent(edadEti)
                    .addComponent(paisEti)
                    .addComponent(nombreEti))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edadTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntajeTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarBot))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(opcion1Bot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion2Bot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opcion3Bot)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pestanas.addTab("Lista Tenistas", jPanel1);
    }

    public static void main(String[] args) {
        Principal inter = new Principal();
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setSize(1000, 500);
        inter.setVisible(true);

    }

    @Override
    public String toString() {
        return nombre + " , " + pais + " , " + edad + " , " + puntaje;
    }

}
