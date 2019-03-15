
import java.util.ArrayList;

public class CreadorDeObjectParaTable {

    public CreadorDeObjectParaTable(){};
    
    
    Object objectParaTabla[][] = new Object[15][4];
    ArrayList<Tenista> listaTenistas = new ArrayList<Tenista>();
   
    public void agregarTenistaALista( Tenista tenista){   
           listaTenistas.add(tenista);
   }
  
    
    
    //*******************88 AAREGLAR ESTE FOR LOOP
    public Object[][] cambiaArrayListAObject(){

       for (int i=0; i<15; i++){  
            for (int j=0; j<4; j++){  
              if (j == 0){
                objectParaTabla[j][i]  = (listaTenistas.get(i)).getNombre();
              }  if (j == 1){
                 objectParaTabla[j][i]  = (listaTenistas.get(i)).getPais();
              }if (j == 2){
                objectParaTabla[j][i]  = (listaTenistas.get(i)).getEdad();
              }if (j == 4){
                 objectParaTabla[j][i]  = (listaTenistas.get(i)).getPuntaje();
              }
            System.out.print("La lista del for loop va " +  objectParaTabla[j][i] + "\n");
               
            }
         }
       return objectParaTabla;
    }
    //************************ AAREGLAR ESTE FOR LOOP
    
    
    //System.out.print("La lista del for loop va" +  objectParaTabla[i][j]);
    
    
}
