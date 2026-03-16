/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sis258.practica2;

import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Dell
 */
public class Justicia extends UnicastRemoteObject implements IJusticia {
    

    @Override
    public RespuestaCuenta ConsultarCuentas(String ci, String nombres, String apellidos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean Congelar(Cuenta cuenta, Float monto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
