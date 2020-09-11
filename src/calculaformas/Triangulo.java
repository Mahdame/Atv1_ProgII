package calculaformas;

import java.util.Scanner;

public class Triangulo extends Poligono {

    public double base, altura;
    public String forma = "Triangulo";

    Scanner scan = new Scanner(System.in);

    public Triangulo() {
        System.out.println("Opcao escolhida: TRIANGULO.\n");

        System.out.print("Quantidade de lados: ");
        qtdLados = scan.nextInt();

        System.out.print("\nValor da base: ");
        base = scan.nextDouble();

        System.out.print("\nValor da altura: ");
        altura = scan.nextDouble();
    }

    @Override
    public double CalcularArea() {
        double areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    @Override
    public void Imprimir() {
        System.out.println("\nEste poligono e um " + forma + " e possui " + qtdLados + " lados!");
        System.out.println("Sua base e de " + base + " e sua altura de " + altura + ".");
        System.out.println("A area do " + forma + " e de " + CalcularArea() + ".\n");
    }
}
