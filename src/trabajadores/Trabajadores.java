/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajadores;

import java.util.Scanner;

/**
 *
 * @author lab
 */
public class Trabajadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String trabajadores [ ][ ] = new String [200][5];
     
        Scanner entrada = new Scanner(System.in) ;
       
    do {    
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 5; j++) {
                
            
   
       
        System.out.println("ingresar  nombre ");  
        String  nombre = entrada.nextLine() ;
        
        validarNombre(String nombre);
        nombre = trabajadores[i][j] ; 
         
        System.out.println("ingresar  apellido");  
        String  apellido = entrada.nextLine() ;
        
        System.out.println("ingresar  rut");  
        String  rut  = entrada.nextLine() ;
        
        System.out.println("ingresar  cargo ");  
        String  cargo  = entrada.nextLine() ; 
        
        System.out.println("ingresar email   ");  
        String  email = entrada.nextLine() ;
         }
        }
        
        System.out.println("ingresar nuevo trabajador............2");  
               
        System.out.println("salir.............................0");
        
        
        System.out.println("Que desea hacer ? (0-5)");
               int op = entrada.nextInt();   

           switch ( op ) {
	
        case 1:
       
            
            break;
        case 2:
           
            break;
        case 3:
          
	break;
	
        case 4:
            
	 break; 
         
        
        case 5 :   
           
            break;
        case 6 :   
           
        break;
        
        case 0 :   
          
            System.out.println("Hasta luego..");
           
          break;
            
        default:
            
            
          System.out.println("ingrese opcion valida (0-5)");
        
          break;
}

      
        } while (op>=5 || op!=0 ) ; 
        
    
    }
 public  ingresarnombre (){
     
 }
    
 public boolean validarNombre(String nombre  ){
 
     boolean  respuesta = false; 
if ((nombre).matches("([a-z]|[A-Z]|\\s)+")) { 
respuesta = true; 
} 
return respuesta; 
}
  public boolean validarapellido(String apellido){
      boolean  respuesta = false; 
if ((apellido).matches("([a-z]|[A-Z]|\\s)+")) { 
respuesta = true; 
} 
return respuesta; 
 
    
}
 public boolean validaraCargo(String cargo){
  boolean  respuesta = false; 
if ((cargo).matches("([a-z]|[A-Z]|\\s)+")) { 
respuesta = true; 
} 
return respuesta; 

    
}
             
 


 public static boolean validarRut ( String ru ) { 
 return ;
 }

 public static boolean validarEmail ( String email ) {
 
    boolean  respuesta = false; 
if ((email).matches("[_A-Za-z-\\\\+]+(\\\\.[_A-Za-z]+)*@[A-Za-z-]+(\\\\.[A-Za-z]+)*(\\\\.[A-Za-z]{2,}   )")) { 
respuesta = true; 
} 
     return respuesta ;
} 

 
 public static boolean validarRut ( String ru ) { 
     return;
 }

 
 public static int totalTrabajadores(String [ ][ ] m ) { 
                  }


 public static boolean filaLibre( String m [ ][ ] m , int f ) {
}

 
 public static boolean buscarTrabajador( String m [ ][ ] m , String r) { 

         }
  }