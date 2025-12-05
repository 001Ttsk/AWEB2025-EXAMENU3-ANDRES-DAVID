package utez.edu.mx.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utez.edu.mx.demo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    boolean existsBySkuId(String skuId);
}