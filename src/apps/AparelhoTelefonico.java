package apps;

public class AparelhoTelefonico implements AtivarFuncoes{

    private String mensagem;
    private int numero;

    private boolean ligado;

    public AparelhoTelefonico(){}

    public String ligar(){
        ligado = ativaFuncao();
        if(ligado){
            mensagem = "Ligando para outra pessoa";
        }
        else{
            mensagem = "Não houve sucesso na ligação";
        }
        return mensagem;
    }

    public String atender(){
        ligado = ativaFuncao();
        if(ligado){
            mensagem = "Recebendo ligação com sucesso";
        }
        else{
            mensagem = "Não foi possível receber a chamada";
        }
        return mensagem;
    }

    public String desligar(){
        if(ligado){
            ligado = desativarFuncao();
            mensagem = "Chamada encerrada com sucesso";
        }
        else{
            mensagem = "Aparentemente o telefone não está em chamada";
        }
        return mensagem;
    }


    @Override
    public boolean ativaFuncao() {
        return true;
    }

    @Override
    public boolean desativarFuncao() {
        return false;
    }
}
