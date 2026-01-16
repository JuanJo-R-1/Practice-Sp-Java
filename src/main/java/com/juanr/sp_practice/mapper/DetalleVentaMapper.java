package com.juanr.sp_practice.mapper;
import com.juanr.sp_practice.dto.request.DetalleVentaRequestDTO;
import com.juanr.sp_practice.dto.response.DetalleVentaResponseDTO;
import com.juanr.sp_practice.model.DetalleVenta;
import com.juanr.sp_practice.model.Productos;
import com.juanr.sp_practice.model.Ventas;
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

