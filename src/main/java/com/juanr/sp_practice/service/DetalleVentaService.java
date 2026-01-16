package com.juanr.sp_practice.service;

import com.juanr.sp_practice.dto.request.DetalleVentaRequestDTO;
import com.juanr.sp_practice.dto.response.DetalleVentaResponseDTO;

import java.util.List;

public interface DetalleVentaService {
    DetalleVentaResponseDTO guardarDetalleVenta(DetalleVentaRequestDTO dto);

    List<DetalleVentaResponseDTO> obtenerTodas();

    DetalleVentaResponseDTO obtenerPorId(Long id);

    DetalleVentaResponseDTO actualizarDetalleVenta(Long id, DetalleVentaRequestDTO dto);

    void eliminarDetalleVenta(Long ig);

    List<DetalleVentaResponseDTO> obtenerPorCantidad(Integer cantidad);
}
