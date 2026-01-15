package com.juanr.SP_Practice.dto.response;

import java.math.BigDecimal;

public record DetalleVentaResponseDTO(
        Long id,
        Long productosId,
        Long ventasId,
        BigDecimal subtotal) {
}
