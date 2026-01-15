package com.juanr.SP_Practice.dto.response;

public record ProductosResponseDTO(
        Long id,
        String nombre,
        String descripcion,
        String cantidad
        ) {
}
