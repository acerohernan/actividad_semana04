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
public class Ejercicio3 {
    public static void main(String[] args) {
        // declarar variables
        double cantidadSoles, resultado;
        String nombreMoneda;
        int monedaAConvertir;
        Scanner lectura = new Scanner(System.in);

        // entrada de datos
        System.out.println("Ingresa la cantidad en soles: ");
        cantidadSoles = lectura.nextDouble();

        System.out.println("Elige la moneda a la que deseas convertir:");
        System.out.println("1. Dólares");
        System.out.println("2. Euros");
        System.out.println("3. Pesos mexicanos");
        monedaAConvertir = lectura.nextInt();

        // proceso de datos
        nombreMoneda = "";
        resultado = 0;
        
        switch (monedaAConvertir) {
            case 1:
                nombreMoneda = "dólares";
                resultado = cantidadSoles * 3.75;
                break;
            case 2:
                nombreMoneda = "euros";
                resultado = cantidadSoles * 4.18;
                break;
            case 3:
                nombreMoneda = "pesos mexicanos";
                resultado = cantidadSoles * 5.19;
                break;
            default:
                System.out.println("Opción no válida, selecciona un número entre 1 y 3.");
                break;
        }
        
        // salida de datos
        System.out.println("El resultado del cambio de moneda a " + nombreMoneda + " es: " + resultado);
    }
}
