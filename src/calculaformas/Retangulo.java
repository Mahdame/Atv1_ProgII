package calculaformas;

import java.util.Scanner;

public class Retangulo extends Poligono {

    public double base, altura;
    public String forma = "Retangulo";

    Scanner scan = new Scanner(System.in);

    public Retangulo() {
        System.out.println("Opcao escolhida: RETANGULO.\n");

        System.out.print("Quantidade de lados: ");
        qtdLados = scan.nextInt();

        System.out.print("\nValor da base: ");
        base = scan.nextDouble();

        System.out.print("\nValor da altura: ");
        altura = scan.nextDouble();
    }

    @Override
    public double CalcularArea() {
        double areaRetangulo = base * altura;
        return areaRetangulo;
    }

    @Override
    public void Imprimir() {
        System.out.println("\nEste poligono e um " + forma + " e possui " + qtdLados + " lados!");
        System.out.println("Sua base e de " + base + " e sua altura de " + altura + ".");
        System.out.println("A area do " + forma + " e de " + CalcularArea() + ".\n");
    }
}
