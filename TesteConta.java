public class TesteConta {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(GeradorValores.gerarNome(), GeradorValores.gerarTelefone());
        Cliente cliente2 = new Cliente(GeradorValores.gerarNome(), GeradorValores.gerarTelefone());

        ContaCorrente cc = new ContaCorrente(1, cliente1);
        cc.depositar(GeradorValores.gerarValorMonetario());
        System.out.println(String.format("Saldo CC após depósito: %.2f", cc.getSaldo()));

        cc.sacar(GeradorValores.gerarValorMonetario() / 2);
        System.out.println(String.format("Saldo CC após saque: %.2f", cc.getSaldo()));

        ContaPoupanca cp = new ContaPoupanca(2, cliente2);
        cp.depositar(GeradorValores.gerarValorMonetario());
        System.out.println(String.format("Saldo CP após depósito: %.2f", cp.getSaldo()));

        cp.atualizaSaldo(10);
        System.out.println(String.format("Saldo CP após atualização: %.2f", cp.getSaldo()));

        // Teste de transferência
        cc.transferir(25, cp);
        System.out.println(String.format("Saldo CC após transferência: %.2f", cc.getSaldo()));
        System.out.println(String.format("Saldo CP após receber transferência: %.2f", cp.getSaldo()));

        // Conta contapoup = new ContaPoupanca(3, cliente1);
        ContaPoupanca contapoup = new ContaPoupanca(3, cliente1);
        contapoup.depositar(GeradorValores.gerarValorMonetario());
        if (contapoup instanceof ContaPoupanca) {
            ContaPoupanca contaPoupanca = (ContaPoupanca) contapoup;
            contaPoupanca.atualizaSaldo(10);
            System.out.println(String.format("Saldo Conta Poupança após atualização: %.2f", contaPoupanca.getSaldo()));
        } else {
            System.out.println("A conta não é uma Conta Poupança.");
        }

        ContaSalario cs = new ContaSalario(4, cliente1);
        cs.depositar(GeradorValores.gerarValorMonetario());
    }
}