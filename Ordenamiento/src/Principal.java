
//Clase Principal, se va a utilizar para la clase main y para crear el GUI de la aplicación
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Principal extends JFrame {

    int edad, puntaje, x=0;  
    String nombre, pais;
    JPanel jPanel1; 
    JLabel nombreEti;
    JLabel paisEti;
    JLabel edadEti;
    JLabel puntajeEti;
    JTextField nombreTex;
    JTextField paisTex;
    JTextField edadTex;
    JTextField puntajeTex;
    JButton agregarBot;
    JButton listaOriginalBot;
    JButton ordenPorEdad;
    JButton ordenPorPuntaje;
    JButton ordenPorPais;
    JList algoritmoLista;
    JLabel algoritmoListaEtiqueta;
    JLabel opcionesOrdenamientoOpcion1;
    JLabel opcionesOrdenamientoOpcion2;
    JLabel opcionesOrdenamientoOpcion3;
    JTable tenistasTabla;    
    JScrollPane jScrollPane1;
    JRadioButton shellsortButton;
    JRadioButton insercionButton;
    ButtonGroup seleccionAlgoritmo;
    private GroupLayout jPanel1Layout;

    
    public Principal() {
        
        //Elementos de la interfaz grafica   
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
        ordenPorEdad = new JButton(" - a + Edad");
        ordenPorEdad.setPreferredSize(new Dimension(90, 30));
        ordenPorEdad.setBackground(new Color(170, 175, 182));
        ordenPorPuntaje = new JButton("+ a - Puntaje");
        ordenPorPuntaje.setPreferredSize(new Dimension(90, 30));
        ordenPorPuntaje.setBackground(new Color(170, 175, 182));      
        ordenPorPais = new JButton("Alfabeticamente Pais");
        ordenPorPais.setPreferredSize(new Dimension(90, 30));
        ordenPorPais.setBackground(new Color(170, 175, 182));    
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
        // botones para escoger el algoritmo que se va a utilizar para ordenar la lista. 
        seleccionAlgoritmo = new ButtonGroup();
        shellsortButton = new JRadioButton("Shellsort");
        insercionButton = new JRadioButton("Insercion");
        seleccionAlgoritmo.add(shellsortButton);
        seleccionAlgoritmo.add(insercionButton);
        
        // Crea una instancia de la clase CreadorDeObjectParaTable para luego utilizar sus metodos en el boton "Agregar"
        CreadorDeObjectParaTable creadorDeObjectParaTable = new CreadorDeObjectParaTable();
        jScrollPane1 = new JScrollPane();      
        tenistasTabla = new JTable();
        jScrollPane1.setViewportView(tenistasTabla);
        TableModel modelo = new DefaultTableModel();
        
        
        
        // Despues de ingresar los datos en los espacios, al precionar el boton "Agregar" estos datos se almacenan en un ArrayList
        agregarBot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                do {     // Loop while en caso de que se atrape una excepcion se debe pedir los datos al usuario nuevamente.            
                    try {
                        // Estas asignaciones evitan que el programa invoque al metodo getText() cada vez que se ocupa leer los datos ingresados 
                        nombre = nombreTex.getText();
                        pais = paisTex.getText();
                        edad = Integer.parseInt(edadTex.getText());
                        puntaje = Integer.parseInt(puntajeTex.getText());

                        // se crea un tenista 
                        Tenista tenista = new Tenista(nombre, pais, edad, puntaje);

                        // se agrega el tenista a la lista por medio de la funcion
                        creadorDeObjectParaTable.agregarTenistaALista(tenista);

                        x=2; // Si el try se completo exitosamente, el loop while se termina. 
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
       
        // el boton lista original muestra en la tabla, la lista de tenistas antes de ser modificada por los algoritmos de ordenamiento. 
        listaOriginalBot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                do {
                    try {
                       Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                       
                       // esta linea invoca al metodo cambiaArrayListAObject() de creadorDeObjectParaTable 
                       // para que éste tome los elementos del ArrayList y los acomode en un Object [][]
                       // debido a que se necesita este formato para popular la tabla JTable tenistasTabla.                      
                       creadorDeObjectParaTable.cambiaArrayListAObject();
                       
                       // La clase TableModel crea al modelo para ser asignado a la tabla y asi llenarla. 
                       TableModel modelo = new DefaultTableModel(
                               creadorDeObjectParaTable.getObjectParaTabla(),
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
        
        // El boton ordenPorEdad o "- a + Edad" toma la lsita y la ordena en forma descendente segun la edad de cada tenista. 
        ordenPorEdad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                do {
                    try {
                        
                        
                       // Antes de ordenar la tabla, el usuario debe seleccionar en el JRadioBotton 
                       // el algoritmo de ordenacion que desea utilizar, las opciones son Shellsort e Insercion 
                       // si el usuario selecciona shellsort ingresa a este if y las funciones se basan en shellsort
                       
                       if (shellsortButton.isSelected()){
                        // crea una instancia de la clase OrdenadorShellsort para usar sus funciones. 
                        OrdenadorShellsort ordenadorShellsort = new OrdenadorShellsort();  
                        // invoca al metodo OrdenarShellsortEdad y pasa la lista de tenistas proveniente de la clase creadorDeObjectParaTable.
                        ordenadorShellsort.OrdenarShellsortEdad(creadorDeObjectParaTable.getListaTenistasOriginal());

                        // La clase OrdenadorShellsort contiene el metodo cambiaArrayListAObject para cambiar los datos de ArrayList a Object [][] para agregarlos a la tabla. 
                        ordenadorShellsort.cambiaArrayListAObject();
                        
                        Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                        TableModel modelo = new DefaultTableModel(
                                ordenadorShellsort.cambiaArrayListAObject(),
                                nombreColumnas);
                        tenistasTabla.setModel(modelo); 
                        
                        
                         // si el usuario selecciona insercion ingresa a este if y las funciones se basan en insercion
                       }if (insercionButton.isSelected()){
                           
                            OrdenadorPorInsercion ordenadorPorInsercion = new OrdenadorPorInsercion();  
                            ordenadorPorInsercion.OrdenarPorInsercionEdad(creadorDeObjectParaTable.getListaTenistasOriginal());

                            ordenadorPorInsercion.cambiaArrayListAObject();
                            
                            Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                            TableModel modelo = new DefaultTableModel(
                                    ordenadorPorInsercion.cambiaArrayListAObject(),
                                    nombreColumnas);
                       
                       tenistasTabla.setModel(modelo); 
                       
                       }

                       x=2;
                   }catch(IndexOutOfBoundsException indexOutOfBoundsException) {

                        JOptionPane.showMessageDialog(null,
                                "Ha ingresado menos de 15 tenistas");
                   }                               
                }while(x==0);
            }
        });
        
         // El boton ordenPorPuntaje o "+ a - Puntaje" toma la lista y la ordena en forma ascendente segun la edad de cada tenista. 
         
        ordenPorPuntaje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                do {               
                    try {
                       // si el usuario selecciona shellsort ingresa a este if y las funciones se basan en shellsort
                        if (shellsortButton.isSelected()){
                            OrdenadorShellsort ordenadorShellsort = new OrdenadorShellsort();  
                            ordenadorShellsort.OrdenarShellsortPuntaje(creadorDeObjectParaTable.getListaTenistasOriginal());

                            ordenadorShellsort.cambiaArrayListAObject();
                            Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                            TableModel modelo = new DefaultTableModel(
                                    creadorDeObjectParaTable.cambiaArrayListAObject(),
                                    nombreColumnas);
                            tenistasTabla.setModel(modelo); 

                         // si el usuario selecciona insercion ingresa a este if y las funciones se basan en insercion
                       }if (insercionButton.isSelected()){
                           
                            OrdenadorPorInsercion ordenadorPorInsercion = new OrdenadorPorInsercion();  
                            ordenadorPorInsercion.OrdenarPorInsercionPuntaje(creadorDeObjectParaTable.getListaTenistasOriginal());

                            ordenadorPorInsercion.cambiaArrayListAObject();
                            Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                            TableModel modelo = new DefaultTableModel(
                                    creadorDeObjectParaTable.cambiaArrayListAObject(),
                                    nombreColumnas);
                       
                            tenistasTabla.setModel(modelo); 
                       }
                       
                       x=2;
                   }catch(IndexOutOfBoundsException indexOutOfBoundsException) {

                        JOptionPane.showMessageDialog(null,
                                "Ha ingresado menos de 15 tenistas");
                   }                               
                }while(x==0);
            }
        });
        
        // El boton ordenPorPais o "Alfabeticamente por Pais" toma la lista y la ordena en forma ascendente según el pais de cada tenista. 
        
        ordenPorPais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                do {               
                    try {
                       // si el usuario selecciona shellsort ingresa a este if y las funciones se basan en shellsort
                        if (shellsortButton.isSelected()){
                            OrdenadorShellsort ordenadorShellsort = new OrdenadorShellsort();  
                            ordenadorShellsort.OrdenarShellsortPais(creadorDeObjectParaTable.getListaTenistasOriginal());

                            ordenadorShellsort.cambiaArrayListAObject();
                            Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                            TableModel modelo = new DefaultTableModel(
                                    creadorDeObjectParaTable.cambiaArrayListAObject(),
                                    nombreColumnas);

                            tenistasTabla.setModel(modelo); 

                         // si el usuario selecciona insercion ingresa a este if y las funciones se basan en insercion
                        }if (insercionButton.isSelected()){
                           
                            OrdenadorPorInsercion ordenadorPorInsercion = new OrdenadorPorInsercion();  
                            ordenadorPorInsercion.OrdenarPorInsercionPais(creadorDeObjectParaTable.getListaTenistasOriginal());

                            ordenadorPorInsercion.cambiaArrayListAObject();
                            Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
                            TableModel modelo = new DefaultTableModel(
                                    creadorDeObjectParaTable.cambiaArrayListAObject(),
                                    nombreColumnas);
                       
                       tenistasTabla.setModel(modelo);                       
                       }                       
                       x=2;
                   }catch(IndexOutOfBoundsException indexOutOfBoundsException) {

                        JOptionPane.showMessageDialog(null,
                                "Ha ingresado menos de 15 tenistas");
                   }                               
                }while(x==0);
            }
        });

        // Esta seccion de codigo acomoda los elementos de la interfaz grafica en su lugar. 
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
                    .addComponent(shellsortButton)
                    .addComponent(insercionButton)
                    .addComponent(ordenPorEdad)
                    .addComponent(listaOriginalBot)
                    .addComponent(ordenPorPuntaje)
                    .addComponent(ordenPorPais))
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
                .addComponent(shellsortButton)
                .addComponent(insercionButton)
                .addComponent(listaOriginalBot)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordenPorEdad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ordenPorPuntaje)
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(ordenPorPais))
        );
        pestanas.addTab("Lista Tenistas", jPanel1);
    }

    public static void main(String[] args) {
        Principal inter = new Principal();
        inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inter.setSize(800, 580);
        inter.setVisible(true);
    }

    @Override
    public String toString() {
        return nombre + " , " + pais + " , " + edad + " , " + puntaje;
    }

}
