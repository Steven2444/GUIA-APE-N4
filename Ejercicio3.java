class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    boolean reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            return true;
        }
        System.out.println("Stock insuficiente.");
        return false;
    }

    void mostrarProducto() {
        System.out.println(nombre + " - $" + precio
                + " - Stock: " + stock);
    }
}

class Venta {
    int cantidad;

    Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            System.out.println("Total a pagar: $"
                    + (cantidad * producto.precio));
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 500, 10);
        Venta v = new Venta(2);

        p.mostrarProducto();
        v.aplicar(p);
        p.mostrarProducto();
    }
}