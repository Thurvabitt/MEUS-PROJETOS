package Sistema_Gerenciador_de_Quartos_de_Hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {	
        Scanner scanner = new Scanner(System.in);
        
        Hotel hotel = new Hotel();

        int opcao;
        
        //Laço de repetição
        
        do {
            Menu();
            opcao = Opcao(scanner);

            switch (opcao) {
            
                case 1:
                    Quarto quarto = criarQuarto(scanner);
                    hotel.inserirQuarto(quarto);
                    break;
                    
                case 2:
                    hotel.exibirQuartos();
                    break;
                    
                case 3:
                    int numeroQuarto = lerNumeroQuarto(scanner);
                    hotel.editarQuarto(numeroQuarto);
                    break;
                    
                case 4:
                    numeroQuarto = lerNumeroQuarto(scanner);
                    hotel.excluirQuarto(numeroQuarto);
                    break;
                    
                case 5:
                    System.out.println("Saiu.");
                    break;
                    
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println();
            
        } while (opcao != 5);
    }

    private static void Menu() {
        System.out.println("MENU");
        System.out.println("1. Inserir quarto");
        System.out.println("2. Exibir quartos");
        System.out.println("3. Editar quarto");
        System.out.println("4. Excluir quarto");
        System.out.println("5. Sair");
    }

    //Variável (opção) do laço de repetição
    
    private static int Opcao(Scanner scanner) {
    	
        int opcao;
        
        while (true) {
        	
            try {
                System.out.print("Digite a opção: ");
                opcao = scanner.nextInt();
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida.");
                scanner.nextLine();
            }
        }
        return opcao;
    }
    
    //Método de criação de quarto

    private static Quarto criarQuarto(Scanner scanner) {
    	
        int tipoQuarto;
        
        while (true) {
        	
            try {
                System.out.println("Tipo de quarto:");
                System.out.println("1. Quarto Simples");
                System.out.println("2. Quarto de Luxo");
                System.out.print("Escolha o tipo de quarto: ");
                tipoQuarto = scanner.nextInt();
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida.");
                scanner.nextLine();
            }
        }

        System.out.print("Número do quarto: ");
        int numQuarto = scanner.nextInt();

        System.out.print("Valor da diária: ");
        double diaria = scanner.nextDouble();
        
        if (tipoQuarto == 1) {
        	
            System.out.print("Quantidade de camas: ");
            int quantidadeCamas = scanner.nextInt();
            
            return new QuartoSimples(numQuarto, diaria, quantidadeCamas);
            
        } else {
        	
            System.out.print("Quantidade de camas: ");
            int quantidadeCamas = scanner.nextInt();
            
            System.out.print("Possui hidromassagem? S ou N: ");
            String opcao = scanner.next();
            boolean hidromassagem = opcao.equalsIgnoreCase("S");
            
            return new QuartoLuxo(numQuarto, diaria, quantidadeCamas, hidromassagem);
        }
    }
    
    private static int lerNumeroQuarto(Scanner scanner) {
    	
        System.out.print("Digite o número do quarto: ");
        return scanner.nextInt();
        
    }
}
