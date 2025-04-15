public class Aluno{
    String nome;
    String matricula;

    public void inserirNome(String nome){
        this.nome = nome;
    }

    toString
}

public class Musica{
    String nome;
    String artista;
    String album;
    int anoLancamento;
    Compositor compositor; //Associação entre Música e Compositor
    private ArrayList<Compositor> compositores = new ArrayList<>(); // Lista de compositores

    Musica(String nome){
        this.nome = nome;
    }
    public void adicionarCompositor(Compositor compositor){
        this.compositores.add(compositor);
    }
    public toString(){
        return "Nome: " + nome + ", Artista: " + artista + ", Album: " + album + ", Ano de Lançamento: " + anoLancamento;
    }
    
}

public class Compositor{
    String nome;
    String nacionalidade;

    public String toString(){
        return "Nome: " + nome + ", Nacionalidade: " + nacionalidade;
    }
    
    public void inserirNome(String nome){
        this.nome = nome;
    }
    
    public void inserirNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public void inserirAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }
    
    public void inserirAnoFalecimento(int anoFalecimento){
        this.anoFalecimento = anoFalecimento;
    }

public classs CadastroMusicas{
    public static 
        Compositor c = new Compositor("Ludwig van Beethoven", "Alemão");
        c.inserirAnoNascimento(1770);

        mu1.adicionarCompositor(c);
        mu1.adicionarCompositor(c2);
        Musica mu2 = new Musica("Symphony No. 5");
        mu2.ano = 1808;
        mu2.tipo = "Sinfonia";

        mu2.adicionarCompositor(c);
        String mensagem = mu1.toString() + "\n" + mu2.toString();
        JOptionPane.showMessageDialog(null, mensagem, "Cadastro de Músicas", JOptionPane.INFORMATION_MESSAGE);
}