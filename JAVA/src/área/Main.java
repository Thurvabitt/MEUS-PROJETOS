package área;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica quadrado = new Quadrado(5);
        FiguraGeometrica retangulo = new Retangulo(4, 6);
        FiguraGeometrica triangulo = new Triangulo(3, 4);
        FiguraGeometrica circulo = new Circulo(2);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
    }
}