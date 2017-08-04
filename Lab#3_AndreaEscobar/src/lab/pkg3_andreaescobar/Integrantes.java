/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_andreaescobar;

import java.util.Date;

/**
 *
 * @author andre
 */
public class Integrantes extends Pueblo{
    private String nombreIntegrante;
    private String apellido;
    private double altura;
    private Date nacimiento;
    private int poderataque;
    private int defensa;
    private int curacion;
    private String bestias;
    
    public Integrantes() {
        super();
    }

    public Integrantes(String nombreIntegrante, String apellido, double altura, Date nacimiento, int poderataque, int defensa, int curacion, String bestias) {
        this.nombreIntegrante = nombreIntegrante;
        this.apellido = apellido;
        this.altura = altura;
        this.nacimiento = nacimiento;
        this.poderataque = poderataque;
        this.defensa = defensa;
        this.curacion = curacion;
        this.bestias = bestias;
    }

    public String getBestias() {
        return bestias;
    }

    public void setBestias(String bestias) {
        this.bestias = bestias;
    }

    public String getNombreIntegrante() {
        return nombreIntegrante;
    }

    public void setNombreIntegrante(String nombreIntegrante) {
        this.nombreIntegrante = nombreIntegrante;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getPoderataque() {
        return poderataque;
    }

    public void setPoderataque(int poderataque) {
        this.poderataque = poderataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion(int curacion) {
        this.curacion = curacion;
    }

    @Override
    public String toString() {
        return "Integrantes{" + "nombreIntegrante=" + nombreIntegrante + ", apellido=" + apellido + ", altura=" + altura + ", nacimiento=" + nacimiento + ", poderataque=" + poderataque + ", defensa=" + defensa + ", curacion=" + curacion + ", bestias=" + bestias + '}';
    }

    
    

    
    
    
    
}
