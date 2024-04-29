package screenmovie.model;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean plano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isPlano() {
        return plano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPlano(boolean plano) {
        this.plano = plano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //void para método
    public void exibirFichaTecnica(){
        System.out.println("Nome do filme : " + nome + "\nAno de lançamento: " + anoDeLancamento + "\nDuração: " + duracaoEmMinutos + "\nIncluído no plano: " + plano);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    //não precisa definir o método pq já é double, return para ele retornar
    public double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
