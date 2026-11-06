public class Main {

    // Version con error de compilacion (no se puede compilar):
    // public int sumar(int a, int b) {
    //     System.out.println(a + b);
    // }
    // Error: el metodo declara retorno int pero no tiene return.

    // Correccion 1: agregar return con el tipo declarado
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Correccion 2: si solo imprime, cambiar el tipo de retorno a void
    public static void mostrarSuma(int a, int b) {
        System.out.println("Suma: " + (a + b));
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);
        System.out.println("Resultado con return: " + resultado);
        mostrarSuma(5, 3);
    }
}
