class Autor {
    String nombre, nacionalidad;

    Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
}

class Libro1 {
    String titulo;
    int anio;
    Autor autor;

    Libro1(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    void mostrarInformacion() {
        System.out.println(titulo + " - " + anio
                + " - Autor: " + autor.nombre);
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel Garcia Marquez", "Colombiano");
        Autor a2 = new Autor("Julio Cortazar", "Argentino");

        Libro1 l1 = new Libro1("Cien anos de soledad", 1967, a1);
        Libro1 l2 = new Libro1("Rayuela", 1963, a2);

        l1.mostrarInformacion();
        l2.mostrarInformacion();
    }
}