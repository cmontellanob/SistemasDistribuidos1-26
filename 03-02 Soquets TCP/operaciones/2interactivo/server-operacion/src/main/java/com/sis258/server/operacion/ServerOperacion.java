/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sis258.server.operacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dell
 */
public class ServerOperacion {

    public static void main(String[] args) {
         int port = 5002;
        ServerSocket server;
        while (true) {
        try {
            // TODO code application logic here
            server = new ServerSocket(port);
            System.out.println("Se inicio el servidor con éxito");
            Socket client;
            PrintStream toClient;
            client = server.accept(); //conexion entre cliente y servidor para comunicacion bidireccional
            BufferedReader fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
            System.out.println("Cliente se conecto");
            String recibido = fromClient.readLine();
            System.out.println("El cliente envio el mensaje:" + recibido);
            int numero1= Integer.parseInt(recibido);
            
            toClient = new PrintStream(client.getOutputStream());
            
            toClient.println("introduzca el segundo numero");
            String recibido2 = fromClient.readLine();
            int numero2= Integer.parseInt(recibido2);
            toClient.println("1.suma 2.resta 3. multiplicacion 4, division .introduzca la operacion");
            String recibido3 = fromClient.readLine();
            int resultado=0;
            switch (recibido3) {
                case "suma": resultado=numero1+numero2;
                 break;
                case "restar": resultado=numero1+numero2;
                 break; 
                 
                    
            }
            
            
           
            toClient.println(String.valueOf(resultado));

        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
        }
    }
}
