package com.mycompany.uml_arqui.enums;

public enum CategoriaProfesor {
    TITULAR("Titular"),
    ASOCIADO("Asociado"),
    ASISTENTE("Asistente"),
    CATEDRATICO("Catedrático");
    
    private final String descripcion;

    CategoriaProfesor(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
