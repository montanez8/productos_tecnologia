
public class Producto {
    private String nombre;
    private double precio;
    private int numeroReferencia;
    private int cantidad;
    private String categoria;

    public Producto(String nombre, double precio, int numeroReferencia, int cantidad, String categoria) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String mostrarProducto() {
        String mensaje = "Nombre: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Numero de Referencia: " + numeroReferencia + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "Categoria: " + categoria;
        return mensaje;
        
    }
    @Override
    public String toString() {
        return "Producto [cantidad=" + cantidad + ", categoria=" + categoria + ", nombre=" + nombre
                + ", numeroReferencia=" + numeroReferencia + ", precio=" + precio + "]";
    }




}
