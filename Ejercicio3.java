class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            return true;
        } else {
            System.out.println("Stock insuficiente.");
            return false;
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("-----------------------------");
    }
}

class Venta {
    private int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    public void aplicar(Producto producto) {
        if (producto.reducirStock(cantidad)) {
            double total = cantidad * producto.getPrecio();
            System.out.println("Venta realizada. Total a pagar: $" + total);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 500.0, 10);
        p.mostrarProducto();

        Venta v1 = new Venta(3);
        v1.aplicar(p);
        p.mostrarProducto();

        Venta v2 = new Venta(20);
        v2.aplicar(p);
        p.mostrarProducto();
    }
}
