
import java.util.ArrayList;

public class OrdenadorPorInsercion  {
   
    public OrdenadorPorInsercion(){};
      
    Object objectParaTabla[][] = new Object[5][4];
    int x=0;
   
    ArrayList<Tenista> listaTenistasOrdenada;
      
    public ArrayList OrdenarPorInsercionEdad( ArrayList<Tenista> listaTenistas){      
       
        for( int p = 1; p < listaTenistas.size(); p++ ){ 
            
            int tmp = ((listaTenistas.get(p)).getEdad());
             Tenista temporal = listaTenistas.get(p);  
            
            int j;
            
            for( j = p; j > 0 && (((listaTenistas.get(p-1)).getEdad())) < tmp; j-- ){               
               listaTenistas.set(j, listaTenistas.get(j-1));    
            }
                
           listaTenistas.set(j,temporal);
        }      
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
    }

    
    public ArrayList OrdenarPorInsercionPuntaje( ArrayList<Tenista> listaTenistas){          
        for( int p = 1; p < listaTenistas.size(); p++ ){                 
            int tmp = ((listaTenistas.get(p)).getPuntaje());
            Tenista temporal = listaTenistas.get(p);              
            int j = p;
            for( ; j > 0 && (((listaTenistas.get(p-1)).getPuntaje())) > tmp; j-- ){               
               listaTenistas.set(j, listaTenistas.get(j-1));    
            }               
         listaTenistas.set(j,temporal);
        }      
        listaTenistasOrdenada = listaTenistas;
        return listaTenistasOrdenada; // lista ordenada
    }
  
    
    public ArrayList OrdenarPorInsercionPais( ArrayList<Tenista> listaTenistas){      
        for( int p = 1; p < listaTenistas.size(); p++ ){        
            int tmp = ConvertidoStringPaisAscii(((listaTenistas.get(p)).getPais())); 
            Tenista temporal = listaTenistas.get(p);            
            int j = p;           
            for( ; j > 0 && ConvertidoStringPaisAscii(((listaTenistas.get(p-1)).getPais())) > tmp;j-- ){               
               listaTenistas.set(j, listaTenistas.get(j-1));    
            }        
           listaTenistas.set(j,temporal);
           
//           System.out.print( "\n"+ (listaTenistas.get(j)).getNombre() 
//                                + (listaTenistas.get(j)).getPais()
//                                + (listaTenistas.get(j)).getEdad()
//                                + (listaTenistas.get(j)).getPuntaje());                
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
                        //System.out.print( "Entro al if  \n"+ objectParaTabla[i][j]);
                     }  if (x == 1){
                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPais();
                       // System.out.print("Entro al if  \n"+ objectParaTabla[i][j]);
                     }if (x == 2){
                       objectParaTabla[i][j]  = (listaTenistasOrdenada.get(i)).getEdad();
                        //System.out.print("Entro al if  \n"+ objectParaTabla[i][j]);
                     }if (x == 3){
                        objectParaTabla[i][j] = (listaTenistasOrdenada.get(i)).getPuntaje();    
                        //System.out.print( "Entro al if  \n"+ objectParaTabla[i][j]);
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
