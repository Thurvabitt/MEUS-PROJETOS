package Sistema_Gerenciador_de_Quartos_de_Hotel;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

	public class Hotel {
 		private List<Quarto> quartos;

    public Hotel() {
        quartos = new ArrayList<>();
    }

    //Criando quarto
    
    public void inserirQuarto(Quarto quarto) {
        quartos.add(quarto);
        System.out.println("Quarto adicionado.");
    }

    //Mostrar quartos listados
    
    public void exibirQuartos() {
        if (quartos.isEmpty()) {
            System.out.println("Nenhum quarto listado.");
            return;
        }

        for (Quarto quarto : quartos) {
            quarto.info();
            System.out.println();
        }
    }
    
    //Edita somente a diária do quarto já listado

    public void editarQuarto(int numeroQuarto) {
    	
        for (Quarto quarto : quartos) {
        	
            if (quarto.getNumQuarto() == numeroQuarto) {
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Novo valor da diária: ");
                double novaDiaria = scanner.nextDouble();
                quarto.diaria = novaDiaria;
                
                System.out.println("Quarto editado.");
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    
    //Excluir quarto já listado
    
    public void excluirQuarto(int numQuarto) {
    	
        for (Quarto quarto : quartos) {
        	
            if (quarto.getNumQuarto() == numQuarto) {
                quartos.remove(quarto);
                System.out.println("Quarto excluído.");
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }
}
