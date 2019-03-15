
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;


// Clase Tenista, contiene  los atributos de los tenistas

public class Tenista  implements Comparable<Tenista> {
    
    private int edad, puntaje, tamano;
    private String nombre, pais, listaOriginal;       
    Object[] object;
 
    
    public Tenista(){};
      
    public Tenista(String nombre, String pais, int edad, int puntaje){
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.puntaje = puntaje;
    }
  
    public Object[] cambiaArrayListAObject(ArrayList arreglo){
  
      //(arreglo.get(1)).getNombre();

       return object;
    }
    
    
            
    public Object[] getObject(){
        return object;
    }
    public void setObject (Object[] object){
        this.object = object;
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
         
} 