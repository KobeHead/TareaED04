package inventario;

/**
 * Clase que representa un producto con nombre, precio y stock.
 * 
 * @author Prof. ED
 * @version 1.0
 * @since 2025-01-15
 */
public class Producto {

    /**
     * Método para crear una nueva instancia de Producto.
     * 
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible en stock.
     * @return Una nueva instancia de Producto.
     */
    public static Producto crearProducto(String nombre, double precio, int stock) {
        return new Producto(nombre, precio, stock);
    }
    
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor de la clase Producto.
     * 
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible en stock.
     */
    private Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Muestra la información del producto en la consola.
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }

    /**
     * Obtiene el nombre del producto.
     * 
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     * 
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     * 
     * @param precio Nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el stock del producto.
     * 
     * @return Cantidad en stock del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece el stock del producto.
     * 
     * @param stock Nueva cantidad de stock del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}