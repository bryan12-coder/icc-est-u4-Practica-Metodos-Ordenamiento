import java.util.Arrays;

public class Shell {
    public void imprimirArray(int [] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+  "\t");
        }
        

    }
    public void sort( int []array, boolean asc){

        System.out.println("====Metodo Shell====");
        System.out.println();
        System.out.println("Arreglo original");
        imprimirArray(array);
        System.out.print("\n\n\n");
        int b=array.length;
        int comparaciones=0;
        int cambios=0;
        int iteracciones=0;
        for(int gap= b/2; gap >0 ; gap /=2){
            for(int i= gap ;i<b; ++i ){
                iteracciones ++;
                System.out.print("I"+ iteracciones + "\t");
                imprimirArray(array);
                System.out.print("\t\t");
                int key=array[i];
                int j= i;
                while(j>=gap ){
                    
                    boolean condicion = asc ? (array[j-gap]>key ) : (array[j-gap]<key);
                    int a=j-gap;
                    int bb=j;
                    comparaciones++;
                    if(condicion){
                        array[j]=array[j-gap];
                        
                        cambios ++;
                        System.out.println("gap= " + gap + "\t a= " + a +  "\t b="+ bb + "\ta[]="+ array[a] + "\tb[]="+ key + "\tcambio= si"  );
                        j=j-gap;
                    }else{
                        System.out.println("gap= " + gap + "\t a= " + a +  "\t b="+ bb + "\ta[]="+ array[a] + "\tb[]="+ key +"\tcambios= no");
                        break;
                    }
                    System.out.print("\t"); 
                    for(int k=0; k<array.length; k++){
                        if(k==bb){
                            System.out.print(array[a]+ "\t");
                        }else if(k==a){
                            System.out.print(key + "\t");
                        }else{
                            System.out.print("\t");
                        }

                    }
                    System.out.print("\t\t");
                    array[j]=key;

                }
                System.out.print("\n\n\n");
                
            
            }
          
        
    
        }
        System.out.print("end \t");
        imprimirArray(array);
        System.out.println("\n");
        System.out.println("COMPARACION     = " + comparaciones);
        System.out.println("INTERACCIONES   = " + iteracciones);
        System.out.println("CAMBIOS         = " + cambios);
       
        
        
    }
   
   

}
