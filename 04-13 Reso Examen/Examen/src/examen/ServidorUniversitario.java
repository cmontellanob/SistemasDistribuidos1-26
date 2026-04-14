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
public class ServidorUniversitario {

    public static void main(String[] args) {
        try {
            Universitario universitario=new Universitario();
            
            Naming.bind("Bienestar",universitario);
            
        } catch (RemoteException ex) {
            System.getLogger(ServidorUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (AlreadyBoundException ex) {
            System.getLogger(ServidorUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (MalformedURLException ex) {
            System.getLogger(ServidorUniversitario.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}
