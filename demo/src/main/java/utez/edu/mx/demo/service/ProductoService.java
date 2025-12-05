package utez.edu.mx.demo.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import utez.edu.mx.demo.dto.ProductoDTO;
import utez.edu.mx.demo.model.Producto;
import utez.edu.mx.demo.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    //post
    public static Producto create(ProductoDTO productoDTO) {
        if (productoRepository.existsBySkuId(productoDTO.getSkuId())) {
            throw new RuntimeException("El SKU ya existe: " + productoDTO.getSkuId());
        }
        Producto producto = new Producto();
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setStock(productoDTO.getStock());
        producto.setSkuId(productoDTO.getSkuId());
        return productoRepository.save(producto);
    }
    //obtener por ID
    public Optional<Producto> getById(Integer id) {
        return productoRepository.findById(id);
    }
}
