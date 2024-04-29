package screenmovie.model;

import screenmovie.calculation.Classificavel;

public class Movie extends Titulo implements Classificavel {
    private String diretor;

    public Movie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) retornaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "\nAno de lançamento: " + this.getAnoDeLancamento() + "\nDuração: " + this.getDuracaoEmMinutos();
    }
}
