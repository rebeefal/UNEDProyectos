
import java.util.ArrayList;

public class CreadorDeObjectParaTable {

    public CreadorDeObjectParaTable(){};
   int x=0, y=0; 
    
    Object objectParaTabla[][] = new Object[5][4];
    ArrayList<Tenista> listaTenistas = new ArrayList<Tenista>();
   
    public void agregarTenistaALista( Tenista tenista){   
           listaTenistas.add(tenista);
   }
  
    public Object[][] cambiaArrayListAObject(){
    
       for (int i=0; i<5; i++){  
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
            System.out.print(objectParaTabla[i][j] + "  ");
            }
            System.out.print("\n");
            x=0;
         }
       return objectParaTabla;
    }
   
    
    
    //System.out.print("La lista del for loop va" +  objectParaTabla[i][j]);
    
    
}
