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