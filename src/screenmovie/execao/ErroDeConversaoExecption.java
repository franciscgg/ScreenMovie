package screenmovie.execao;

public class ErroDeConversaoExecption extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoExecption(String mensagem) {
        super(mensagem);
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }


}