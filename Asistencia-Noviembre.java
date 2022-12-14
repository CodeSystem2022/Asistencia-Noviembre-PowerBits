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

//Ivana Gonzalez

/*
Ejercicio 3: Crear y caragar una matriz de tamaño 3x3, transponerla y mostrarla 
*/
package matriz_ejercicio_3;

import java.util.Scanner;

public class Matriz_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [] [] = new int [3] [3];
        
        System.out.println("Rellenar la matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Matriz ["+i+"]["+j+"]:");
                matriz[i][j] = entrada.nextInt();
                
            }
        }
        System.out.println();
        
        System.out.println("Matriz original");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        //Matriz transpuesta
        System.out.println("Matriz transpuesta");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[j][i] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
// Héctor Fonzalida

/*
Ejercicio 6: Utilizando 2 matrices de tamaño 5x9 y 9x5, cargar la primera y 
tramsportarla a la segunda.
 */
package matriz_ejercicio_6;

import java.util.Scanner;

public class MatrizEjercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];
        
        System.out.println("Ingrese la matriz: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.println("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz original es: ");
        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                System.out.println(matriz1[i][j]+ " ");
            }
            System.out.println("");
        }
        
        // Se traspone
        for(int i=0; i<5; i++){
            for(int j=0; j<9; j++){
                matriz2[j][i] = matriz1[i][j];
            }
        }
        System.out.println("\nLa matriz transpuesta es: ");
        for(int i=0; i<9; i++){
            for(int j=0; j<5; j++){
                System.out.println(matriz2[i][j]+ " "); 
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
//Antonella Arraez

/*
EJERCICIO 5: Crear y cargar una matriz de tamaño n x m, mostrar la suma
de cada fila y de cada columna
 */
package matriz_ejercicio_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Matriz_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        int posFila, posCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol =  Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int [nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int[nCol];
        
        System.out.println("Rellenando la matriz: ") ;
        for(int i=0;<nFilas;i++) {
            for(int j=0;<nCol;j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz Original: ");
        for(int i=0;<nFilas;i++) {
            for(int j=0;<nCol;j++) {
                System.out.print(matriz[i][j]+" " );
            }
            System.out.println("");  
            
             //Sumando las filas
             posFila=0;
             for(int i=0;i<nFilas;i++){
                  sumaFilas = 0;
                  for(int j=0;j<nCol;j++){
                    sumaFilas += matriz[i][j];
                  }
                  filas[posFila] = sumaFilas;
                  posFila++;
             }
             
             //Sumando las columnas
             posCol = 0;
             for(int j=0;j<nCol;i++){
                     sumaCol = 0;
                     for(int i=0;i<nFilas;i++){
                             sumaCol += matriz[i][j];
                }
                columnas[posCol] = sumaCol;
                posCol++;
        }
             
        System.out.println("\nLa suma de las filas es: ");
        for(int i=0;i<nFilas;i++){ 
                System.out.println(filas[i]+" - ");  
        } 
        System.out.println("");
            
        System.out.println("\nLa suma de las columnas es: ");
        for(int i=0;i<nCol;i++){
                System.out.println([i]+" - ");
        }
        System.out.println("");
                    
    }

