package com.juanr.SP_Practice.model;

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


}
