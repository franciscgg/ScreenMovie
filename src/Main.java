import screenmovie.calculation.TimeCalculator;
import screenmovie.model.Movie;
import screenmovie.model.Serie;

public class Main {
    public static void main(String[] args) {
      Movie myMovie = new Movie();
      myMovie.setNome("Scarface");
      myMovie.setAnoDeLancamento(1973);
      myMovie.setDuracaoEmMinutos(180);
      myMovie.setPlano(true);

    //Chamar o método
    myMovie.exibirFichaTecnica();
    myMovie.avalia(8);
    myMovie.avalia(5);
    myMovie.avalia(7);

        System.out.println(String.format("Total de avaliações: %d ",myMovie.getTotalDeAvaliacao()));
        System.out.println(String.format("Media dos filme: %.1f " , myMovie.retornaMedia()));


        Serie peppaPig = new Serie();
        peppaPig.setNome("Peppa Pig");
        peppaPig.setAnoDeLancamento(2017);
        peppaPig.exibirFichaTecnica();
        peppaPig.setTemporadas(7);
        peppaPig.setEpisodiosPorTemporada(25);
        peppaPig.setMinutosPorEpisodios(25);
        System.out.println("Duração da maratonar Peppa Pig: " + peppaPig.getDuracaoEmMinutos());

        Movie anotherMovie = new Movie();
        anotherMovie.setNome("Logan");
        anotherMovie.setAnoDeLancamento(2017);
        anotherMovie.setDuracaoEmMinutos(200);

        TimeCalculator calculator = new TimeCalculator();
        calculator.inclui(myMovie);
        calculator.inclui(anotherMovie);
        calculator.inclui(peppaPig);
        System.out.println(calculator.getTempoTotal());
    }
}