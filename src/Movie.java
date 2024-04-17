public class Movie {
    String nomeFilme;
    int anoDeLancamento;
    boolean plano;
    double somaDasAvaliacoes;
    int totalDeAvaliacao;
    int duracaoEmMinutos;

//void para método
    void exibirFichaTecnica(){
        System.out.println("Nome do filme : " + nomeFilme + "\nAno de lançamento: " + anoDeLancamento + "\nDuração: " + duracaoEmMinutos);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    //não precisa definir o método pq já é double, return para ele retornar
    double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
