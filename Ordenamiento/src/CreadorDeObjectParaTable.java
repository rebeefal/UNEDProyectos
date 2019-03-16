
import java.util.ArrayList;

public class CreadorDeObjectParaTable {

    public CreadorDeObjectParaTable(){};
   int x=0;
    
    Object objectParaTabla[][] = new Object[8][4];
    
    Object objectParaTablaOriginal[][]=new Object[8][4];
    
    ArrayList<Tenista> listaTenistas = new ArrayList<Tenista>();
   
    public void agregarTenistaALista( Tenista tenista){   
           listaTenistas.add(tenista);
   }
  
    public Object[][] cambiaArrayListAObject(){
    
       for (int i=0; i<8; i++){  
            for (int j=0; j<4; j++){  
              if (x == 0){
                objectParaTabla[i][j]  = (listaTenistas.get(i)).getNombre();
              }  if (x == 1){
                 objectParaTabla[i][j] = (listaTenistas.get(i)).getPais();
              }if (x == 2){
                objectParaTabla[i][j]  = (listaTenistas.get(i)).getEdad();
              }if (x == 3){
                 objectParaTabla[i][j] = (listaTenistas.get(i)).getPuntaje();
              }
            x++;     
            }
            x=0;
         }
       
       objectParaTablaOriginal = objectParaTabla;
       return objectParaTabla;
    }

    
    public Object[][] getObjectParaTablaOriginal(){     
        return objectParaTablaOriginal;
    }

    public void setObjectParaTablaOriginal(Object[][] objectParaTablaOriginal){
        this.objectParaTablaOriginal = objectParaTablaOriginal;
    }        
            
            
   
    public ArrayList<Tenista> getListaTenistas(){
        
        return listaTenistas;
    }

    public void setListaTenistas(ArrayList<Tenista>listaTenistas){
        this.listaTenistas = listaTenistas;
    }

    
}
