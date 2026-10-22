package uniquindio.edu.co.Escenario4;

public class ProductoCatalogo {

    private String codigo;
    private String nombre;
    private double precio;
    private String categoria;

    public ProductoCatalogo(String codigo, String nombre,
                            double precio, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "ProductoCatalogo{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
