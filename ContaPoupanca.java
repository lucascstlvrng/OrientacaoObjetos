public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, Cliente dono) {
        super(numero, dono);
    }

    public void atualizaSaldo(double percentual) {
        saldo += saldo * (percentual / 100);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            super.depositar(valor);
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }
}