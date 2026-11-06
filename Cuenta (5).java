public class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Objeto como parametro: la cuenta destino se recibe como argumento
    public void transferir(Cuenta destino, double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo = this.saldo - monto;      // retira de la cuenta actual
            destino.saldo = destino.saldo + monto; // deposita en la destino
            System.out.println("Transferencia exitosa de $" + monto
                    + " de " + titular + " a " + destino.titular);
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de "
                    + titular);
        }
    }

    public void mostrarSaldo() {
        System.out.println(titular + " : $" + saldo);
    }
}
