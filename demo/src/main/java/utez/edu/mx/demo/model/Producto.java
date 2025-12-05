package utez.edu.mx.demo.model;
import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false, length = 50)
    private Integer stock;

    @Column(name = "sku_id", nullable = false, unique = true, length = 50)
    private String skuId;

    //constructor vacio
    public Producto() {
    }

    //consturctor
    public Producto(String nombre, Double precio, Integer stock, String skuId) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.skuId = skuId;
    }

    //getters y setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
}
