package com.mycompany.uml_arqui.classes;

import com.mycompany.uml_arqui.enums.CategoriaProfesor;
import com.mycompany.uml_arqui.classes.absatracts.Profesor;
import java.time.LocalDate;

public class ProfesorPlanta extends Profesor{
    
    private Double salarioBase;

    public ProfesorPlanta(Double salarioBase, String codigoEmpleado, LocalDate fechaContratacion, String departamento, CategoriaProfesor categoria, int aniosExperiencia, String id, String nombre, LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
        super(codigoEmpleado, fechaContratacion, departamento, categoria, aniosExperiencia, id, nombre, fechaNacimiento, direccion, telefono, correo);
        this.salarioBase = salarioBase;
    }

    public ProfesorPlanta() {
        super(null, null, null, null, 0, null, null, null, null, null, null);
    }
    
    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public Double calcularSalario(){
        return 0.0;
    }
}
