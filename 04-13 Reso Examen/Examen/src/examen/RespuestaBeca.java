/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author Dell
 */
public class RespuestaBeca {
    boolean aprobado;
    String motivo;
    double promedio;

    public RespuestaBeca(boolean aprobado, String motivo, double promedio) {
        this.aprobado = aprobado;
        this.motivo = motivo;
        this.promedio = promedio;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Respuesta solcitud RespuestaBeca{" + "aprobado=" + aprobado + ", motivo=" + motivo + ", promedio=" + promedio + '}';
    }
    
}
