package com.mycompany.uml_arqui;

import com.mycompany.uml_arqui.classes.ProfesorPlanta;
import com.mycompany.uml_arqui.enums.CategoriaProfesor;
import java.time.LocalDate;

public class UML_Arqui {

    public static void main(String[] args) {
        ProfesorPlanta profe= new ProfesorPlanta();
        profe.setCategoria(CategoriaProfesor.CATEDRATICO);
        profe.setFechaNacimiento(LocalDate.of(1999, 2, 6));
        System.out.println(profe.getCategoria().getDescripcion());
        System.out.println(profe.getFechaNacimiento());
    }
}