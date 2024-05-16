package screenmovie.model;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbApiClient {
    private static final String API_KEY = "eb7641c1";

    public String searchMovie(String title) throws IOException, InterruptedException {
        String encodedTitle = URLEncoder.encode(title, "UTF-8");
        String url = "https://www.omdbapi.com/?t=" + encodedTitle + "&apikey=" + API_KEY;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
