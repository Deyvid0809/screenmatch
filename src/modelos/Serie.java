package modelos;

public class Serie extends Titulo {
    
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisódio;

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisódio() {
        return minutosPorEpisódio;
    }

    public int getTemporadas() {
        return temporadas;
    }
    
    public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void setMinutosPorEpisódio(int minutosPorEpisódio) {
        this.minutosPorEpisódio = minutosPorEpisódio;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisódio;
    }

    

}
