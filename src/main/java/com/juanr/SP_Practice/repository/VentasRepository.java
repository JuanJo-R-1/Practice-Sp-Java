package com.juanr.SP_Practice.repository;

import com.juanr.SP_Practice.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentasRepository extends JpaRepository<DetalleVenta, Long> {
}
