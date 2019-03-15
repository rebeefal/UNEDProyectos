
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
    
        JLabel opcionesOrdenamientoOpcion1;
        JLabel opcionesOrdenamientoOpcion2;
        JLabel opcionesOrdenamientoOpcion3;
        
       
        
        JTable tenistasTabla; 
      
        
     
        private GridBagLayout esquema;
        private GridBagConstraints restricciones;
     

    
    public Principal (){
        //Dentro de este constructor se van a crear los elementos del GUI    

        
        JTabbedPane pestanas = new JTabbedPane();
        add(pestanas);
    
        
        JPanel panel = new JPanel();
       // panel.setBackground(new Color(208,171,171));


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
   
        opcionesOrdenamientoOpcion1 = new JLabel("Opcion 1. Mostrar tenistas ordenados en forma descendente según puntaje \n");
        opcionesOrdenamientoOpcion2 = new JLabel("Opcion 2. Mostrar tenistas ordenados en forma ascendente según edad. \n ");      
        opcionesOrdenamientoOpcion3 = new JLabel("Opcion 3. Mostrar tenistas ordenados alfabéticamente en forma ascendente según su país. \n ");

        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));
        
        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));
        
        algoritmoListaEtiqueta = new JLabel("Algoritmos disponibles");
        algoritmoListaEtiqueta.setFont(new Font("Arial", Font.BOLD, 12));
        algoritmoListaEtiqueta.setForeground(new Color(77,66,74));

        CreadorDeObjectParaTable creadorDeObjectParaTable = new CreadorDeObjectParaTable();
        Object[] nombreColumnas = {"Nombre", "Pais", "Edad", "Puntaje"};
       
        tenistasTabla = new JTable(15,4);
        
        
        agregarBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
       
             do{                  
                try {
                    
                    nombre = nombreTex.getText();
                    pais = paisTex.getText();
                    edad = Integer.parseInt(edadTex.getText());
                    puntaje = Integer.parseInt(puntajeTex.getText());     
                  
                    // creo un tenista 
                    
                    Tenista tenista = new Tenista(nombre,pais,edad,puntaje);
                    
                    // agrego al tenista a la lista por medio de la funcion
                    creadorDeObjectParaTable.agregarTenistaALista(tenista);

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
        
           
        opcion1Bot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
                
               creadorDeObjectParaTable.cambiaArrayListAObject();
               tenistasTabla = new JTable(creadorDeObjectParaTable.cambiaArrayListAObject(), nombreColumnas);
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
        agregarComponente(  4, 0, 1, 1 );
        panel.add(agregarBot, restricciones); 
        agregarComponente(  5, 1, 1, 1  );
        panel.add(algoritmoListaEtiqueta, restricciones);
        agregarComponente(  6, 1, 1, 1  );
        panel.add(algoritmoLista, restricciones);
        agregarComponente(  4, 3, 1, 1 );
        panel.add(opcion1Bot, restricciones);
        agregarComponente(  5, 3, 1, 1  );
        panel.add(opcion2Bot, restricciones);
        agregarComponente(  6, 3, 1, 1  );
        panel.add(opcion3Bot, restricciones); 
//        agregarComponente(  4, 5, 1, 1  );
//        panel.add(opcionesOrdenamientoOpcion1, restricciones);
//        agregarComponente(  5, 5, 1, 1  );
//        panel.add(opcionesOrdenamientoOpcion2, restricciones);
//        agregarComponente(  6, 5, 1, 1  );
//        panel.add(opcionesOrdenamientoOpcion3, restricciones);
        agregarComponente(  7, 5, 1, 1  );
        panel.add(tenistasTabla, restricciones);
 
  
        pestanas.addTab("Lista Tenistas", panel);
       
    }

    public static void main (String[] args ){
        Principal inter = new Principal();		
	inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	inter.setSize(1200,1000);
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


