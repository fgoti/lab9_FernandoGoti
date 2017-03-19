/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_fernandogoti;

import java.util.Date;

/**
 *
 * @author Fernando Goti
 */
public class Empleado extends Personas {

    private String Rol;
    private String hora_llrgada;
    private String hora_entrada;
    private String hora_salida;
    private long Sueldo;

    public Empleado() {
        super();
    }

    public Empleado(String Rol, String hora_llrgada, String hora_entrada, String hora_salida, long Sueldo, String Nombre, long Id, Date Fecha) {
        super(Nombre, Id, Fecha);
        this.Rol = Rol;
        this.hora_llrgada = hora_llrgada;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.Sueldo = Sueldo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getHora_llrgada() {
        return hora_llrgada;
    }

    public void setHora_llrgada(String hora_llrgada) {
        this.hora_llrgada = hora_llrgada;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public long getSueldo() {
        return Sueldo;
    }

    public void setSueldo(long Sueldo) {
        this.Sueldo = Sueldo;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
