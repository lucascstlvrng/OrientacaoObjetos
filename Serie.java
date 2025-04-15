public class Serie extends ProgramaTV{
    private int quantTemporadas;
    private int quantEpisodios;

    Serie(int codigo, String nome, String categoria, int quantTemporadas, int quantEpisodios) {
        super(codigo, nome, categoria); // Chama o construtor da superclasse ProgramaTV
        this.quantTemporadas = quantTemporadas;
        this.quantEpisodios = quantEpisodios;
    }

    public int getQuantTemporadas() {
        return quantTemporadas;
    }
    public void setQuantTemporadas(int quantTemporadas) {
        this.quantTemporadas = quantTemporadas;
    }
    public int getQuantEpisodios() {
        return quantEpisodios;
    }
    public void setQuantEpisodios(int quantEpisodios) {
        this.quantEpisodios = quantEpisodios;
    }

    public String toString() {
        return "Temporadas: " + quantTemporadas + ", Episódios: " + quantEpisodios;
    }
}
