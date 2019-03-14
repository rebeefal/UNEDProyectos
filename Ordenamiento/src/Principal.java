
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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame {
    
          
         int edad, puntaje, x;
         String nombre, pais;
    
    
        JPanel panel;
    
 
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
        JLabel opcionesOrdenamiento; 
        
        
        JTable tenistasTabla;
        String[] nombreColumnas = {"Nombre",
                        "Pais",
                        "Edad",
                        "Puntaje"};
      
        String[] data; 
        
        
         
        JTextArea listaOriginal;
        
     
        private GridBagLayout esquema;
        private GridBagConstraints restricciones;
     
        
        //Tenista tenistas = new Tenista();
        
        
        
        
        
        
        
        

    
    public Principal (){
        //Dentro de este constructor se van a crear los elementos del GUI    

        
        JTabbedPane pestanas = new JTabbedPane();
        add(pestanas);
    
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(208,171,171));


        GridBagLayout esquema = new GridBagLayout();
        esquema.getLayoutOrigin();
        restricciones = new GridBagConstraints();
	panel.setLayout(esquema);
        
        
        nombreEti = new JLabel( "Nombre");
        nombreEti.setFont(new Font("Arial",Font.BOLD, 12));
        nombreEti.setForeground(new Color(77,66,74));

        paisEti = new JLabel("País");
        paisEti.setFont(new Font("Arial",Font.BOLD, 12));
        paisEti.setForeground(new Color(77,66,74));

        edadEti = new JLabel("Edad");
        edadEti.setFont(new Font("Arial",Font.BOLD, 12));
        edadEti.setForeground(new Color(77,66,74));

        puntajeEti = new JLabel("Puntaje");
        puntajeEti.setFont(new Font("Arial",Font.BOLD, 12));
        puntajeEti.setForeground(new Color(77,66,74));
        
        nombreTex = new JTextField (10);
        nombreTex.setBackground(Color.white);

        paisTex  = new JTextField (10);
        paisTex.setBackground(Color.white);
        edadTex  = new JTextField (10);
        edadTex.setBackground(Color.white);
        puntajeTex  = new JTextField (10);    
        puntajeTex.setBackground(Color.white);

        agregarBot  = new JButton ("Agregar");
        agregarBot.setPreferredSize(new Dimension(90, 30));
	agregarBot.setBackground(new Color(170,175,182));
        
        listaOriginalBot = new JButton ("Original");
        listaOriginalBot.setPreferredSize(new Dimension(90, 30));
	listaOriginalBot.setBackground(new Color(170,175,182));
            
        opcion1Bot  = new JButton ("Opcion 1");
        opcion1Bot.setPreferredSize(new Dimension(90, 30));
	opcion1Bot.setBackground(new Color(170,175,182));
        
        opcion2Bot  = new JButton ("Opcion 2");  
        opcion2Bot.setPreferredSize(new Dimension(90, 30));
	opcion2Bot.setBackground(new Color(170,175,182));
                
        opcion3Bot  = new JButton ("Opcion 3");  
        opcion3Bot.setPreferredSize(new Dimension(90, 30));
	opcion3Bot.setBackground(new Color(170,175,182));
        
        
        listaOriginal = new JTextArea();
        listaOriginal.setSize(30, 30);
        
        
        String algoritmoOrdenamiento[] = {"Shellsort", "Quicksort"};
        algoritmoLista = new JList(algoritmoOrdenamiento);
        algoritmoLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        algoritmoLista.setVisibleRowCount(3);

        algoritmoLista.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoLista.setForeground(new Color(77,66,74));
        algoritmoLista.setBackground(new Color(170,175,182));

        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));
        
        
        opcionesOrdenamiento = new JLabel(" Opcion 1. Mostrar tenistas ordenados en forma descendente según puntaje \n "
                + "Opcion 2. Mostrar tenistas ordenados en forma ascendente según edad. \n"
                + "Opcion 3. Mostrar tenistas ordenados alfabéticamente en forma ascendente según su país.");
 
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));
        
        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));
        
        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));
        
        
        ArrayList<Tenista> listaTenistas = new ArrayList<Tenista>();
        
 
        agregarBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
       
             do{                  
                try {
                    
                    nombre = nombreTex.getText();
                    pais = paisTex.getText();
                    edad = Integer.parseInt(edadTex.getText());
                    puntaje = Integer.parseInt(puntajeTex.getText());     
                      
                    //arrayTenista[i++] = new Tenista(nombre, pais, edad, puntaje);
                    

                    //crea un obeto de tipo tenista cada vez que preciona el boton agregar
                    Tenista tenista = new Tenista(nombre, pais, edad, puntaje);    
                    
                    //El tenista que se ha agregado se coloca en la lista ArrayList, como se ha definido fuera del ActionListener debe de recordar los elementos agregados anteriormente
                    listaTenistas.add(tenista);
                 
                    
                   
                   // tenistasTabla = new JTable(listaTenistas, nombreColumnas);
                    
               
                x=2;
                                                   
                }catch(NumberFormatException numberFormatException ){
                
                    JOptionPane.showMessageDialog(null, 
                            "El valor ingresado no es válido");                    
                }catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException ){
                
                    JOptionPane.showMessageDialog(null, 
                            "El límite de tenistas se ha alcanzado");                    
                }  
                              
            }while (x==1);                          
            }   
        });
        
           
        listaOriginalBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
                
               // listaTenistasTabla = new JTable (arregloTenistas, nombreColumnas);
         }
        });
        
          
        agregarComponente(  0, 0, 1, 1 );
        panel.add(nombreEti, restricciones);
        agregarComponente( 1 , 0, 1, 1 );
        panel.add(nombreTex, restricciones);
        agregarComponente(  0, 1, 1, 1 );
        panel.add(paisEti, restricciones);
        agregarComponente(  1, 1, 1, 1  );
        panel.add(paisTex, restricciones);
        agregarComponente(  0, 2, 1, 1  );
        panel.add(edadEti, restricciones);
        agregarComponente(  1, 2, 1, 1 );
        panel.add(edadTex, restricciones);
        agregarComponente(  0, 3, 1, 1 );
        panel.add(puntajeEti, restricciones);
        agregarComponente(  1, 3, 1, 1  );
        panel.add(puntajeTex, restricciones);
        agregarComponente(  0, 4, 1, 1 );
        panel.add(agregarBot, restricciones); 
        agregarComponente(  3, 0, 1, 1  );
        panel.add(algoritmoListaEtiqueta, restricciones);
        agregarComponente(  4, 0, 1, 1  );
        panel.add(algoritmoLista, restricciones);
        agregarComponente(  4, 2, 1, 1 );
        panel.add(opcion1Bot, restricciones);
        agregarComponente(  5, 2, 1, 1  );
        panel.add(opcion2Bot, restricciones);
        agregarComponente(  6, 2, 1, 1  );
        panel.add(opcion3Bot, restricciones); 
        agregarComponente(  3, 4, 1, 1  );
        panel.add(opcionesOrdenamiento, restricciones);
        agregarComponente(  7, 0, 1, 1  );
        panel.add(tenistasTabla, restricciones);
 
  
        pestanas.addTab("Lista Tenistas", panel);
       
    }
    
   
   
    public static void main (String[] args ){
        Principal inter = new Principal();		
	inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	inter.setSize(1000,1000);
	inter.setVisible(true);
     
    }
    
    
    private void agregarComponente( 
        int fila, int columna, int anchura, int altura )
         {
         restricciones.gridx = columna; // establece gridx
         restricciones.gridy = fila; // establece gridy
         restricciones.gridwidth = anchura; // establece gridwidth
         restricciones.gridheight = altura; // establece gridheight
         }
	  
    
    @Override
    public String toString(){
        return nombre+ " , " + pais+ " , "+ edad+ " , "+ puntaje;  
    }
      
}


