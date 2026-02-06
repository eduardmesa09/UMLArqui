package com.mycompany.uml_arqui.classes;

import com.mycompany.uml_arqui.classes.absatracts.Persona;
import com.mycompany.uml_arqui.enums.EstadoEstudiante;
import java.time.LocalDate;

public class Estudiante extends Persona{
    
    private String codigoEstudiante;
    private LocalDate fechaIngreso;
    private Double promedioAcumulado;
    private EstadoEstudiante estado;

    public Estudiante(String codigoEstudiante, LocalDate fechaIngreso, Double promedioAcumulado, EstadoEstudiante estado, String id, String nombre, LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
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

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
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

    public EstadoEstudiante getEstado() {
        return estado;
    }

    public void setEstado(EstadoEstudiante estado) {
        this.estado = estado;
    }
}