package screenmovie.main;

import screenmovie.execao.ErroDeConversaoExecption;
import screenmovie.model.MovieService;
import screenmovie.model.OmdbApiClient;
import screenmovie.model.Titulo;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        OmdbApiClient apiClient = new OmdbApiClient();
        MovieService movieService = new MovieService();
        List<Titulo> titulos = new ArrayList<>();
        String search = "";

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Digite o nome do filme para busca: ");
            search = scanner.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String json = apiClient.searchMovie(search);
                System.out.println(json);

                Titulo meuTitulo = movieService.convertToTitulo(json);
                System.out.println("Titulo convertido: " + meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (ErroDeConversaoExecption e) {
                System.out.println(e.getMessage());
            }
        }

        movieService.saveTitulosToFile(titulos, "filmes.json");
        System.out.println("O programa finalizou corretamente");
    }
}
