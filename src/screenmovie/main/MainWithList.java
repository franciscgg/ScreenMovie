package screenmovie.main;

import screenmovie.model.Movie;
import screenmovie.model.Serie;
import screenmovie.model.Titulo;

import java.util.ArrayList;

public class MainWithList {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Scarface", 1973);
        myMovie.avalia(10);
        Movie myMovieTwo = new Movie("Logan", 2017);
        myMovieTwo.avalia(10);
        var myMovieThree = new Movie("Wolverine", 2017);
        myMovieThree.avalia(10);
        Serie peppaPig = new Serie("Peppa Pig", 2017);

        ArrayList<Titulo> list = new ArrayList<>();
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
    }
}
