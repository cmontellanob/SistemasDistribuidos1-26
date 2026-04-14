/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.SocketException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */

public class Universitario extends UnicastRemoteObject implements IUniversitario {
    String ci;
    String nombres;
    String apellidos;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
            
    public Universitario() throws RemoteException {
        super();
    }
    
    @Override
    public RespuestaBeca SolicitarBeca(String ci, String nombres, String apellidos) throws RemoteException {
        double promedio=0;
        setCi(ci);
        setNombres(nombres);
        setApellidos(apellidos);
        
        if (consultarSegip().equals("resultado:no-encontrado"))
        {
            return new RespuestaBeca(false,"No se encontro enel SEGIP",0);
        }
        promedio=promedioBienestar();
        if (promedio<70.0)
        {
            return new RespuestaBeca(false,"No Las calificaciones debenser mayores a 70",promedio);
        }
        if (montoDeuda>0))
        {
            return new RespuestaBeca(false,"La PErsona tiene deudas ",promedio);
        }

    
        return  new RespuestaBeca(true,"",promedio);
    
    }
    private String consultarSegip()
    {
          int port = 5002;
          String result;
        try {
            Socket client = new Socket("localhost", port);
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            toServer.println("verificar:+"+ci+"-"+nombres+"-"+apellidos);
            result = fromServer.readLine();
            
        } catch (IOException ex) {
            result=ex.getMessage();
        }
        return result;
    }
    private double promedioBienestar()
    {
        try {
              IBienestar bienestar=(IBienestar)Naming.lookup("rmi://localhost/Binenestar");
              ArrayList<Nota> notas= bienestar.ObtenerHistorial(ci);
              double promedio=0;
              int cantidad=0;
              for (Nota nota:notas)
              { 
                  cantidad++;
                  promedio+=nota.getNota();
                  
              }
              promedio/=cantidad;
              
          } catch (NotBoundException ex) {
              System.getLogger(ClienteUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          } catch (MalformedURLException ex) {
              System.getLogger(ClienteUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          } catch (RemoteException ex) {
              System.getLogger(ClienteUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          }
        return 0;
    }
    private int montoDeuda()
    {
           int puerto = 6789;
    Scanner sc=new Scanner(System.in);
    try {
        System.out.print("Introduzca Su nombre");
        String dato="deuda:"+ci;
        String ip="localhost";
      DatagramSocket socketUDP = new DatagramSocket();
      byte[] mensaje = dato.getBytes();
      InetAddress hostServidor = InetAddress.getByName(ip);
      
      // Construimos un datagrama para enviar el mensaje al servidor
      DatagramPacket peticion =
        new DatagramPacket(mensaje, dato.length(), hostServidor,
                           puerto);

      // Enviamos el datagrama
      socketUDP.send(peticion);

      // Construimos el DatagramPacket que contendrá la respuesta
      byte[] bufer = new byte[1000];
      DatagramPacket respuesta =
        new DatagramPacket(bufer, bufer.length);
      socketUDP.receive(respuesta);

      // Enviamos la respuesta del servidor a la salida estandar
      String resp=new String(respuesta.getData());

      // Cerramos el socket
      socketUDP.close();
      if (resp.equals("")) {
          return 0;
      }
          } catch (SocketException e) {
      System.out.println("Socket: " + e.getMessage());
    } catch (IOException e) {
      System.out.println("IO: " + e.getMessage());
    }
 
        return 33;
    }
}
