
// Clase Tenista, contiene  los atributos de los tenistas

public class Tenista {
    
    private int edad, puntaje;
    private String nombre, pais;   
    
    public Tenista(String nombre, String pais, int edad, int puntaje){
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
        this.puntaje = puntaje;
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
           
} 