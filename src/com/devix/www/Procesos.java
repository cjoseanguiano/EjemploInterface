package com.devix.www;

import com.devix.www.Clases.Animal;
import com.devix.www.Clases.Humano;

/**
 * Created by carlosjoseanguiano on 28/05/17.
 */
public class Procesos {
    public void iniciar() {
        Animal miOso = new Animal();
        miOso.setRaza("Oso pardo");
        miOso.deplazarce();
        miOso.alimentarce();
        miOso.getRaza();
        System.out.println(miOso.getRaza());

        System.out.println();

        Humano miPersona = new Humano();
        miPersona.setCedula("123");
        miPersona.setNombre("Carlos Anguiano ");
        miPersona.alimentarce();
        miPersona.deplazarce();
        miPersona.jugando();
        miPersona.trabajar(miPersona.getNombre());
        System.out.println(miPersona.getCedula());

        System.out.println();
    }
}
