class Usuario {
    String nombre, cedula;

    Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
}

class Libro {
    String titulo;
    boolean disponible = true;

    Libro(String titulo) {
        this.titulo = titulo;
    }

    boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    void devolver() {
        disponible = true;
    }
}

class Prestamo {
    Usuario usuario;
    Libro libro;

    Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    void registrar() {
        if (libro.prestar())
            System.out.println(usuario.nombre + " presto el libro");
        else
            System.out.println("Libro no disponible");
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito");

        Usuario a = new Usuario("Ana", "123");
        Usuario b = new Usuario("Luis", "456");

        new Prestamo(a, libro).registrar();
        new Prestamo(b, libro).registrar();
    }
}