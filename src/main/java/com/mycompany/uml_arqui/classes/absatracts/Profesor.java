package com.mycompany.uml_arqui.classes.absatracts;

import com.mycompany.uml_arqui.enums.CategoriaProfesor;
import java.util.Date;

public abstract class Profesor extends Persona{
    
    private String codigoEmpleado;
    private Date fechaContratacion;
    private String departamento;
    private CategoriaProfesor categoria;
    private int aniosExperiencia;

    public Profesor(String codigoEmpleado, Date fechaContratacion, String departamento, CategoriaProfesor categoria, int aniosExperiencia, String id, String nombre, Date fechaNacimiento, String direccion, String telefono, String correo) {
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

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
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
}
