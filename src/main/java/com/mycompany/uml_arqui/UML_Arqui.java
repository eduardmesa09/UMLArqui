package com.mycompany.uml_arqui;

import com.mycompany.uml_arqui.enums.CategoriaProfesor;

public class UML_Arqui {

    public static void main(String[] args) {
        String categoria= CategoriaProfesor.ASISTENTE.getDescripcion();
        System.out.println(categoria);
    }
}