package utez.edu.mx.demo.dto;

public class ProductoDTO {
    private String nombre;
    private Double precio;
    private String sku;
    private Integer stock;
    //constructor vacio
    public ProductoDTO(){
    }
    //getter y setters
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
    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public String getSkuId() {
        return sku;
    }
    public void setSkuId(String skuId) {
        this.sku = skuId;
    }
}
