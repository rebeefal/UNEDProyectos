
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
        JButton shellsortBot;
        JButton quicksortBot;
        
        
        JTextArea listaOriginal;
        
        
        private GridBagLayout esquema;
        private GridBagConstraints restricciones;
        
        int i=0;
        
        Tenista[] arrayTenista = new Tenista[4];

    
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
            
        shellsortBot  = new JButton ("Shellsort");
        shellsortBot.setPreferredSize(new Dimension(90, 30));
	shellsortBot.setBackground(new Color(170,175,182));
        
        quicksortBot  = new JButton ("Quicksort");  
        quicksortBot.setPreferredSize(new Dimension(90, 30));
	quicksortBot.setBackground(new Color(170,175,182));
                
        listaOriginal = new JTextArea();
        listaOriginal.setSize(30, 30);
        
      
       
  
        
        agregarBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
                        
               
             do{                  
                try {
                    
                    nombre = nombreTex.getText();
                    pais = paisTex.getText();
                    edad = Integer.parseInt(edadTex.getText());
                    puntaje = Integer.parseInt(puntajeTex.getText());     
                    
                       
                    arrayTenista[i++] = new Tenista(nombre, pais, edad, puntaje);
                    
                    
                    
                                        
                   // arreglodetenista[i++] = new Tenista(nombre, pais, edad, puntaje);
                    //tenista.agregaTenista(nombre, pais, edad, puntaje);
                    
                    
                    
                    
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
                
                //tenista.leeListaTenista();              
                //listaOriginal.setText(tenista.getListaOriginal());
         }
        });
        
        shellsortBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
                
                
             // for (int j = 0; j < 4; j++){
               // arrayTenista[j].imprimeArrayTenistas(arrayTenista);
              //}  
              
             Arrays.sort(arrayTenista);
              
              
            arrayTenista[0].imprimeArrayTenistas(arrayTenista);
                
         }
        });
        
        
        quicksortBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
               
            
                         
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
        agregarComponente(  2, 1, 1, 1 );
        panel.add(agregarBot, restricciones); 
        agregarComponente(  3, 1, 1, 1 );
        panel.add(listaOriginalBot, restricciones);
        agregarComponente(  3, 2, 1, 1 );
        panel.add(shellsortBot, restricciones);
        agregarComponente(  3, 3, 1, 1  );
        panel.add(quicksortBot, restricciones);
       agregarComponente(  4, 2, 1, 1  );
        panel.add(listaOriginal, restricciones);
        

        pestanas.addTab("Lista Tenistas", panel);
        
        
    }
    
    
    static class Tenista implements Comparable<Tenista> {
        
        public int edad, puntaje, tamano;
        public String nombre, pais; 
    

        public Tenista(){};

        public Tenista(String nombre, String pais, int edad, int puntaje){
            this.nombre = nombre;
            this.pais = pais;
            this.edad = edad;
            this.puntaje = puntaje;
        }
        
        @Override
         public int compareTo(Tenista o){
        if (edad < o.edad){
            return -1;
        }
        if (edad > o.edad){
            return 1;
        }
        return 0; 
        }
        
        
        static void imprimeArrayTenistas(Tenista[] array) {
            for (int j = 0; j < array.length; j++) {
                System.out.println((j+1) + " Nombre " + array[j].nombre + " - Pais: " + array[j].pais + " - Edad: " + array[j].edad + " - Puntaje: " + array[j].puntaje);
            }
        }
        
        
    
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


