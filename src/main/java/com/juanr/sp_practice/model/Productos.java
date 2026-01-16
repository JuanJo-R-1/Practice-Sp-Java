package com.juanr.sp_practice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter @Setter
@AllArgsConstructor
public class Productos {
    public Long getId() {
        return null;
    }

    public String getNombre() {
        return null;

    }

    public String getDescripcion() {
        return null;

    }

    public String getCantidad() {
        return null;

    }

    public void setNombre(String nombre) {
    }

    public void setDescripcion(String descripcion) {

    }

    public void setCantidad(Integer cantidad) {
    }
}
