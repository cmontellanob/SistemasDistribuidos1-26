/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sis258.hola.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Dell
 */
public interface IHola extends Remote {
    String saludo() throws RemoteException;; 
    
}
