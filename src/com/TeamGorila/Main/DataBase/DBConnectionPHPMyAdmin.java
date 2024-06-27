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
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();
        
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);
        
        scanner.close();
    
    }
}
