package com.mycompany.uml_arqui.classes;

import com.mycompany.uml_arqui.enums.CategoriaProfesor;
import com.mycompany.uml_arqui.classes.absatracts.Profesor;
import java.time.LocalDate;

public class ProfesorCatedra extends Profesor{
    
    private Double valorHora;
    private Double horasDictadas;

    public ProfesorCatedra(Double valorHora, Double horasDictadas, String codigoEmpleado, LocalDate fechaContratacion, String departamento, CategoriaProfesor categoria, int aniosExperiencia, String id, String nombre, LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
        super(codigoEmpleado, fechaContratacion, departamento, categoria, aniosExperiencia, id, nombre, fechaNacimiento, direccion, telefono, correo);
        this.valorHora = valorHora;
        this.horasDictadas = horasDictadas;
    }

    public ProfesorCatedra() {
        super(null, null, null, null, 0, null, null, null, null, null, null);
    }
    
    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHorasDictadas() {
        return horasDictadas;
    }

    public void setHorasDictadas(Double horasDictadas) {
        this.horasDictadas = horasDictadas;
    }
    
    public Double calcularSalario() {
        return 0.0;
    }
}