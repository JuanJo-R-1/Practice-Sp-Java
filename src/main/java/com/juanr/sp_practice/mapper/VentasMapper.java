package com.juanr.sp_practice.mapper;

import com.juanr.sp_practice.dto.response.VentasResponseDTO;
import com.juanr.sp_practice.dto.request.VentasRequestDTO;
import com.juanr.sp_practice.model.DetalleVenta;
import com.juanr.sp_practice.model.Ventas;
import org.springframework.stereotype.Component;

@Component
public class VentasMapper {
    public VentasResponseDTO entidadATDO(DetalleVenta ventas) {
        if(ventas==null) return null;
        return new VentasResponseDTO(
                ventas.getId(),
                ventas.getId(dto.nombre()),
                ventas.getDescripcion(),
                ventas.getCantidad()
        );

    }
    public VentasResponseDTO dtoAEntidad(VentasRequestDTO dto, Ventas ventas){
        if(dto==null) return null;
        Ventas v=new Ventas();
        return new VentasResponseDTO(
                v.getNombre(dto.nombre()),
                v.setDescripcion(dto.descripcion()),
                v.setCantidad(dto.cantidad())
        );
    }
    public Ventas actualizarEntidad(VentasRequestDTO dto){
        if (dto==null) return null;
        Ventas v = new Ventas();
        v.setNombre(dto.nombre());
        v.setDescripcion(dto.descripcion());
        v.setCantidad(dto.cantidad());
        return v;

    }

    public void actualizarEntidadDesdeDTO(DetalleVenta ventas, VentasRequestDTO dto){
        Ventas v = new Ventas();
        v.setNombre(dto.nombre());
        v.setDescripcion(dto.descripcion());
        v.setCantidad(dto.cantidad());
    }
}

