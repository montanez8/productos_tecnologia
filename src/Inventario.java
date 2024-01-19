import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.swing.JOptionPane;

public class Inventario {
    private Map<Integer, Producto> productos = new HashMap<>();
    private Map<Integer, String> categorias = new HashMap<>();

    public Inventario() {
        int i = 1;
        for (Categoria categoria : Categoria.values()) {
            categorias.put(i, categoria.getNombre());
            i++;
        }

    }

    public Map<Integer, String> getCategorias() {
        return categorias;
    }

    public Map<Integer, Producto> getProductos() {
        return productos;
    }
    // metodo para agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        if (productos.containsKey(producto.getNumeroReferencia())) {
            JOptionPane.showMessageDialog(null, "El producto ya existe en el inventario.");

        } else {
            productos.put(producto.getNumeroReferencia(), producto);
            JOptionPane.showMessageDialog(null, "Producto agregado con exito.\n".concat(producto.mostrarProducto()));
        }

    }

    // metodo para agregar un producto al inventario sin usar la clase Producto
    public void agregarProducto(String nombre, double precio, int numeroReferencia, int cantidad, String categoria) {
        if (productos.containsKey(numeroReferencia)) {
            JOptionPane.showMessageDialog(null, "El producto ya existe en el inventario.");
        } else {
            productos.put(numeroReferencia, new Producto(nombre, precio, numeroReferencia, cantidad, categoria));

        }
    }

    // array de nombres de productos
    public Object[] arregloProductos() {
        Object[] productos = new Object[this.productos.size()];
        int i = 0;
        for (Map.Entry<Integer, Producto> entry : this.productos.entrySet()) {
            productos[i] = entry.getValue().getNombre();
            i++;
        }
        return productos;
    }

    // metodo para eliminar producto del inventario por nombre
    public void eliminarProducto(String nombre) {
        productos.entrySet().removeIf(entrada -> Objects.equals(entrada.getValue().getNombre(), nombre));
        JOptionPane.showMessageDialog(null, "Producto eliminado con exito.");
    }

    public void listarProductos() {
        StringBuilder ms = new StringBuilder();
        for (Map.Entry<Integer, Producto> entry : getProductos().entrySet()) {
            ms.append(entry.getValue().getNombre().concat("\n"));
        }
        JOptionPane.showMessageDialog(null, ms.toString());
    }


    // metodo para add nueva categoria
    public void agregarCategoria(String categoria) {
        if (categorias.containsValue(categoria)) {
            JOptionPane.showMessageDialog(null, "La categoria ya existe en el inventario.");
        }
        categorias.put(categorias.size() + 1, categoria);
    }

    // metodo para eliminar una categoria
    public void eliminarCategoria(String nombreCategoria) {
        if (!categorias.containsValue(nombreCategoria)) {
            JOptionPane.showMessageDialog(null, "La categoria no existe en el inventario.");
        }
        categorias.entrySet().removeIf(entrada -> Objects.equals(entrada.getValue(), nombreCategoria));
        JOptionPane.showMessageDialog(null, "Categoria eliminada con exito.");
    }

    // listar productos por categoria
    public void listarProductosPorCategoria(String categoria) {
        StringBuilder ms = new StringBuilder();
        for (Map.Entry<Integer, Producto> entrada : productos.entrySet()) {
            if (entrada.getValue().getCategoria().equals(categoria)) {
                ms.append(entrada.getValue().getNombre().concat("\n"));
            }
        }
        JOptionPane.showMessageDialog(null, ms.toString());
    }

    // listar categorias
    public void listarCategorias() {
        StringBuilder ms = new StringBuilder();
        for (Map.Entry<Integer, String> entrada : categorias.entrySet()) {
            ms.append(entrada.getValue().concat("\n"));
        }
        JOptionPane.showMessageDialog(null, ms.toString());
    }


}
