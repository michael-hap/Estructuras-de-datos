package uniquindio.edu.co.ejercicio6;

public class Producto {
    public String nombre, codigo;
    public double precio;

    public Producto(String nombre, String codigo, double precio){
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCodigo(){
        return codigo;
    }

    public double getPrecio(){
        return precio;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre +
                ", codigo=" + codigo +
                ", precio=" + precio;
    }
}
