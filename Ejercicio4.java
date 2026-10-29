class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void transferir(Cuenta destino, double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            destino.saldo += monto;
            System.out.println("Transferencia exitosa");
        } else {
            System.out.println("Transferencia fallida");
        }
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Cuenta a = new Cuenta("Ana", 100);
        Cuenta b = new Cuenta("Luis", 50);

        a.transferir(b, 40);
        a.transferir(b, 200);

        System.out.println("Saldo Ana: " + a.saldo);
        System.out.println("Saldo Luis: " + b.saldo);
    }
}