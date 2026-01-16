package com.juanr.sp_practice.controller;


import com.juanr.sp_practice.dto.request.ProductosRequestDTO;
import com.juanr.sp_practice.dto.response.ProductosResponseDTO;
import com.juanr.sp_practice.service.ProductosService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductosController {
    private final ProductosService productosService;

    @PostMapping
    public ResponseEntity<ProductosResponseDTO> crearProducto(@RequestBody ProductosRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productosService.guardarProducto(dto));
    }

    @GetMapping
    public ResponseEntity<List<ProductosResponseDTO>> listarProductos() {
        return ResponseEntity.ok(productosService.obtenerTodas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductosResponseDTO> obtenerProductosPorId(@PathVariable Long id){
        return ResponseEntity.ok(productosService.obtenerPorId(id));
    }

    @GetMapping("/{cantidad}")
    public ResponseEntity<List<ProductosResponseDTO>> obtenerProductosPorCantidad(@RequestParam Integer cantidad) {
        return ResponseEntity.ok(productosService.obtenerPorCantidad(cantidad));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductosResponseDTO> actualizarProducto(@PathVariable Long id, @RequestBody ProductosRequestDTO dto) {
        return ResponseEntity.ok(productosService.actualizarProducto(id,dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductosResponseDTO> eliminarProducto(@PathVariable Long id) {
        productosService.eliminarProducto(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
