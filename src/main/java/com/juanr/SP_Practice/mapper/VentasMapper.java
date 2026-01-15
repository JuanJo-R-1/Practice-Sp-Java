package com.juanr.SP_Practice.mapper;

import com.juanr.SP_Practice.dto.response.VentasResponseDTO;
import com.juanr.SP_Practice.dto.request.VentasRequestDTO;
import com.juanr.SP_Practice.model.Ventas;
import org.springframework.stereotype.Component;

@Component
public class VentasMapper {
    public VentasResponseDTO entidadATDO(Ventas ventas) {
        if(ventas==null) return null;
        return new VentasResponseDTO(
                ventas.getId(),
                ventas.getNombre(),
                ventas.getDescripcion(),
                ventas.getCantidad()
        );

    }
    public Ventas dtoAEntidad(VentasRequestDTO dto, Ventas ventas){
        if(dto==null) return null;
        Ventas v=new Ventas();
        return new VentasResponseDTO(
                v.setNombre(dto.nombre()),
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
}

}
