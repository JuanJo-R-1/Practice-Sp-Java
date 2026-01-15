package com.juanr.SP_Practice.mapper;
import com.juanr.SP_Practice.dto.request.DetalleVentaRequestDTO;
import com.juanr.SP_Practice.dto.response.DetalleVentaResponseDTO;
import com.juanr.SP_Practice.model.DetalleVenta;
import com.juanr.SP_Practice.model.Productos;
import com.juanr.SP_Practice.model.Ventas;
import org.springframework.stereotype.Component;

@Component
public class DetalleVentaMapper {
    public DetalleVentaResponseDTO entidadATDO(DetalleVenta detalleVenta) {
        if(detalleVenta==null) return null;
        return new DetalleVentaResponseDTO(
                detalleVenta.getId(),
                detalleVenta.getProductos() != null? detalleVenta.getProductos().getId() : null,
                detalleVenta.getCantidad(),
                detalleVenta.getVentas() != null? detalleVenta.getVentas().getId():null,
                detalleVenta.getSubtotal()
        );

    }
    public DetalleVenta dtoAEntidad(DetalleVentaRequestDTO dto, Productos productos, Ventas ventas){
        if(dto==null) return null;
        DetalleVenta dv=new DetalleVenta();
        dv.setProductos(productos);
        dv.setCantidad(dto.cantidad());
        dv.setVentas(ventas);
        dv.setSubtotal(dto.subtotal());
        return dv;
    }
    public void actualizarEntidadDesdeDTO(DetalleVenta dv, DetalleVentaRequestDTO dto, Productos productos, Ventas ventas){
        if (dto==null) return;
        dv.setProductos(productos);
        dv.setCantidad(dto.cantidad());
        dv.setVentas(ventas);
        dv.setSubtotal(dto.subtotal());

    }
}

