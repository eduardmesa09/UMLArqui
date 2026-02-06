package com.mycompany.uml_arqui.classes;

import com.mycompany.uml_arqui.classes.absatracts.Persona;
import com.mycompany.uml_arqui.enums.EstadoEstudiante;
import java.util.Date;

public class Estudiante extends Persona{
    
    private String codigoEstudiante;
    private Date fechaIngreso;
    private Double promedioAcumulado;
    private EstadoEstudiante estado;

    public Estudiante(String codigoEstudiante, Date fechaIngreso, Double promedioAcumulado, EstadoEstudiante estado, String id, String nombre, Date fechaNacimiento, String direccion, String telefono, String correo) {
        super(id, nombre, fechaNacimiento, direccion, telefono, correo);
        this.codigoEstudiante = codigoEstudiante;
        this.fechaIngreso = fechaIngreso;
        this.promedioAcumulado = promedioAcumulado;
        this.estado = estado;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Double getPromedioAcumulado() {
        return promedioAcumulado;
    }

    public void setPromedioAcumulado(Double promedioAcumulado) {
        this.promedioAcumulado = promedioAcumulado;
    }
    
    public String getInfo(){
        return"";
    }
    
    public void registrar(){
        
    }
    
    public Double calcularPromedio(){
        return 0.0;
    }
    
    public String verificarGrado(){
        return "";
    }
}