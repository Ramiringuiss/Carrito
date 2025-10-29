public class ListaCarrito {
    private Nodo cabeza;
    //(Agrega al final)
    public void agregarProducto(String nombre, int cantidad, double precio) {
        Nodo nuevo = new Nodo(nombre, cantidad, precio);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        System.out.println("✅ Producto agregado correctamente.");
    }

    // Mostrar todos los productos en el carrito
    public void mostrarCarrito() {
        if (cabeza == null) {
            System.out.println("🛒 El carrito está vacío.");
            return;
        }

        System.out.println("\n--- Productos en el carrito ---");
        Nodo actual = cabeza;
        int i = 1;
        double total = 0;

        while (actual != null) {
            System.out.printf("%d. %s - Cantidad: %d - Precio: S/%.2f - Subtotal: S/%.2f\n",
                    i, actual.nombre, actual.cantidad, actual.precio, actual.getSubtotal());
            total += actual.getSubtotal();
            actual = actual.siguiente;
            i++;
        }

        System.out.printf("TOTAL ACTUAL: S/%.2f\n", total);
    }

    // Eliminar producto por posición (número en la lista)
    public void eliminarProducto(int posicion) {
        if (cabeza == null) {
            System.out.println("No hay productos para eliminar.");
            return;
        }

        if (posicion == 1) {
            cabeza = cabeza.siguiente;
            System.out.println("Producto eliminado correctamente.");
            return;
        }

        Nodo actual = cabeza;
        for (int i = 1; actual != null && i < posicion - 1; i++) {
            actual = actual.siguiente;
        }

        if (actual == null || actual.siguiente == null) {
            System.out.println("Posición inválida.");
            return;
        }

        actual.siguiente = actual.siguiente.siguiente;
        System.out.println("Producto eliminado correctamente.");
    }

    // Calcular el total de la compra
    public double calcularTotal() {
        double total = 0;
        Nodo actual = cabeza;
        while (actual != null) {
            total += actual.getSubtotal();
            actual = actual.siguiente;
        }
        return total;
    }

    // Vaciar completamente el carrito
    public void vaciarCarrito() {
        cabeza = null;
        System.out.println("Carrito vaciado correctamente.");
    }

    // Verificar si el carrito está vacío
    public boolean estaVacio() {
        return cabeza == null;
    }
}
