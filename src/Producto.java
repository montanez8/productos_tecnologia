public class Producto {
    private String nombre;
    private int precio;
    private int numeroReferencia;
    private int cantidad;
    private Categoria categoria;

    public Producto(String nombre, int precio, int numeroReferencia, int cantidad, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.numeroReferencia = numeroReferencia;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nPrecio: " + precio + "\nCantidad: " + cantidad;
    }

}
