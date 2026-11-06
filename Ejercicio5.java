class Usuario {
    private String nombre;
    private String cedula;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
}

class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }
}

class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso: " + usuario.getNombre()
                    + " (C.I. " + usuario.getCedula() + ") se llevó \""
                    + libro.getTitulo() + "\".");
        } else {
            System.out.println("No disponible: \"" + libro.getTitulo()
                    + "\" ya está prestado. " + usuario.getNombre()
                    + " no pudo llevárselo.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("María", "1801234567");
        Usuario u2 = new Usuario("Carlos", "1809876543");
        Libro libro = new Libro("Cien años de soledad");

        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar();
        p2.registrar();
    }
}
