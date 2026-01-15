package com.juanr.SP_Practice.service;

import com.juanr.SP_Practice.dto.request.ProductosRequestDTO;
import com.juanr.SP_Practice.dto.response.ProductosResponseDTO;
import java.util.List;

public interface ProductosService {
    ProductosResponseDTO guardarProducto(ProductosRequestDTO dto);

    List<ProductosResponseDTO> obtenerTodas();

    ProductosResponseDTO obtenerPorId(Long id);

    ProductosResponseDTO actualizarProducto(Long id, ProductosResponseDTO dto);

    void eliminarProducto(Long ig);

    List<ProductosResponseDTO> obtenerPorCantidad(Integer cantidad);


}
