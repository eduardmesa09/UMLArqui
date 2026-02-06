package com.mycompany.uml_arqui.classes.absatracts;

import com.mycompany.uml_arqui.enums.CategoriaProfesor;
import java.time.LocalDate;

public abstract class Profesor extends Persona{
    
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private String departamento;
    private CategoriaProfesor categoria;
    private int aniosExperiencia;

    public Profesor(String codigoEmpleado, LocalDate fechaContratacion, String departamento, CategoriaProfesor categoria, int aniosExperiencia, String id, String nombre, LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
        super(id, nombre, fechaNacimiento, direccion, telefono, correo);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.departamento = departamento;
        this.categoria = categoria;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public String getInfo(){
        return "";
    }
    
    public void registrar(){
        
    }
    
    public String consultarCargaAcademica(){
        return "";
    }

    public CategoriaProfesor getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProfesor categoria) {
        this.categoria = categoria;
    }
}
