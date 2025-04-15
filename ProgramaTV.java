public class ProgramaTV{
    private int contador = 0; //contador para o número de programas
    int codigo; 
    String nome;
    ArrayList <Pessoa> artistas = new ArrayList<Pessoa>();//agregando a classe pessoa Pessoa
    Pessoa diretor; //diretor é um objeto da classe pessoa
    String categoria; //categoria é um atributo da classe pessoa


    ProgramaTV(int codigo, String nome, String categoria){
        this.codigo = contador++;
        this.nome = nome;
        this.categoria = categoria;
    }
    void setDiretor(Pessoa diretor){
        this.diretor = diretor;
    }
    void setArtistas(Pessoa artista){
        artistas.add(artista);
    }
    public String toString(){
        String programa = codigo + " - " + nome + " - (" + categoria + ")\n";
        programa = programa + "Diretor: " + diretor + "\n";
        programa = programa + "Artistas: \n";
        for(int i = 0; i < artistas.size(); i++){
            programa = programa + artistas.get(i) + "\n";
        }
        return programa;
    }
}