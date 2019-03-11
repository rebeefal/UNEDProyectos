
//Clase Principal, se va a utilizar para la clase main y para crear el GUI de la aplicación

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal extends JFrame {
    

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
        JButton shellsortBot;
        JButton quicksortBot;
        
        
        private GridBagLayout esquema;
        private GridBagConstraints restricciones;
        
        
    
    public Principal (){
        //Dentro de este constructor se van a crear los elementos del GUI    

        JPanel panel = new JPanel();
        panel.setBackground(new Color(208,171,171));


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

        paisTex  = new JTextField ();
        paisTex.setBackground(Color.white);
        edadTex  = new JTextField ();
        edadTex.setBackground(Color.white);
        puntajeTex  = new JTextField ();    
        puntajeTex.setBackground(Color.white);

        agregarBot  = new JButton ("Agregar");
        agregarBot.setPreferredSize(new Dimension(90, 30));
	agregarBot.setBackground(new Color(170,175,182));
        
        shellsortBot  = new JButton ("Shellsort");
        shellsortBot.setPreferredSize(new Dimension(90, 30));
	shellsortBot.setBackground(new Color(170,175,182));
        
        quicksortBot  = new JButton ("Quicksort");  
        quicksortBot.setPreferredSize(new Dimension(90, 30));
	quicksortBot.setBackground(new Color(170,175,182));
        
        agregarBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
            
  
                
            }
    
        });
        
        
        shellsortBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
            
  
                
            }
    
        });
        
        quicksortBot.addActionListener(new ActionListener(){
    
            public void actionPerformed (ActionEvent arg0){
               
            }
    
        });
        
        
        
        agregarComponente(  0, 1, 1, 1 );
        panel.add(nombreEti, restricciones);
        agregarComponente( 0 , 2, 1, 1 );
        panel.add(nombreTex, restricciones);
        agregarComponente(  2, 1, 1, 1 );
        panel.add(paisEti, restricciones);
        agregarComponente(  2, 2, 1, 1  );
        panel.add(paisTex, restricciones);
        agregarComponente(  4, 1, 1, 1  );
        panel.add(edadEti, restricciones);
        agregarComponente(  4, 2, 1, 1 );
        panel.add(edadTex, restricciones);
        agregarComponente(  4, 2, 1, 1 );
        panel.add(puntajeEti, restricciones);
        agregarComponente(  4, 1, 1, 1  );
        panel.add(puntajeTex, restricciones);
        agregarComponente(  4, 2, 1, 1 );
        panel.add(agregarBot, restricciones); 
        agregarComponente(  4, 2, 1, 1 );
        panel.add(shellsortBot, restricciones);
        agregarComponente(  4, 1, 1, 1  );
        panel.add(quicksortBot, restricciones);
 
    }
    
    
  
    public static void main (String[] args ){
        Principal inter = new Principal();		
	inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	inter.setSize(700,500);
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
	
}


