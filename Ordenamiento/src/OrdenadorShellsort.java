
import java.util.ArrayList;

public class OrdenadorShellsort{
  
    public OrdenadorShellsort(){};
    
    Object objectParaTabla[][] = new Object[8][4];
    int x=0;
    
    ArrayList<Tenista> listaTenistasOrdenada;
    
    
    public ArrayList OrdenarShellsortEdad ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){

                    int tmp = ((listaTenistas.get(i)).getEdad());
                    //System.out.print((listaTenistas.get(i))+"\n");
                    int j=i;
                    for (; j >= gap && tmp <(((listaTenistas.get(i-gap)).getEdad()))?true:false; j -=gap){
  
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));
                           
                            //System.out.print( "Entro al for \n");
                    }
                    listaTenistas.set(j, (listaTenistas.get(i)));
                }
            }           
            listaTenistasOrdenada = listaTenistas;           
            return listaTenistasOrdenada; // lista ordenada
        }
    
    public ArrayList OrdenarShellsortPuntaje ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){

                    int tmp = ((listaTenistas.get(i)).getEdad());
                    //System.out.print((listaTenistas.get(i))+"\n");
                    int j=i;
                    for (; j >= gap && tmp <(((listaTenistas.get(i-gap)).getEdad()))?true:false; j -=gap){
  
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));
                           
                            //System.out.print( "Entro al for \n");
                    }
                    listaTenistas.set(j, (listaTenistas.get(i)));
                }
            }           
            listaTenistasOrdenada = listaTenistas;           
            return listaTenistasOrdenada; // lista ordenada
    }
     public ArrayList OrdenarShellsortPais ( ArrayList<Tenista> listaTenistas){           
            for (int gap =(listaTenistas.size()/2); gap > 0; gap = gap ==2?1:(int)(gap/2.2)){  
                for (int i=gap; i<listaTenistas.size();i++){

                    int tmp = ((listaTenistas.get(i)).getEdad());
                    //System.out.print((listaTenistas.get(i))+"\n");
                    int j=i;
                    for (; j >= gap && tmp <(((listaTenistas.get(i-gap)).getEdad()))?true:false; j -=gap){
  
                           listaTenistas.set(j,(listaTenistas.get(j-gap)));
                           
                            //System.out.print( "Entro al for \n");
                    }
                    listaTenistas.set(j, (listaTenistas.get(i)));
                }
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


