package com.juanr.sp_practice.service;

import com.juanr.sp_practice.dto.request.ProductosRequestDTO;
import com.juanr.sp_practice.dto.response.ProductosResponseDTO;
import java.util.List;

public interface ProductosService {
    ProductosResponseDTO guardarProducto(ProductosRequestDTO dto);

    List<ProductosResponseDTO> obtenerTodas();

    ProductosResponseDTO obtenerPorId(Long id);

    ProductosResponseDTO actualizarProducto(Long id, ProductosRequestDTO dto);

    void eliminarProducto(Long ig);

    List<ProductosResponseDTO> obtenerPorCantidad(Integer cantidad);
}
