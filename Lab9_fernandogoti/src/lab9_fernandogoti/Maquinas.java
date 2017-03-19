/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_fernandogoti;

/**
 *
 * @author Fernando Goti
 */
public class Maquinas {

    private String Material;
    private String Funcion;
    private long Numero_serie;
    private int vida_util;

    public Maquinas() {
    }

    public Maquinas(String Material, String Funcion, long Numero_serie, int vida_util) {
        this.Material = Material;
        this.Funcion = Funcion;
        this.Numero_serie = Numero_serie;
        this.vida_util = vida_util;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String Funcion) {
        this.Funcion = Funcion;
    }

    public long getNumero_serie() {
        return Numero_serie;
    }

    public void setNumero_serie(long Numero_serie) {
        this.Numero_serie = Numero_serie;
    }

    public int getVida_util() {
        return vida_util;
    }

    public void setVida_util(int vida_util) {
        this.vida_util = vida_util;
    }

    @Override
    public String toString() {
        return "Maquinas{" + "Material=" + Material + ", Funcion=" + Funcion + ", Numero_serie=" + Numero_serie + ", vida_util=" + vida_util + '}';
    }

}
