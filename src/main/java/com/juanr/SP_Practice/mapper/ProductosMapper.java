package com.juanr.SP_Practice.mapper;

import com.juanr.SP_Practice.dto.response.ProductosResponseDTO;
import com.juanr.SP_Practice.dto.request.ProductosRequestDTO;
import com.juanr.SP_Practice.model.Productos;
import org.springframework.stereotype.Component;

@Component
public class ProductosMapper {
    public ProductosResponseDTO entidadATDO(Productos productos) {
        if(productos==null) return null;
        return new ProductosResponseDTO(
                productos.getId(),
                productos.getNombre(),
                productos.getDescripcion(),
                productos.getCantidad()
        );

    }
    public Productos dtoAEntidad(ProductosRequestDTO dto, Productos productos){
        if(dto==null) return null;
        Productos p=new Productos();
        p.setNombre(dto.nombre()),
        p.setDescripcion(dto.descripcion()),
        p.setCantidad(dto.cantidad());
        return p;
    }
    public Productos actualizarEntidad(ProductosRequestDTO dto){
        if (dto==null) return null;
        Productos p = new Productos();
        p.setNombre(dto.nombre());
        p.setDescripcion(dto.descripcion());
        p.setCantidad(dto.cantidad());
        return p;

    }
}
