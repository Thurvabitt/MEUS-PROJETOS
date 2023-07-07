package agenda2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato por nome");
            System.out.println("3. Buscar contato por e-mail");
            System.out.println("4. Buscar contato por parte do nome, e-mail ou telefone");
            System.out.println("5. Listar contatos");
            System.out.println("6. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = scanner.nextLine();

                    // Verificar se o nome já existe
                    boolean nomeExiste = false;
                    for (Contato c : contatos) {
                        if (c.getNome().equalsIgnoreCase(nome)) {
                            nomeExiste = true;
                            break;
                        }
                    }
                    if (nomeExiste) {
                        System.out.println("O nome do contato já existe.");
                        break;
                    }

                    System.out.println("Digite o telefone do contato:");
                    String telefone = scanner.nextLine();

                    System.out.println("Digite o e-mail do contato:");
                    String email = scanner.nextLine();

                    // Verificar se o e-mail já existe
                    boolean emailExiste = false;
                    for (Contato c : contatos) {
                        if (c.getEmail().equalsIgnoreCase(email)) {
                            emailExiste = true;
                            break;
                        }
                    }
                    if (emailExiste) {
                        System.out.println("O e-mail do contato já existe.");
                        break;
                    }

                    System.out.println("Digite o endereço comercial do contato:");
                    String enderecoComercial = scanner.nextLine();

                    System.out.println("Digite o endereço residencial do contato:");
                    String enderecoResidencial = scanner.nextLine();

                    Endereco endereco = new Endereco(enderecoComercial, enderecoResidencial);
                    Contato contato = new Contato(nome, telefone, email, endereco);
                    contatos.add(contato);

                    System.out.println("Contato adicionado com sucesso.");
                    break;
                case 2:
                    System.out.println("Digite o nome do contato:");
                    String nomeBusca = scanner.nextLine();

                    for (Contato c : contatos) {
                        if (c.getNome() != null && c.getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Contato encontrado:");
                            System.out.println("Nome: " + c.getNome());
                            System.out.println("Telefone: " + c.getTelefones());
                            System.out.println("E-mail: " + c.getEmail());
                            System.out.println("Endereço Comercial: " + c.getEndereco().getEnderecoComercial());
                            System.out.println("Endereço Residencial: " + c.getEndereco().getEnderecoResidencial());
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o e-mail do contato:");
                    String emailBusca = scanner.nextLine();

                    for (Contato c : contatos) {
                        if (c.getEmail().equalsIgnoreCase(emailBusca)) {
                            System.out.println("Contato encontrado:");
                            System.out.println("Nome: " + c.getNome());
                            System.out.println("Telefone: " + c.getTelefones());
                            System.out.println("E-mail: " + c.getEmail());
                            System.out.println("Endereço Comercial: " + c.getEndereco().getEnderecoComercial());
                            System.out.println("Endereço Residencial: " + c.getEndereco().getEnderecoResidencial());
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Digite o trecho do nome, e-mail ou telefone:");
                    String trecho = scanner.nextLine();

                    for (Contato c : contatos) {
                        if (c.getNome().contains(trecho) || c.getEmail().contains(trecho) || c.getTelefones().contains(trecho)) {
                            System.out.println("Contato encontrado:");
                            System.out.println("Nome: " + c.getNome());
                            System.out.println("Telefone: " + c.getTelefones());
                            System.out.println("E-mail: " + c.getEmail());
                            System.out.println("Endereço Comercial: " + c.getEndereco().getEnderecoComercial());
                            System.out.println("Endereço Residencial: " + c.getEndereco().getEnderecoResidencial());
                        }
                    }
                    break;
                case 5:
                    listarContatos(contatos);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }

    private static void listarContatos(List<Contato> contatos) {
        System.out.println("Lista de contatos:");

        Set<String> nomes = new HashSet<>();
        Set<String> emails = new HashSet<>();

        for (Contato c : contatos) {
            if (!nomes.contains(c.getNome()) && !emails.contains(c.getEmail())) {
                System.out.println("Nome: " + c.getNome());
                System.out.println("Telefone: " + c.getTelefones());
                System.out.println("E-mail: " + c.getEmail());
                System.out.println("Endereço Comercial: " + c.getEndereco().getEnderecoComercial());
                System.out.println("Endereço Residencial: " + c.getEndereco().getEnderecoResidencial());
                System.out.println("-----------");

                nomes.add(c.getNome());
                emails.add(c.getEmail());
            }
        }
    }
}