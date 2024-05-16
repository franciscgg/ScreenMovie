package screenmovie.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import screenmovie.execao.ErroDeConversaoExecption;
import screenmovie.model.Titulo;
import screenmovie.model.TituloOmdb;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MovieService {
    private Gson gson;

    public MovieService() {
        this.gson = new GsonBuilder().setFieldNamingPolicy(com.google.gson.FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
    }

    public Titulo convertToTitulo(String json) throws ErroDeConversaoExecption {
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        return new Titulo(meuTituloOmdb);
    }

    public void saveTitulosToFile(List<Titulo> titulos, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(gson.toJson(titulos));
        writer.close();
    }
}
