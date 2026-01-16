package com.juanr.sp_practice.dto.request;

import java.math.BigDecimal;

public record VentasRequestDTO (
        String cedulaCliente, String cedulaVendedor, BigDecimal total){
    public Object descripcion() {
        return null;

    }

    public Object nombre() {
        return null;

    }

    public Object cantidad() {
        return null;

    }
}
