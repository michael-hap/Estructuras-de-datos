package uniquindio.edu.co.ejercicio1;

public class Producto implements Comparable<Producto>{
    public String codigo, nombre;
    public double precio;

    public Producto(String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre= nombre;
        this.precio= precio;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public void setCodigo(String codigo){
        this.codigo=codigo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setPrecio(double precio){
        this.precio=precio;
    }


    @Override
    public int compareTo(Producto otroProducto) {
        return codigo.compareTo(otroProducto.getCodigo());
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}