package com.devix.www.Clases;

import com.devix.www.Interface.InterfaceGeneral;

/**
 * Created by carlosjoseanguiano on 27/05/17.
 */
public class Animal implements InterfaceGeneral {

    private String raza;

    public void cazar() {
        System.out.println("El animal de raza " + raza + "Esta cazando");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void deplazarce() {
        System.out.println("Se esta desplazando el animal en Animal CLASS ");

    }

    @Override
    public void alimentarce() {
        System.out.println("Se esta Alimentandose el animal en Animal CLASS ");

    }

    @Override
    public void dormir() {

    }

    @Override
    public void jugando() {
        System.out.println("Se esta Jugando el animal en Animal CLASS ");

    }
}
