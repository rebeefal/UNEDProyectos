
import java.util.ArrayList;


public class OrdenadorPorInsercion  {
   
    public OrdenadorPorInsercion(){};
    
    
    Object objectParaTabla[][] = new Object[8][4];
    int x=0;
    
    ArrayList<Tenista> listaTenistasOrdenada;
    
    
    public ArrayList OrdenarPorInsercionEdad( ArrayList<Tenista> listaTenistas){      
        for( int p = 1; p < listaTenistas.size(); p++ ){        
            int tmp = ((listaTenistas.get(p)).getEdad());
            int j = p;
            for( ; j > 0 && tmp <(((listaTenistas.get(j-1)).getEdad()))?true:false; j-- ){               
               listaTenistas.set(j, listaTenistas.get(j-1));    
            }
                
           listaTenistas.set(j,(listaTenistas.get(p)));
        }      
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
    }
  
    public ArrayList OrdenarPorInsercionPuntaje( ArrayList<Tenista> listaTenistas){      
        for( int p = 1; p < listaTenistas.size(); p++ ){        
            int tmp = ((listaTenistas.get(p)).getEdad());
            int j = p;
            for( ; j > 0 && tmp <(((listaTenistas.get(j-1)).getEdad()))?true:false; j-- ){               
               listaTenistas.set(j, listaTenistas.get(j-1));    
            }
                
           listaTenistas.set(j,(listaTenistas.get(p)));
        }      
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
    }
    
    public ArrayList OrdenarPorInsercionPais( ArrayList<Tenista> listaTenistas){      
        for( int p = 1; p < listaTenistas.size(); p++ ){        
            int tmp = ((listaTenistas.get(p)).getEdad());
            int j = p;
            for( ; j > 0 && tmp <(((listaTenistas.get(j-1)).getEdad()))?true:false; j-- ){               
               listaTenistas.set(j, listaTenistas.get(j-1));    
            }
                
           listaTenistas.set(j,(listaTenistas.get(p)));
        }      
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
    }
 
    
    
    
    
    
        //public Object[][] cambiaArrayListAObject(){
        public void cambiaArrayListAObject(){

            for (int i=0; i<8; i++){  
  
                      System.out.print(listaTenistasOrdenada.get(i));
                  }
            
            
//              for (int i=0; i<8; i++){  
//                   for (int j=0; j<4; j++){                
//                     if (x == 0){
//                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getNombre();
//                        System.out.print( "Entro al if  \n"+ objectParaTabla[i][j]);
//                     }  if (x == 1){
//                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPais();
//                        System.out.print("Entro al if  \n"+ objectParaTabla[i][j]);
//                     }if (x == 2){
//                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getEdad();
//                        System.out.print("Entro al if  \n"+ objectParaTabla[i][j]);
//                     }if (x == 3){
//                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPuntaje();    
//                        System.out.print( "Entro al if  \n"+ objectParaTabla[i][j]);
//                     }
//                   x++;     
//                   }
//                   x=0;
//                }
//              return objectParaTabla;
           }
        
        
        public ArrayList<Tenista> getListaTenistasOrdenada(){
            return listaTenistasOrdenada;
        };
        public void setListaTenistasOrdenada(ArrayList<Tenista>listaTenistasOrdenada){
            this.listaTenistasOrdenada = listaTenistasOrdenada;
        };
     
 
    
     
}
