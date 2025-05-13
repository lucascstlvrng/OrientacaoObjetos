public class ContaSalario extends ContaCorrente {
    private static final double TAXA = 0.01;

    public ContaSalario(int numero, Cliente dono) {
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
}