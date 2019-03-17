
import java.util.ArrayList;

public class OrdenadorPorInsercion  {
   
    public OrdenadorPorInsercion(){};
      
    // crea un objeto de tipo Object [][] para ser llenado con los datos despues de ordenarlos. 
    Object objectParaTabla[][] = new Object[15][4];
    int x=0;
    
   // ArrayList de los datos ordenados, se modifica segun la función que sea invocada. 
    ArrayList<Tenista> listaTenistasOrdenada;
      
    //Funcion para odenar por edad con el algoritmo insercion. 
    
    public ArrayList OrdenarPorInsercionEdad( ArrayList<Tenista> listaTenistas){    // recibe la lista de tenistas proveniente de creadorDeObjectParaTable 
        
        for( int p = 1; p < listaTenistas.size(); p++ ){        
            
            int tmp = ((listaTenistas.get(p)).getEdad()); // a tmp se le asigna el valor de la edad que se encuentra en el elemento p de la lista, la edad de ese tenista seleccionado. 
            
            Tenista temporal = listaTenistas.get(p);  // a la variable temporal se le asigna el elemento p de la lista  completo: nombre, pais, edad y puntaje para luego colocarlo en su nueva posicion
            int j=p;          
            for(; j > 0 && (((listaTenistas.get(p-1)).getEdad())) < tmp; j--)  // siempre que j > 0 y el valor de edad del tneista en la posicion anterios sea menor que el valor de la edad del tenista tmp          
               listaTenistas.set(j, listaTenistas.get(j-1));   // si se cumple el for, hay que realizar un movimiento, se coloca en la lista en el espacio j el tenista de temporal. 
           listaTenistas.set(j,temporal);
        }    
        listaTenistasOrdenada = listaTenistas; // se guarda la nueva lista en listaTenistasOrdenada
        return listaTenistasOrdenada; // lista ordenada
    }
 
    // Funcion que ordena los elementos de forma ascendente segun puntaje. 
    public ArrayList OrdenarPorInsercionPuntaje( ArrayList<Tenista> listaTenistas){          
        for( int p = 1; p < listaTenistas.size(); p++ ){                 
            int tmp = ((listaTenistas.get(p)).getPuntaje());
            Tenista temporal = listaTenistas.get(p);              
            int j = p;
            for( ; j > 0 && (((listaTenistas.get(p-1)).getPuntaje())) > tmp; j-- )      // Esta funcion tiene la misma logica de la anterior, la diferencia es que al llegar a este for, si la posicion p-1 es mayor, que tmp se cumple y entra al for a realizar el cambio, esto es porque el orden es ascendente.         
               listaTenistas.set(j, listaTenistas.get(j-1));              
            listaTenistas.set(j,temporal);
        }      
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
    }
    
    // Funcion que ordena los elementos de forma alfabetica ascendente segun pais. 
    
     public ArrayList OrdenarPorInsercionPais( ArrayList<Tenista> listaTenistas){      
        for( int p = 1; p < listaTenistas.size(); p++ ){        
            int tmp = ConvertidoStringPaisAscii(((listaTenistas.get(p)).getPais()));  // invoca al metodo ConvertidoStringPaisAscii para obtener el valor ASCII del nombre del pais. y asi lograr ordenarlos de forma ascendente. 
            Tenista temporal = listaTenistas.get(p);            
            int j = p;           
            for( ; j > 0 && ConvertidoStringPaisAscii(((listaTenistas.get(p-1)).getPais())) > tmp;j-- )              
               listaTenistas.set(j, listaTenistas.get(j-1));       
           listaTenistas.set(j,temporal);
        }         
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
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
        
        // esta funcion toma el nombre del pais y devuelve el valor ASCII de la primera letra del nombre. 
        public int ConvertidoStringPaisAscii(String nombrePais){        
            char[] letras = (nombrePais).toCharArray();
            int primeraLetraValorAscii = Character.getNumericValue(letras[0]);
            return primeraLetraValorAscii;      
        }
                
        public ArrayList<Tenista> getListaTenistasOrdenada(){
            return listaTenistasOrdenada;
        };
        public void setListaTenistasOrdenada(ArrayList<Tenista>listaTenistasOrdenada){
            this.listaTenistasOrdenada = listaTenistasOrdenada;
        };
     
}
