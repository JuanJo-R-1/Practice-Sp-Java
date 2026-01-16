package com.juanr.sp_practice.service;

import com.juanr.sp_practice.dto.response.VentasResponseDTO;
import com.juanr.sp_practice.model.Ventas;

import java.util.List;

public interface VentasService {
    VentasResponseDTO guardarVentas(VentasResponseDTO dto);

    List<VentasResponseDTO> obtenerTodas();

    VentasResponseDTO obtenerPorId(Long id);

    VentasResponseDTO actualizarVentas(Long id, Ventas dto);

    List<VentasResponseDTO> obtenerPorCantidad(Integer cantidad);
}

