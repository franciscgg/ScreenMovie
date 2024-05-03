package screenmovie.main;

import screenmovie.model.Movie;
import screenmovie.model.Serie;
import screenmovie.model.Titulo;

import java.util.*;

public class MainWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Scarface", 1973);
        myMovie.avalia(10);
        Movie myMovieTwo = new Movie("Logan", 2017);
        myMovieTwo.avalia(10);
        var myMovieThree = new Movie("Wolverine", 2008);
        myMovieThree.avalia(10);
        Serie peppaPig = new Serie("Peppa Pig", 2017);

            List<Titulo> list = new LinkedList<>();
            list.add(myMovie);
            list.add(myMovieTwo);
            list.add(myMovieThree);
            list.add(peppaPig);
            for (Titulo item: list){
                System.out.println(item.getNome());
                if(item instanceof Movie movie && movie.getClassificacao() > 2){
                    System.out.println("Classificação: " + ((Movie) movie).getClassificacao());
                }
            }

            ArrayList<String> buscaPorArtista = new ArrayList<>();
            buscaPorArtista.add("Hugh Jackman");
            buscaPorArtista.add("Ryan Reynolds");
            buscaPorArtista.add("Dafne Keen");
            System.out.println(buscaPorArtista);
            Collections.sort(buscaPorArtista);
            System.out.println("Ordem alfabética: " + buscaPorArtista);
            Collections.sort(list);
            System.out.println(list);
            list.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Ordem Ano de lançamento: " + buscaPorArtista);
            System.out.println(list);
    }
}
