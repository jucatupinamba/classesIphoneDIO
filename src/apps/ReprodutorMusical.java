package apps;

public class ReprodutorMusical implements AtivarFuncoes{

    private String musicaAtual;

    boolean tocandoMusica;

    public ReprodutorMusical(){}


    @Override
    public boolean ativaFuncao() {
        return true;
    }

    @Override
    public boolean desativarFuncao() {
        return false;
    }

    public String tocarMusica(){
        tocandoMusica = ativaFuncao();
        String resposta;
        if(tocandoMusica){
            resposta = "Música tocando";
        }
        else{
            resposta = "Houve um problema na reprodução da música";
        }
        return resposta;
    }

    public String pausarMusica(){
        tocandoMusica = desativarFuncao();
        String resposta;
        if(!tocandoMusica){
            resposta = "Música pausada";
        }
        else{
            resposta = "Não há música tocando";
        }
        return resposta;
    }
}
