package com.juanr.sp_practice.dto.request;

import java.math.BigDecimal;

public record DetalleVentaRequestDTO(
        Long productoId, Integer cantidad, Long ventasId, BigDecimal subtotal) {
}
