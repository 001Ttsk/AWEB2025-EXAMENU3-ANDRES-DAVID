package utez.edu.mx.demo.controller;

import jakarta.annotation.PostConstruct;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import utez.edu.mx.demo.dto.ProductoDTO;
import utez.edu.mx.demo.model.Producto;
import utez.edu.mx.demo.service.ProductoService;
import java.util.Map;
import java.util.Optional;

public class ProductoController {
    ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    //create
    @PostMapping
    public ResponseEntity<Producto> addProducto(@RequestBody ProductoDTO productoDTO){
        Producto producto = ProductoService.create(ProductoDTO);
        return new ResponseEntity<>(producto, HttpStatus.CREATED);
    }

    //getById
    @GetMapping({"/{id}"})
    public ResponseEntity<Producto> getById(@PathVariable Integer id) {
        Optional<Producto> producto = productoService.getById(id);
        if (producto.isPresent()) {
            return new ResponseEntity<>(producto.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    //put/actualizar
    @PutMapping
}
