
import java.util.ArrayList;

public class OrdenadorShellsort{
  
    public OrdenadorShellsort(){};
    
    Object objectParaTabla[][] = new Object[5][4];
    int x=0;
    
    ArrayList<Tenista> listaTenistasOrdenada;
   
    public ArrayList OrdenarShellsortEdad ( ArrayList<Tenista> listaTenistas){
        
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){
                for (int i=gap; i<listaTenistas.size();i++){
                    int tmp = ((listaTenistas.get(i)).getEdad());                   
                    Tenista temporal = listaTenistas.get(i);                                    
                    int j;
                    for (j=i; j >= gap && (((listaTenistas.get(i-gap)).getEdad())) < tmp; j -=gap){                        
                           listaTenistas.set(j,(listaTenistas.get(j-gap))); 
                    }                             
                    listaTenistas.set(j, temporal);
                }
            }           
            listaTenistasOrdenada = listaTenistas;           
            return listaTenistasOrdenada; // lista ordenada
    }
    
    public ArrayList OrdenarShellsortPuntaje ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){
                    int tmp = ((listaTenistas.get(i)).getPuntaje());
                    Tenista temporal = listaTenistas.get(i);
               
                    int j=i;
                    for (; j >= gap &&  (((listaTenistas.get(i-gap)).getPuntaje())) > tmp; j -=gap){
  
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));
                    }
                    listaTenistas.set(j, temporal);
                }
            }           
            listaTenistasOrdenada = listaTenistas;           
            return listaTenistasOrdenada; // lista ordenada
    }
   
    
    
     public ArrayList OrdenarShellsortPais ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){
                    int tmp = ConvertidoStringPaisAscii(((listaTenistas.get(i)).getPais())); 
                    Tenista temporal = listaTenistas.get(i);
                    int j=i;
                    for (; j >= gap &&  ConvertidoStringPaisAscii(((listaTenistas.get(i-gap)).getPais())) > tmp; j -=gap){
  
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));   
                    }
                    listaTenistas.set(j,temporal);
                }
            }           
            listaTenistasOrdenada = listaTenistas;           
            return listaTenistasOrdenada; // lista ordenada
    }
 
    public int ConvertidoStringPaisAscii(String nombrePais){        
            char[] letras = (nombrePais).toCharArray();
            int primeraLetraValorAscii = Character.getNumericValue(letras[0]);
        return primeraLetraValorAscii;      
    }
    
        public Object[][] cambiaArrayListAObject(){

              for (int i=0; i<5; i++){  
                   for (int j=0; j<4; j++){                
                     if (x == 0){
                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getNombre();
                        System.out.print( "Entro al if  "+ objectParaTabla[i][j]+" \n");
                     }  if (x == 1){
                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPais();
                        System.out.print("Entro al if  "+ objectParaTabla[i][j]+" \n");
                     }if (x == 2){
                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getEdad();
                        System.out.print("Entro al if  "+ objectParaTabla[i][j]+" \n");
                     }if (x == 3){
                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPuntaje();    
                        System.out.print( "Entro al if  "+ objectParaTabla[i][j]);
                     }
                   x++;     
                   }
                   x=0;
                }
              return objectParaTabla;
           }
      
        public ArrayList<Tenista> getListaTenistasOrdenada(){
            return listaTenistasOrdenada;
        };
        public void setListaTenistasOrdenada(ArrayList<Tenista>listaTenistasOrdenada){
            this.listaTenistasOrdenada = listaTenistasOrdenada;
        };
}


