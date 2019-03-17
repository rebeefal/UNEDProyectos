
import java.util.ArrayList;

public class OrdenadorShellsort{
  
    public OrdenadorShellsort(){};
    
    Object objectParaTabla[][] = new Object[15][4];
    int x=0; 
    ArrayList<Tenista> listaTenistasOrdenada;
   
    //Funcion para odenar por edad con el algoritmo shellsort. 
    public void OrdenarShellsortEdad ( ArrayList<Tenista> listaTenistas){           
        //for (int k=0;k<2;k++){
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){
                
                    for (int i=gap; i<listaTenistas.size();i++){
                        
                        int tmp = ((listaTenistas.get(i)).getEdad());    
                        
                        Tenista temporal = listaTenistas.get(i);      
                        
                        int j=i;
                        
                        for (; j >= gap && (((listaTenistas.get(i-gap)).getEdad())) < tmp; j -=gap)  // Si la edad del elemento de la lista que se encuentra en i-gap es menor a tmp, entra al for y realiza el cambio y coloca el tenista en ese lugar.                      
                               listaTenistas.set(j,(listaTenistas.get(j-gap)));   // coloca el tenista de j-gap en la posicion j.   
                        
                        listaTenistas.set(j, temporal); // en la posicion j coloca el valor de temporal. 
                    }
            }
       // }
            listaTenistasOrdenada = listaTenistas;           
            //return listaTenistasOrdenada; // lista ordenada
    }
    
    // Funcion que ordena los elementos de forma ascendente segun puntaje.
    public void OrdenarShellsortPuntaje ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){
                    int tmp = ((listaTenistas.get(i)).getPuntaje());
                    Tenista temporal = listaTenistas.get(i);            
                    int j=i;
                    for (; j >= gap &&  (((listaTenistas.get(i-gap)).getPuntaje())) > tmp; j -=gap)  // Esta funcion tiene la misma logica de la anterior, la diferencia es que al llegar a este for, si la posicion p-1 es mayor, que tmp se cumple y entra al for a realizar el cambio, esto es porque el orden es ascendente.    
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));
                    
                    listaTenistas.set(j, temporal);
                }
            }           
            listaTenistasOrdenada = listaTenistas;           
            //return listaTenistasOrdenada; // lista ordenada
    }

    // Funcion que ordena los elementos de forma alfabetica ascendente segun pais.
     public void  OrdenarShellsortPais ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){
                    int tmp = ConvertidoStringPaisAscii(((listaTenistas.get(i)).getPais()));  // invoca al metodo ConvertidoStringPaisAscii para obtener el valor ASCII del nombre del pais. y asi lograr ordenarlos de forma ascendente. 
                    Tenista temporal = listaTenistas.get(i);
                    int j=i;
                    for (; j >= gap &&  ConvertidoStringPaisAscii(((listaTenistas.get(i-gap)).getPais())) > tmp; j -=gap)
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));   
                    
                    listaTenistas.set(j,temporal);   
                }
            }
            listaTenistasOrdenada = listaTenistas;           
           // return listaTenistasOrdenada; // lista ordenada
     }
     
    // esta funcion toma el nombre del pais y devuelve el valor ASCII de la primera letra del nombre. 
    public int ConvertidoStringPaisAscii(String nombrePais){        
            char[] letras = (nombrePais).toCharArray();
            int primeraLetraValorAscii = Character.getNumericValue(letras[0]);
        return primeraLetraValorAscii;      
    }
        // coloca los datos del ArrayList al Object[][] para pasarlos a la tabla. 
        public Object[][] cambiaArrayListAObject(){
              
              for (int i=0; i<15; i++){  
                   for (int j=0; j<4; j++){                
                     if (x == 0){
                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getNombre();
                       
                     }  if (x == 1){
                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPais();
                       
                     }if (x == 2){
                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getEdad();
                        
                     }if (x == 3){
                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPuntaje();    
                       
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


