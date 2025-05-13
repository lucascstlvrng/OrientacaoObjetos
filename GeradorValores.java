import java.util.Random;

public class GeradorValores {
    private static final String[] NOMES = {"João", "Maria", "Pedro", "Ana", "Carlos", "Mariana", "Lucas", "Fernanda"};
    private static final String[] SOBRENOMES = {"Silva", "Santos", "Oliveira", "Souza", "Pereira", "Costa", "Almeida", "Ferreira"};
    private static final Random RANDOM = new Random();

    // Gera um nome aleatório
    public static String gerarNome() {
        String nome = NOMES[RANDOM.nextInt(NOMES.length)];
        String sobrenome = SOBRENOMES[RANDOM.nextInt(SOBRENOMES.length)];
        return nome + " " + sobrenome;
    }

    // Gera um telefone aleatório no formato (XX) XXXXX-XXXX
    public static String gerarTelefone() {
        int ddd = RANDOM.nextInt(90) + 10; // Gera DDD entre 10 e 99
        int prefixo = RANDOM.nextInt(90000) + 10000; // Gera número entre 10000 e 99999
        int sufixo = RANDOM.nextInt(9000) + 1000; // Gera número entre 1000 e 9999
        return String.format("(%d) %d-%d", ddd, prefixo, sufixo);
    }

    // Gera um valor monetário aleatório entre 1 e 1000
    public static double gerarValorMonetario() {
        return RANDOM.nextDouble() * 999 + 1; // Gera valor entre 1 e 1000
    }
}