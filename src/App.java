import javax.swing.JOptionPane;
public class App {
    static Inventario inventario = new Inventario();
    public static void main(String[] args) throws Exception {

        dataLoad();
        menu();

    }
    private static void menu() {
        String[] op = {"1.Agregar Producto", "2.Eliminar Producto", "3.Listar Productos", "4.Agregar Categoria",
                "5.Eliminar Categoria", "6.Filtrar Producto por Categoria", "7.Listar Categorias", "8.Salir"};

        while (true) {
            String opSelect = (String) JOptionPane.showInputDialog(
                    null, "Que desea Hacer: ",
                    "Gestion Inventario",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    op,
                    op[0]);

            if (opSelect == null || opSelect.equals("8.Salir")) {
                System.exit(0);
            }

            switch (opSelect) {
                case "1.Agregar Producto":
                    inventario.agregarProducto(addProducto());

                    break;
                case "2.Eliminar Producto":
                    inventario.eliminarProducto(nombreProducto());
                    inventario.listarProductos();


                    break;
                case "3.Listar Productos":
                    inventario.listarProductos();

                    break;
                case "4.Agregar Categoria":
                    inventario.agregarCategoria(JOptionPane.showInputDialog("Nombre de la Categoria"));

                    break;
                case "5.Eliminar Categoria":
                    inventario.eliminarCategoria(nombreCategoria());

                    break;
                case "6.Filtrar Producto por Categoria":
                    inventario.listarProductosPorCategoria(nombreCategoria());

                    break;
                case "7.Listar Categorias":
                    inventario.listarCategorias();
                    break;
            }
        }

    }
    public static Producto addProducto() {
        String nombre = JOptionPane.showInputDialog("Nombre del Producto");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio del Producto"));
        int referencia = Integer.parseInt(JOptionPane.showInputDialog("Numero de Referencia del Producto"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del Producto"));
        Object[] categorias = inventario.getCategorias().values().toArray();
        Object seleccion = JOptionPane.showInputDialog(
                null,
                "Selecciona una opción:",
                "Seleccionar Categoria",
                JOptionPane.QUESTION_MESSAGE,
                null,
                categorias,
                categorias[0]
        );
        String categoria = seleccion.toString();
        return new Producto(nombre, precio, referencia, cantidad, categoria);
    }

    public static String nombreProducto() {
        Object[] productos = inventario.arregloProductos();
        Object op = JOptionPane.showInputDialog(
                null,
                "Seleccione el Producto",
                "Eliminar Producto",
                JOptionPane.QUESTION_MESSAGE,
                null,
                productos,
                productos[0]
        );
        String nombre = op.toString();
        return nombre;
    }

    public static String nombreCategoria() {
        Object[] categorias = inventario.getCategorias().values().toArray();
        Object op = JOptionPane.showInputDialog(
                null,
                "Seleccione la Categoria",
                "Eliminar Categoria",
                JOptionPane.QUESTION_MESSAGE,
                null,
                categorias,
                categorias[0]
        );
        String nombre = op.toString();
        return nombre;
    }

    public static void dataLoad() {
        inventario.agregarProducto("Macbook Pro", 2000, 123, 10, "Computadores");
        inventario.agregarProducto("Iphone 12", 1000, 124, 10, "Celulares");
        inventario.agregarProducto("Samsung S21", 900, 125, 10, "Celulares");
        inventario.agregarProducto("Xbox Series X", 500, 126, 10, "Videojuegos");
        inventario.agregarProducto("Playstation 5", 500, 127, 10, "Videojuegos");


    }
}

