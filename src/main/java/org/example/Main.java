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

}

