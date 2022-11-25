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
