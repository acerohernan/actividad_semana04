/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *  Programa que devuelve el día de la semana
 * @author Hernan
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        // declarar variables
        int numeroDia;
        String dia;
        Scanner lectura = new Scanner(System.in);
        
        // entrada de datos
        System.out.println("Ingresa un número (1-7) para el día de la semana: ");
        numeroDia = lectura.nextInt();
        
        // proceso de datos
         switch (numeroDia) {
            case 1:
                dia = "Lunes";
                break;
            case 2:
                dia = "Martes";
                break;
            case 3:
                dia = "Miércoles";
                break;
            case 4:
                dia = "Jueves";
                break;
            case 5:
                dia = "Viernes";
                break;
            case 6:
                dia = "Sábado";
                break;
            case 7:
                dia = "Domingo";
                break;
            default:
                dia = "Número inválido, debe estar entre 1 y 7.";
         }
         
        // salida de datos
        System.out.println("El día elegido es: " + dia);
    }
}
