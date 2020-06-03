
package hojadetrabajo;

import java.util.Scanner;


public class HojaDeTrabajo {
    static int estudiantesA = 1;
    static int estudiantesB = 1;
    static Scanner scanner = new Scanner(System.in);
    static int opcion,opcion2,opcion3;
    static  String usuario,pass,curso,secA,secB;
    
    public static void main(String[] args) {
        
        //repetir hasta que usuario y contra sean las ya establecidas
         do{
            
        System.out.println("Ingrese el nombre de usuario");
        //usuario por default admin
        usuario = scanner.next();
        System.out.println("Ingrese la contraseña");
        //contraseña dor default pass
        pass = scanner.next();
            
        }while(!(usuario.equalsIgnoreCase("admin") || pass.equalsIgnoreCase("pass")));
         
         //repetir hasta que escoga el curso
          do{
            System.out.println("Seleccione curso");
         //el nombre del curso por defaut ipc1
            curso = scanner.next();
        }while(!(curso.equalsIgnoreCase("ipc1")));
          escogerSec();
        
    }
    
    
        //metodo para escoger la sección
    public static void escogerSec(){
        // validación por si las secciones A y B son mayores de 15
        if(estudiantesA > 15 && estudiantesB > 15){
            System.out.println("Sección A como Sección B se encuentran llenas");
            System.out.println("Desea crear otra sección: \n1) Si \n2) No");
            opcion2 = scanner.nextInt();
            
            if(opcion2 == 1){
                seccionC();
            }else{
                System.exit(0);
            }
        }else{
        //opcion para escoger seccion A o B
        System.out.println("Seleccione sección, \n1) A, \n2) B");
        opcion = scanner.nextInt();
        
        switch(opcion){
            case 1:
                // metodo para ir a la seccion A
                seccionA();
                break;
            case 2:
                //metodo para ir a la seccion B
                seccionB();
                break;
            default:
                //mensaje si no escoge alguna opción válida
                System.out.println("Opción no válidad");
        }
    
        }
    }
    
    public static void seccionA(){
       
//        while(estudiantesA <= 16){
        //validación si el  número de estudiantes se excede de 15
        if(estudiantesA > 15){
            System.out.println("Sección A no disponible, escoga otra sección");
            escogerSec();
         
        //si no se excede se procede a la sección   
        }else{
            System.out.println("Seccion A");
          //validación de la sección
            asignarse();
            System.out.println(estudiantesA + " estudiante inscritos en la sección A");
            estudiantesA +=1;
        }
        }
       
//       }
    public static void seccionB(){
       
//       while(estudiantesB <= 16){
        //validación si se excede de 15 estudiantes la secciön B
        if(estudiantesB > 15){
            System.out.println("Sección B no disponible, escoga otra opción");
            escogerSec();
        }else{
           //Sino se excede se escoge la sección
            System.out.println("Seccion B");
            asignarse();
            System.out.println(estudiantesB + " estudiante inscritos en la sección B");
            estudiantesB +=1;
          
        }
        }
       
//       }
      public static void seccionC(){
       
     
            //Validación para crear una nueva sección
            System.out.println("Se creó la seccion C");
            System.out.println(" estudiante inscritos en la sección C");
            System.exit(0);
            
          
        }
      
       public static void asignarse(){
           //Confirmación de asignación del estudiante
           System.out.println("Desea Asignarse a la sección: \n1)Si \n2)No");
           opcion3 = scanner.nextInt();
           if(opcion3 == 1){
               System.out.println("Asignado");
           }else{
               escogerSec();
           }
       }
        }
     
      

 
       
    

