/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {
    public static void main(String[] args) {
    int resultado = 0; 
    int[][] arreglo = {{10, 41, 40}, {1, 2 ,3}, {1, 12, 4}};
        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++) {
                if (f == c){
                    resultado += arreglo[f][c];
                }
            }
        }
        System.out.printf("%d", resultado);
    /* se establece la condicional que revisara si f = c porque en el arreglo
    el numero de filas y columnas en orden diagonal son iguales, asi podra
    ir sumandose el acumulador*/
    }
}
