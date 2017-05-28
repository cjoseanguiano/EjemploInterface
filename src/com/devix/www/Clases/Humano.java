package com.devix.www.Clases;

import com.devix.www.Interface.InterfaceAccionesHumano;
import com.devix.www.Interface.InterfaceGeneral;

/**
 * Created by carlosjoseanguiano on 27/05/17.
 */
public class Humano implements InterfaceGeneral, InterfaceAccionesHumano {
    private String cedula;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void razonar() {
        System.out.println("El humano razona");
    }

    @Override
    public void deplazarce() {
        System.out.println("Se esta desplazando el humano en HUMANO CLASS " + cedula);
    }

    @Override
    public void alimentarce() {

    }

    @Override
    public void dormir() {

    }

    @Override
    public void jugando() {
        System.out.println("Se esta Jugando el humano en HUMANO CLASS " + cedula);

    }


    @Override
    public void bailar(String nombre) {

    }

    @Override
    public void estudiar(String estudiar, String cedula) {

    }

    @Override
    public void trabajar(String nombre) {
        System.out.println("El humano esta trabajando " + nombre);
    }
}
