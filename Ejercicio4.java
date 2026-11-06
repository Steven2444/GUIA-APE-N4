class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public void transferir(Cuenta destino, double monto) {
        if (retirar(monto)) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Fondos insuficientes. No se pudo transferir $" + monto);
        }
    }

    public void mostrarSaldo() {
        System.out.println(titular + " - Saldo: $" + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 500.0);
        Cuenta c2 = new Cuenta("Luis", 100.0);

        System.out.println("Saldos iniciales:");
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        System.out.println("\nTransferencia válida:");
        c1.transferir(c2, 200.0);
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        System.out.println("\nTransferencia que falla:");
        c1.transferir(c2, 1000.0);
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}
