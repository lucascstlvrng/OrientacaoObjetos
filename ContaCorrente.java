public class ContaCorrente extends Conta {
    private static final double TAXA = 0.05;

    public ContaCorrente(int numero, Cliente dono) {
        super(numero, dono);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (saldo >= valor + TAXA) {
            this.sacar(valor + TAXA);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}