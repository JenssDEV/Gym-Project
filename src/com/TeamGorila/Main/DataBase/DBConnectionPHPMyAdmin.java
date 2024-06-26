/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TeamGorila.Main.DataBase;

import java.util.Scanner;

/**
 *
 * @author JENS07
 */
public class DBConnectionPHPMyAdmin {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingresa un número entero:");
        int numero = scanner.nextInt();

        // Usar una estructura de control para determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
