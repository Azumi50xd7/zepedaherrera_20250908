/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zepedaherrera_20250908;

/**
 *
 * @author UFG
 */

import java.util.Scanner;
public class Main {

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TAMAÑO DEL ARREGLO
        int cantidad_elementos = 5;
        
        //CREACION E INSTANCIA ARREGLO DE NUMEROS DESORDENADOS
        int[] numeros_desordenados = new int[cantidad_elementos];
        
        //CREACION E INSTANCIA ARREGLO DE NUMEROS ORDENADOS
        int[] numeros_ordenados = new int[cantidad_elementos];
        //CREACION E INSTANCIA DEL OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);
        //NOTIFICACION AL USUARIO PARA INDICARLE QUE DEBE INGRESAR VALORES ENTEROS
        System.out.println("por favor ingrese "+cantidad_elementos+"  numeros enteros de manera desordenada");
        
        //SE RECORRE EL ARREGLO DE NUMEROS ENTEROS DESORDENADOS QUE POR DEFECTO
        //TIENEN EL VALOR 0
        for(int i=0; i<numeros_desordenados.length; i++){
            //SE SOLICITA AL USUARIO EL INGRESO DE UN VALOR 
            System.out.print("Digite el Elemento: "+(i+1)+": ");
            //SE DIGITA UN VALOR DESDE EL TECLADO DE TIPO ENTERO
            numeros_desordenados[i] = scanner.nextInt();
            
            
        }
        //SE IMPRIME UNA SALIDA AL USUARIO PARA MOSTRAR LO QUE DIGITADO
        System.out.println("Usted digito los siguientes numeros: ");
        //SE RECORRE EL ARREGLO DE VALORES DIGITADOS
        for(int j = 0; j < numeros_desordenados.length; j++){
            
            //SE IMPRIMEN LOS NUMEROS DIGITADOS POR EL USUARIO
            //ALMACENADOS EN EL ARREGLO DE NUMEROS DESORDENADOS
            System.out.print(numeros_desordenados[j]+" ");
        }
        //HACEMOS SALTO DE LINEA
        System.out.println();
        //INVOCAMOS LA FUNCION PARA ORDENAR EL ARREGLO 
        numeros_ordenados = ordenar(numeros_desordenados);
        //IMPRIMIMOS LA SALIDA AL USUARIO 
        System.out.print("los numeros ordenados son: ");
        //SE RECORRE EL ARREGLO PARA OBTENER CADA VALOR 
        //DEL ARREGLO ORDENADO
        for(int k=0; k<numeros_ordenados.length; k++){
            
            //SE IMPRIME EL VALOR DE CADA ELEMENTO
            System.out.print(numeros_ordenados[k]+ " ");
            
            
        }
        
        System.out.println();
        
    }
    
    
    //FUNCION PARA ORDENAR UN ARREGLO UNIDIMENSIONAL
    public static int[] ordenar( int[] arreglo){
        //SE RECORRE EL ARREGLO PARA EVALUAR CADA POSICION
        for(int i=0; i<arreglo.length-1; i++){
            
            
            for(int j=0; j<arreglo.length - 1; j++){
                
                //System.out.print(arreglo[j]);
                
                if(arreglo[j] > arreglo [j+1]){
                    int mayor= arreglo[j];
                    
                    arreglo[j] = arreglo[j+1];
                    arreglo [j+1] = mayor;
                }
                
            }
           
        }
        
        return arreglo;
        
    }
    
    
}
