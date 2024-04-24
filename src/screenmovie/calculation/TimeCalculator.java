package screenmovie.calculation;

import screenmovie.model.Movie;
import screenmovie.model.Serie;
import screenmovie.model.Titulo;

public class TimeCalculator {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Movie f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
