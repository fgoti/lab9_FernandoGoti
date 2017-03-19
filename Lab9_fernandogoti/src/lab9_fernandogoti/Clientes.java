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
public class Clientes extends Personas {

    private String lugar_residencia;
    private String hora_entrenamiento;
    private String Nombre_instructor;
    private String Membresia;
    private int Peso;
    private double Altura;

    public Clientes() {
        super();
    }

    public Clientes(String lugar_residencia, String hora_entrenamiento, String Nombre_instructor, String Membresia, int Peso, double Altura, String Nombre, long Id, String Fecha) {
        super(Nombre, Id, Fecha);
        this.lugar_residencia = lugar_residencia;
        this.hora_entrenamiento = hora_entrenamiento;
        this.Nombre_instructor = Nombre_instructor;
        this.Membresia = Membresia;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    public String getLugar_residencia() {
        return lugar_residencia;
    }

    public void setLugar_residencia(String lugar_residencia) {
        this.lugar_residencia = lugar_residencia;
    }

    public String getHora_entrenamiento() {
        return hora_entrenamiento;
    }

    public void setHora_entrenamiento(String hora_entrenamiento) {
        this.hora_entrenamiento = hora_entrenamiento;
    }

    public String getNombre_instructor() {
        return Nombre_instructor;
    }

    public void setNombre_instructor(String Nombre_instructor) {
        this.Nombre_instructor = Nombre_instructor;
    }

    public String getMembresia() {
        return Membresia;
    }

    public void setMembresia(String Membresia) {
        this.Membresia = Membresia;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }

}
