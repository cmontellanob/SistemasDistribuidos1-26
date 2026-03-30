/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sis258.simplechat;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Principal {

    public static void main(String[] args) {
        try {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca su nombre");
            String nombre;
            nombre = sc.next();
            System.setProperty("java.net.preferIPv4Stack", "true");
            new SimpleChat(nombre).start();
        } catch (Exception ex) {
            System.getLogger(Principal.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
