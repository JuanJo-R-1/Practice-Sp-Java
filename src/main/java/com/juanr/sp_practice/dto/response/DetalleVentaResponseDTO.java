package com.juanr.sp_practice.dto.response;

import java.math.BigDecimal;

public record DetalleVentaResponseDTO(
        Long id,
        Long productosId,
        Long ventasId,
        BigDecimal subtotal) {

    public DetalleVentaResponseDTO(Object id2, Long long1, Object cantidad, Long long2, Object subtotal2) {
        //TODO Auto-generated constructor stub
    }
}
