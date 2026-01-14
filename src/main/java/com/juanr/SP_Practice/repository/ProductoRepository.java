package com.juanr.SP_Practice.repository;

import com.juanr.SP_Practice.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductoRepository  extends JpaRepository<Productos, Long> {
    List<Productos> findByNombre(String nombre);
    //select * from productos where nombre='rerer';
    List<Productos> findByCantidad(Integer cantidad);
    boolean existsByNombreAndCantidad(String nombre, Integer Cantidad);
    boolean existsByCantidadAndDescripcionIgnoreCase(Integer cantidad, String descripcion);

    @Modifying(clearAutomatically = true)
    @Query("UPDATE productos p set p.cantidad=p.cantidad+ :stock where p.id= :id")
    void actualizaProducto(@Param("stock") Integer stock, @Param("id") Long id);
}
