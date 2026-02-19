/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sis258.hola;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Hola {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduzca su nombre");
        String nombre=sc.nextLine();
        System.out.println("Hello World!"+nombre);
    }
}
