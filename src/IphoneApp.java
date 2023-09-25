import apps.AparelhoTelefonico;
import apps.NavegadorDaInternet;
import apps.ReprodutorMusical;

import java.util.Scanner;

public class IphoneApp {
    public static void main(String[] args) {

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        NavegadorDaInternet navegadorDaInternet = new NavegadorDaInternet();
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("==== Iphone Juca - Simples como Java =====");
        System.out.println("Digite os seguintes números para ativar os aplicativos: ");
        System.out.println("1 - Aparelho Telefônico, 2 - Navegador da Internet, 3 - Reprodutor Musical");
        int opcao = scan.nextInt();

        while(opcao != 0){
            if(opcao == 1){
                System.out.println("Para usar o aparelho telefônico utilize os seguintes números");
                System.out.println("Digite 1 - Ligar, 2 - Atender, 3 - Desligar, 0 - Sair desse App");
                numero = scan.nextInt();
                switch (numero){
                    case 1:
                        aparelhoTelefonico.ligar();
                        break;

                    case 2:
                        aparelhoTelefonico.atender();
                        break;

                    case 3:
                        aparelhoTelefonico.desligar();

                    case 0:
                        opcao = 0;
                        break;
                }
        }

            if(opcao == 2){
                System.out.println("Para usar o navegador da internet utilize os seguintes números");
                System.out.println("Digite 1 - Exibir Pagina, 2 - Atualizar Pagina, " +
                        "3 - Add Nova Aba, 0 - Sair desse App");
                numero = scan.nextInt();
                switch (numero){
                    case 1:
                        navegadorDaInternet.exibirPagina();
                        break;

                    case 2:
                        navegadorDaInternet.atualizarPagina();
                        break;

                    case 3:
                        navegadorDaInternet.addNovaAba();
                        break;

                    case 0:
                        opcao = 0;
                        break;
                }
            }


            if(opcao == 3){
                System.out.println("Para usar o reprodutor musical utilize os seguintes números");
                System.out.println("Digite 1 - Tocar Muscia, 2 - Pausar Musica, 0 - Sair desse App");
                numero = scan.nextInt();
                switch (numero){
                    case 1:
                        reprodutorMusical.tocarMusica();
                        break;

                    case 2:
                        reprodutorMusical.pausarMusica();
                        break;

                    case 0:
                        opcao = 0;
                        break;
                }
            }
        }
    }
}