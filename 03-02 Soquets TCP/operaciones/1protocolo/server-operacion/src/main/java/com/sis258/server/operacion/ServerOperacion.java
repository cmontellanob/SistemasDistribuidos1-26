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
            toClient = new PrintStream(client.getOutputStream());
            String respuesta=procesarSolicitud(recibido);
            toClient.println(respuesta);

        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
        }
    }
    public static String procesarSolicitud(String cadena )
    {
        return cadena;
    }
}
