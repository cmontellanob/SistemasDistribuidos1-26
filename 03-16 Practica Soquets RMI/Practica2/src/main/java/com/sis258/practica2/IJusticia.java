/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sis258.practica2;

import java.rmi.Remote;

/**
 *
 * @author Dell
 */
public interface IJusticia extends Remote {
    
      RespuestaCuenta ConsultarCuentas(String ci, String nombres, String apellidos);
      Boolean Congelar(Cuenta cuenta,Float monto);

    
}
