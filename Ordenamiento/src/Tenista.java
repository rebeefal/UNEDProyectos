
import java.util.ArrayList;


// Clase Tenista, contiene  los atributos de los tenistas

public class Tenista {
    
    private int edad, puntaje, tamano;
    private String nombre, pais, listaOriginal;       
    public ArrayList<Object> lista = new ArrayList();
    
    public Tenista(){};
      
    public Tenista(String nombre, String pais, int edad, int puntaje){
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.puntaje = puntaje;
    }
    
    public void agregaTenista( String nombre, String pais, int edad, int puntaje){
        lista.add(nombre +" " +  pais + " " +  edad + " " +  puntaje);
        setTamano(lista.size());
        setListaOriginal( "Nombre  " + "  Pais   " + "  Edad  " + "  Puntaje  " + " \n " );
    }
    
    public void leeListaTenista(){ 
         for(int j=0; j < getTamano(); j++){
              setListaOriginal( listaOriginal + lista.get(j));                                        
            }  
    }
  
    public String getListaOriginal(){
    return listaOriginal;
    }
    public void setListaOriginal (String listaOriginal){
        this.listaOriginal = listaOriginal;
    }
    
    public int getTamano(){
    return tamano;
    }
    public void setTamano (int tamano){
        this.tamano = tamano;
    }
  
    public String getNombre(){
        return nombre;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getPais(){
        return pais;
    }
    public void setPais (String pais){
        this.pais = pais;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getPuntaje(){
        return puntaje;
    }
    public void setPuntaje (int puntaje){
        this.puntaje = puntaje;
    }    
    
    @Override
    public String toString(){
        return nombre+ " , " + pais+ " , "+ edad+ " , "+ puntaje;  
    }
         
} 