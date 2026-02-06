package com.mycompany.uml_arqui.classes.absatracts;

import java.time.LocalDate;

public abstract class Persona {
    
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correo;    

    public Persona(String id, String nombre, LocalDate fechaNacimiento, String direccion, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
