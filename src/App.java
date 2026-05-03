import java.util.Arrays;
import java.util.Scanner;

public class App {  
    public static void main(String[] args) throws Exception {
        int[] array = {12,-7,25,0,-15,33,19,-22,5,48,-3};
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------Menu------");
            System.out.println("1 Ejecutar Ordenamientos");
            System.out.println("2 salir");
            System.out.println("Seleccione 1 0 2 ");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1:
                   System.out.println("Que algoritmo desea usar? (1:Inserccion, 2:Shell ");
                   int algoritmo=sc.nextInt();
                   System.out.println("Orden ascendente (true) o descendente (false)");
                   boolean orde=sc.nextBoolean();
                   int[] copia = array.clone();
                   switch (algoritmo) {
                    case 1:
                        Insercion insercion=new Insercion();
                        insercion.sort(copia, orde);
                        break;
                    case 2:
                        Shell shell = new Shell();
                        shell.sort(copia, orde);
                   
                    default:
                        System.out.println();
                        break;
                   }

                    break;
                case 2:
                    System.out.println("Saliendo del sistema");
                default:
                    System.out.println("La opcion no es valida");
                    break;
            }

            
        } while(opcion!=2);
        sc.close();
      
    }
    

        
  
    
  
    
}
