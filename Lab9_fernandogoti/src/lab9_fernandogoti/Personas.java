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
public class Personas {

    private String Nombre;
    private long Id;
    private Date Fecha;

    public Personas() {
    }

    public Personas(String Nombre, long Id, Date Fecha) {
        this.Nombre = Nombre;
        this.Id = Id;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    @Override
    public String toString() {
        return Nombre;
    }

}
