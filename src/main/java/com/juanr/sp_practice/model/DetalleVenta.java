package com.juanr.sp_practice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_venta")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productos", nullable = false, updatable = false)
    private Productos productos;
    @Column(nullable = false)
    private Integer cantidad;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venta_id", nullable = false, updatable = false)
    private Ventas ventas;
    @Column(nullable = false)
    private BigDecimal subtotal;


    public Object getSubtotal() {
        return null;
    }

    public Productos getVentas() {
        return null;

    }

    public Object getCantidad() {
        return null;

    }

    public Productos getProductos() {
        return null;

    }

    public Object getId() {
        return null;

    }

    public void setProductos(Productos productos) {
    }

    public void setCantidad(Integer cantidad) {
    }

    public void setVentas(Ventas ventas) {
    }

    public void setSubtotal(BigDecimal subtotal) {
    }

    public Object getDescripcion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDescripcion'");
    }
}
