/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package examen;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Dell
 */
public class ServidorBienestar {

    public static void main(String[] args) {
        try {
            Bienestar bienestar=new Bienestar();
            LocateRegistry.createRegistry(1099); //levantar el servidor de registro; (una cez)
            Naming.bind("Bienestar",bienestar);
            
        } catch (RemoteException ex) {
            System.getLogger(ServidorBienestar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (AlreadyBoundException ex) {
            System.getLogger(ServidorBienestar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (MalformedURLException ex) {
            System.getLogger(ServidorBienestar.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
