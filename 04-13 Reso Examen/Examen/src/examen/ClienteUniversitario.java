/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Dell
 */
public class ClienteUniversitario {
      public static void main(String[] args) {
          try {
              IUniversitario universario=(IUniversitario)Naming.lookup("rmi://localhost/Universigario");
              RespuestaBeca respuesta= universario.SolicitarBeca("1234567", "Ana", "Gomez");
              if (respuesta.aprobado){
                  System.out.print("Beca Aprobada");
              }
              else {
                  System.out.print("Beca NO Aprobada");
                  System.out.print(respuesta.motivo);
                  System.out.print("Su promedio es: "+respuesta.promedio);
                  
                  
              }
          } catch (NotBoundException ex) {
              System.getLogger(ClienteUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          } catch (MalformedURLException ex) {
              System.getLogger(ClienteUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          } catch (RemoteException ex) {
              System.getLogger(ClienteUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
          }
      }
}
