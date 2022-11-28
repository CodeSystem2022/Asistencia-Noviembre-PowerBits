// Nadia Gonzalez

/*
Ejercicio 2: Leer 5 numeros, guardarlos en un arreglo y
mostrarlos en el orden inverso al introducido
*/

package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // creamos la variable para que el usuario ingrese los numeros
        int numero;
        // creamos el arreglo
        int arreglo[] = new int [5];
        // creamos el ciclo for para ingresar los datos y guardarlos en el arreglo
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento "+i+"= Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            arreglo[i] = numero;
        }
        // creamos el ciclo for para mostrar, pero ahora al inverso
        for (int i = 4; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }
    }
}

// Lucas Mendez
/*
Ejercicio 1: Leer 5 numeros, guardarlos en un arreglo 
y mostrarlos en el mismo orden introducidos
*/

package arreglos_ejercicio_1;

import java.util.Scanner;

public class Arreglos_Ejercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // creamos la variable para que el usuario ingrese los numeros
        int numero;
        // creamos el arreglo
        int arreglo[] = new int [5];
        // creamos el ciclo for para ingresar los datos y guardarlos en el arreglo
        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento "+i+"= Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            arreglo[i] = numero;
        }
        // creamos el ciclo for para mostrar
        for (int i = 0; i < 5; i++) {
            System.out.println(arreglo[i]);
        }
    } 
}

// Nico Machuca

/*
Ejercicio 4: Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal
principal sean 1 y el resto 0.
*/
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int [7][7];
        
        //Llenando la matriz
        for (int i = 0; i <7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i==j) {
                    matriz[i][j] = 1;  
                }
                else{
                    matriz[i][j] = 0;
                }
            } 
        }
        System.out.println("\nMostrnado matriz completa: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }  
}


// Juan Machuca

/*
Ejercicio 3: Leer 5 numeros por teclado, almacenarlos en
un arreglo y a continuacion realizar la media de los
numeros positivos, la media de los negativos y contar
el numero de ceros
 */
package arreglos_ejercicio_3;

import java.util.Scanner;

public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        float numeros[] = new float[5];
        float negativos = 0, positivos = 0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteo_negativos = 0, conteo_positivos = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"- Introduzca un numero: ");
            numeros[i] = entrada.nextFloat();
            
            if(numeros[i] > 0){
                positivos += numeros[i];
                conteo_positivos++;
            }
            else if(numeros[i] < 0){
                negativos += numeros[i];
                conteo_negativos++;
            }
            else{
                conteo0++;
            }
        }
        
       if(conteo_positivos == 0){
           System.out.println("\n No se puede sacar la media de los numeros positivos");
       }
       else{
           mediaPositivos = positivos/conteo_positivos;
           System.out.println("\n La media de los numeros positivos es: "+mediaPositivos);
       }
       
       if (conteo_negativos == 0){
           System.out.println("\n No se puede sacar la media de los numeros negativos");
       }
       else{
           mediaNegativos = negativos/conteo_negativos;
           System.out.println(" La media de los numeros negativos es: "+mediaNegativos);
       }
        System.out.println("\n La cantidad de ceros es: "+conteo0);
    }
}
