import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<Integer, Producto> productos = new HashMap<>();
    private Map<Integer, Categoria> categorias = new HashMap<>();

    public Inventario() {
        categorias.put(1, Categoria.COMPUTADORES);
        categorias.put(2, Categoria.CELULARES);
        categorias.put(3, Categoria.ELECTRODOMESTICOS);
        categorias.put(4, Categoria.TV);
        categorias.put(5, Categoria.ACCESORIOS);
        categorias.put(6, Categoria.VIDEOJUEGOS);
        categorias.put(7, Categoria.AUDIO_Y_VIDEO);

    }

    // metodo para agregar un producto al inventario

    public void agregarProducto(Producto producto) {
        if (productos.containsKey(producto.getNumeroReferencia())) {
            throw new IllegalArgumentException("El producto ya existe en el inventario.");
        }
        productos.put(producto.getNumeroReferencia(), producto);
    }

    // metodo para eliminar un producto del inventario
    public void eliminarProducto(int numeroReferencia) {
        if (!productos.containsKey(numeroReferencia)) {
            throw new IllegalArgumentException("El producto no existe en el inventario.");
        }
        productos.remove(numeroReferencia);
    }

}
