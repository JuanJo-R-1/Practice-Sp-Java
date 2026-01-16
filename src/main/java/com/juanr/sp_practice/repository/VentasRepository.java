package com.juanr.sp_practice.repository;

import com.juanr.sp_practice.model.DetalleVenta;
import com.juanr.sp_practice.model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VentasRepository extends JpaRepository<DetalleVenta, Long> {
    List<Ventas> findByNombre(String nombre);
    //select * from productos where nombre='rerer';
    List<Ventas> findByCantidad(Integer cantidad);
    boolean existsByNombreAndCantidad(String nombre, Integer Cantidad);
    boolean existsByCantidadAndDescripcionIgnoreCase(Integer cantidad, String descripcion);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE productos p set p.cantidad=p.cantidad+ :stock where p.id= :id")
    void actualizaProducto(@Param("stock") Integer stock, @Param("id") Long id);
}

