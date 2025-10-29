public class Nodo {
    String nombre;
    int cantidad;
    double precio;
    Nodo siguiente; 

    //constructor
    public Nodo(String nombre, int cantidad, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.siguiente = null;
    }

    
    public double getSubtotal() {
        return cantidad * precio;
    }
}
