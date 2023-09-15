
package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<String, Producto> inventario = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int opcion;

        do {
            Menu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarProducto();
                    break;
                case 2:
                    listarProductos();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
        scanner.close();
    }
    public static void Menu(){

        System.out.println("Bienvenido a la aplicación de gestión de inventario");
        System.out.println("1. Registrar un producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
    private static void registrarProducto() {
        scanner.nextLine();
        System.out.println("Ingrese los datos del producto:");
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Descripción (opcional): ");
        String descripcion = scanner.nextLine();
        System.out.println("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("ID (código de barras): ");
        String codigoBarras = scanner.nextLine();
        System.out.println("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine();

        Producto producto = new Producto(nombre, descripcion, precio, codigoBarras, stock);
        inventario.put(codigoBarras, producto);

        System.out.println("Registro exitoso.");
    }

    private static void listarProductos() {
        System.out.println("Inventario de productos:");
        for (Producto producto : inventario.values()) {
            System.out.println(producto);
        }
    }
}

class Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private String codigoBarras;
    private int stock;

    public Producto(String nombre, String descripcion, double precio, String codigoBarras, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", Descripción: " + descripcion +
                ", Precio: " + precio +
                ", Código de Barras: " + codigoBarras +
                ", Stock: " + stock;
    }
}
