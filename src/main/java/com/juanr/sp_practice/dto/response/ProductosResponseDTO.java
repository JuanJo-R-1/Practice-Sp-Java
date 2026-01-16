package com.juanr.sp_practice.dto.response;

public record ProductosResponseDTO(
        Long id,
        String nombre,
        String descripcion,
        String cantidad
        ) {
}
