package área2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do quadrado:");
        double ladoQuadrado = scanner.nextDouble();
        FiguraGeometrica quadrado = new Quadrado(ladoQuadrado);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        System.out.println("Digite a base do retângulo:");
        double baseRetangulo = scanner.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double alturaRetangulo = scanner.nextDouble();
        FiguraGeometrica retangulo = new Retangulo(baseRetangulo, alturaRetangulo);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());

        System.out.println("Digite a base do triângulo:");
        double baseTriangulo = scanner.nextDouble();
        System.out.println("Digite a altura do triângulo:");
        double alturaTriangulo = scanner.nextDouble();
        FiguraGeometrica triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

        System.out.println("Digite o raio do círculo:");
        double raioCirculo = scanner.nextDouble();
        FiguraGeometrica circulo = new Circulo(raioCirculo);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        scanner.close();
    }
}
