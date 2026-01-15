package com.juanr.SP_Practice.dto.request;

import java.math.BigDecimal;

public record VentasRequestDTO (
        String cedulaCliente, String cedulaVendedor, BigDecimal total){
}
