package calculaformas;

import java.util.Scanner;

public class CalculaFormas {

    public static void main(String[] args) {

        int opcao;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Selecione uma forma para calcular a area:");
            System.out.println("1 - TRIANGULO");
            System.out.println("2 - RETANGULO");
            System.out.println("0 - SAIR\n");
            System.out.print("Digite a opcao: ");
            opcao = scan.nextInt();

            if (!OperacaoValida(opcao)) {
                continue;
            }

            if (opcao == 0) {
                System.out.println("SAINDO...");
                break;
            }

            switch (opcao) {
                case 1:
                    Triangulo triangulo = new Triangulo();

                    triangulo.CalcularArea();
                    triangulo.Imprimir();
                    break;
                case 2:
                    Retangulo retangulo = new Retangulo();

                    retangulo.CalcularArea();
                    retangulo.Imprimir();
                    break;
            }

        } while (opcao != 0);
    }

    static boolean OperacaoValida(int opcao) {
        boolean retorno = true;
        if (opcao > 2) {
            System.out.println("ERRO: Operacao invalida.\n");
            retorno = false;
        }
        return retorno;
    }
}
