
import java.util.ArrayList;

public class CreadorDeObjectParaTable {
    public CreadorDeObjectParaTable(){};
     int x=0;
    
    // crea una instancia de la clase Object [][] para colocar aqui los datos del ArrayList de tenistas
    Object objectParaTabla[][] = new Object[15][4];
  
    ArrayList<Tenista> listaTenistasOriginal = new ArrayList<Tenista>();
   
    // Funcion simple que agrega los objetos de tipo tenista al arrayList. 
    public void agregarTenistaALista( Tenista tenista){   
           listaTenistasOriginal.add(tenista);
   }
  
    // Esta funcion recorre el ArrayList y lo coloca en el Object[][]
    public Object[][] cambiaArrayListAObject(){ 
       for (int i=0; i<15; i++){  
            for (int j=0; j<4; j++){  
              if (x == 0){
                objectParaTabla[i][j]  = (listaTenistasOriginal.get(i)).getNombre();
              }  if (x == 1){
                 objectParaTabla[i][j] = (listaTenistasOriginal.get(i)).getPais();
              }if (x == 2){
                objectParaTabla[i][j]  = (listaTenistasOriginal.get(i)).getEdad();
              }if (x == 3){
                 objectParaTabla[i][j] = (listaTenistasOriginal.get(i)).getPuntaje();
              }
            x++;     
            }
            x=0;
         }
       return objectParaTabla;
    }
 
    
    public Object[][] getObjectParaTabla(){     
    return objectParaTabla;
    }
    public void setObjectParaTabla(Object[][] objectParaTabla){
        this.objectParaTabla = objectParaTabla;
    }  
   
    public ArrayList<Tenista> getListaTenistasOriginal(){  
        return listaTenistasOriginal;
    }
    public void setListaTenistasOriginal(ArrayList<Tenista>listaTenistasOriginal){
        this.listaTenistasOriginal = listaTenistasOriginal;
    }  
}
