/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Bienestar extends UnicastRemoteObject implements IBienestar {

    public Bienestar() throws RemoteException {
        super();
    }
    

    @Override
    public ArrayList<Nota> ObtenerHistorial(String ci) throws RemoteException {
        ArrayList<Nota> aux=new ArrayList<Nota>();
        aux.add(new Nota("SIS-258",85));
        aux.add(new Nota("COM-350",85));
        aux.add(new Nota("SIS-256",85));
        
        return aux;
        
    
    }
    
    
}
