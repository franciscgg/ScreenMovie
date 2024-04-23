import screenmovie.model.Movie;

public class Main {
    public static void main(String[] args) {
      Movie myMovie = new Movie();
      myMovie.setNomeFilme("Scarface");
      myMovie.setAnoDeLancamento(1973);
      myMovie.setDuracaoEmMinutos(180);
      myMovie.setPlano(true);

    //Chamar o método
    myMovie.exibirFichaTecnica();
    myMovie.avalia(8);
    myMovie.avalia(5);
    myMovie.avalia(7);

        System.out.println("Total de avaliações: " + myMovie.getTotalDeAvaliacao());
        System.out.println("Media dos filme: " + myMovie.retornaMedia());

    }
}