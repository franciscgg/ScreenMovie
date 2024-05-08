package screenmovie.main;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmovie.execao.ErroDeConversaoExecption;
import screenmovie.model.Titulo;
import screenmovie.model.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme para busca: ");
        String search = scanner.nextLine();
        String encodedSearch = URLEncoder.encode(search, "UTF-8");
        String endereco = "https://www.omdbapi.com/?t=" + encodedSearch + "&apikey=eb7641c1";
        try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();;
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json,TituloOmdb.class);
        System.out.println(meuTituloOmdb);
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido: " + meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        }catch (ErroDeConversaoExecption e){
            System.out.println(e.getMessage());
        }

        System.out.println("O programa finalizou corretamente");
    }
}
