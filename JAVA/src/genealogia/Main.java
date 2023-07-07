package genealogia;

public class Main {
    public static void main(String[] args) {
        Pessoa pai = new Pessoa("José", 40);
        Pessoa mae = new Pessoa("Maria", 38);
        Pessoa filho = new Pessoa("João", 15, pai, mae);

        System.out.println("Filho: " + filho.getNome());
        System.out.println("Idade: " + filho.getIdade());
        System.out.println("Pai: " + filho.getPai().getNome());
        System.out.println("Mãe: " + filho.getMae().getNome());
    }
}
