/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        // declarar variables
        int operacionNumero;
        double num1, num2, resultado;
        Scanner lectura = new Scanner(System.in);
        
        // entrada de datos
        System.out.println("Ingresa el primer número: ");
        num1 = lectura.nextDouble();
        
        System.out.println("Ingresa el segundo número: ");
        num2 = lectura.nextDouble();
        
        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        operacionNumero = lectura.nextInt();
        
        
        // proceso de datos
        resultado = 0;
        
        switch (operacionNumero) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        
        // salida de datos
        System.out.println("El resultado es: " + resultado);
    }
}
