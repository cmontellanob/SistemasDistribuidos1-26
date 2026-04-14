/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examen;

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
public class Segip {

    public static void main(String[] args) {
        int port = 5002;
        ServerSocket server;
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
            String respuesta=procesar(recibido);
            System.out.println("El cliente envio el mensaje:" + recibido);
            toClient = new PrintStream(client.getOutputStream());
            toClient.println("Hola Mundo desde el Servidor");

        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
       
    }
     public  static String procesar(String cadena)
        {
            String[] comando=cadena.split(":");
            String datos=comando[1];
            String[] datos_personales=datos.split("-");
            if (datos_personales[0].equals("1234567") && datos_personales[1].equals("Ana") && datos_personales[0].equals("Gomez"))
            {
                return "resultado:encontrado";
            }
            else
            {
                return "resultado:no-encontrado";
            }
        }
}
