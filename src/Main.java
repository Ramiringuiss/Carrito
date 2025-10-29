import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaCarrito carrito = new ListaCarrito();
        int opcion;

        do {
            System.out.println("\n===== MENÚ CARRITO DE COMPRAS =====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar carrito");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Calcular total");
            System.out.println("5. Vaciar carrito");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese cantidad: ");
                    int cantidad = sc.nextInt();

                    System.out.print("Ingrese precio por unidad: ");
                    double precio = sc.nextDouble();

                    carrito.agregarProducto(nombre, cantidad, precio);
                    break;

                case 2:
                    carrito.mostrarCarrito();
                    break;

                case 3:
                    carrito.mostrarCarrito();
                    if (!carrito.estaVacio()) {
                        System.out.print("Ingrese número del producto a eliminar: ");
                        int pos = sc.nextInt();
                        carrito.eliminarProducto(pos);
                    }
                    break;

                case 4:
                    double total = carrito.calcularTotal();
                    System.out.printf("Total: S/%.2f\n", total);
                    break;

                case 5:
                    carrito.vaciarCarrito();
                    break;

                case 6:
                    System.out.println("Fn");
                    break;

                default:
                    System.out.println("Opcion invalida, ingrese otra vez :v");
            }

        } while (opcion != 6);

        sc.close();
    }
}
