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
        int opcao;

        System.out.println("==== Iphone Juca - Simples como Java =====");
        System.out.println("Digite os seguintes números para ativar os aplicativos: ");
        System.out.println("1 - Aparelho Telefônico, 2 - Navegador da Internet, 3 - Reprodutor Musical");
        opcao = scan.nextInt();

        while (opcao != 0) {
            while (opcao == 1) {
                System.out.println("Para usar o aparelho telefônico utilize os seguintes números");
                System.out.println("Digite 1 - Ligar, 2 - Atender, 3 - Desligar, " +
                        "9 - Menu Anterior, 0 - Sair desse App");
                numero = scan.nextInt();
                if(numero == 1){
                    System.out.println(aparelhoTelefonico.ligar());
                    System.out.println();
                }
                if(numero == 2){
                    System.out.println(aparelhoTelefonico.atender());
                    System.out.println();
                }
                if(numero == 3){
                    System.out.println(aparelhoTelefonico.desligar());
                    System.out.println();
                }
                if(numero == 9){
                    opcao = 9;
                    break;
                }
                if(numero == 0){
                    opcao = 0;
                    break;
                }
            }

            while (opcao == 2) {
                System.out.println("Para usar o navegador da internet utilize os seguintes números");
                System.out.println("Digite 1 - Exibir Pagina, 2 - Atualizar Pagina, " +
                        "3 - Add Nova Aba, 9 - Menu Anterior, 0 - Sair desse App");
                numero = scan.nextInt();

                if (numero == 1) {
                    System.out.println(navegadorDaInternet.exibirPagina());
                    System.out.println();
                }
                if (numero == 2) {
                    System.out.println(navegadorDaInternet.atualizarPagina());
                    System.out.println();
                }
                if (numero == 3) {
                    System.out.println(navegadorDaInternet.addNovaAba());
                    System.out.println();
                }
                if(numero == 9){
                    opcao = 9;
                    break;
                }
                if (numero == 0) {
                    opcao = 0;
                    break;
                }
            }
            while (opcao == 3) {
                System.out.println("Para usar o reprodutor musical utilize os seguintes números");
                System.out.println("Digite 1 - Tocar Muscia, 2 - Pausar Musica, " +
                        "9 - Menu Anterior, 0 - Desligar o Celular");
                numero = scan.nextInt();
                if (numero == 1) {
                    System.out.println(reprodutorMusical.tocarMusica());
                    System.out.println();
                }
                if (numero == 2) {
                    System.out.println(reprodutorMusical.pausarMusica());
                    System.out.println();
                }
                if(numero == 9){
                    opcao = 9;
                    break;
                }
                if (numero == 0) {
                    opcao = 0;
                    break;
                }
            }
            while(opcao == 9){
                System.out.println("1 - Aparelho Telefônico, 2 - Navegador da Internet, 3 - Reprodutor Musical");
                opcao = scan.nextInt();
            }
        }
        System.out.println("IPHONE JUCA - DESLIGANDO");
    }
}