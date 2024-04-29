import screenmovie.calculation.FiltroRecomendacao;
import screenmovie.calculation.TimeCalculator;
import screenmovie.model.Episodio;
import screenmovie.model.Movie;
import screenmovie.model.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Movie myMovie = new Movie("Scarface",1973);
      myMovie.setDuracaoEmMinutos(180);
      myMovie.setPlano(true);

    //Chamar o método
    myMovie.exibirFichaTecnica();
    myMovie.avalia(8);
    myMovie.avalia(5);
    myMovie.avalia(7);

        System.out.println(String.format("Total de avaliações: %d ",myMovie.getTotalDeAvaliacao()));
        System.out.println(String.format("Media dos filme: %.1f " , myMovie.retornaMedia()));


        Serie peppaPig = new Serie("Peppa Pig", 2017);
        peppaPig.exibirFichaTecnica();
        peppaPig.setTemporadas(7);
        peppaPig.setEpisodiosPorTemporada(25);
        peppaPig.setMinutosPorEpisodios(25);
        System.out.println("Duração da maratonar Peppa Pig: " + peppaPig.getDuracaoEmMinutos());

        Movie myMovieTwo = new Movie("Logan",2017);
        myMovieTwo.setDuracaoEmMinutos(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.inclui(myMovie);
        calculator.inclui(myMovieTwo);
        calculator.inclui(peppaPig);
        System.out.println(calculator.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtro(myMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(5);
        episodio.setSerie(peppaPig);
        episodio.setTotalVisualizacoes(300);
        filtro.filtro(episodio);

        var myMovieThree = new Movie("Wolverine",2017);
        myMovieThree.setDuracaoEmMinutos(200);
        myMovieThree.setAnoDeLancamento(2008);
        myMovieThree.avalia(10);


        ArrayList<Movie> filmes = new ArrayList<>();
        filmes.add(myMovie);
        filmes.add(myMovieTwo);
        filmes.add(myMovieThree);
        System.out.println(String.format("Tamanho da lista de filmes: " + filmes.size()));
        System.out.println("Primeiro filme: " + filmes.get(0).getNome());
        System.out.println(filmes);

    }
}