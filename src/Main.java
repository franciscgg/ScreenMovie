//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Movie myMovie = new Movie();
      myMovie.nomeFilme = "Scarface";
      myMovie.anoDeLancamento = 1973;
      myMovie.duracaoEmMinutos = 180;

    //Chamar o método
    myMovie.exibirFichaTecnica();
    myMovie.avalia(8);
    myMovie.avalia(5);
    myMovie.avalia(7);

        System.out.println(myMovie.somaDasAvaliacoes);
        System.out.println(myMovie.totalDeAvaliacao);
        System.out.println(myMovie.retornaMedia());
    }
}