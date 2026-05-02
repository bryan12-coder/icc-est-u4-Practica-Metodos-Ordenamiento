import java.util.Arrays;

public class Insercion {
    public void imprimirArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+  "\t");
        }
        

    }
    public void sort(int[] array, boolean asc) {
        System.out.println("==== Metodo de insercion ====");
        System.out.println();
        System.out.println("Arreglo original: " );
        imprimirArray(array);
        System.out.print("\n\n\n");
        int n = array.length;
        

        int comparaciones = 0;
        int cambios = 0;
        int interacciones = 0;
        for (int i = 1; i < n; ++i) { // Aqui guardamos la iteracciones
            interacciones++;
            int guardar = array[i];
            int j = i - 1;
            System.out.print( "I" + i + "\t" );
            imprimirArray(array);
            System.out.print("\t\t");
            
            while (j >= 0) { 
                comparaciones++;
                boolean condicion = asc ? (array[j] > guardar) : (array[j] < guardar); // aqui va las comparaciones

                if (condicion) {
                    int a=j;
                    int b=j+1;
                    System.out.println("a=" + a + "\tb=" + (b) + "\t[a]=" + array[a] + "\t[b]" + guardar + "\t cambio= si");
                    System.out.print("\t"); 
                    for(int k=0;k<array.length;k++){
                        if(k==b ){
                            System.out.print(array[a] + "\t"); //k=0 y a=0, b=1 imprimer k=1 a=0 b=1 imprime k=2 a=0 b=1 tab k=3 a=0 b= 1 tab

                        }
                        else if(k==a){
                            System.out.print(guardar + "\t");
                        }else{
                            System.out.print("\t"); 
                        }
                        
                
                    }
                    System.out.print("\t\t");
                    array[j + 1] = array[j];
                    j = j - 1;
                    cambios++;

                } else {
                    System.out.println("a=" + j + "\tb=" + (j + 1) + "\t[a]=" + array[j] + "\t[b]" + guardar + "\t cambio= no");
                    break;

                }
            }
            array[j + 1] = guardar;
            System.out.print("\n\n\n");


        }
        System.out.print("end \t");
        imprimirArray(array);
        System.out.println("\n");
        System.out.println("COMPARACION     = " + comparaciones);
        System.out.println("INTERACCIONES   = " + interacciones);
        System.out.println("CAMBIOS         = " + cambios);
       

    }

}
