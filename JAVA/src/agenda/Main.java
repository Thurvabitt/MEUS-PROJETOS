package agenda;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua Comercial, 123", "Rua Residencial, 456");
        Endereco endereco2 = new Endereco("Avenida Comercial, 789", "Avenida Residencial, 012");

        Contato contato1 = new Contato("João", "111111111", "joao@email.com", endereco1);
        contato1.adicionarTelefone("222222222");

        Contato contato2 = new Contato("Maria", "333333333", "maria@email.com", endereco2);
        contato2.adicionarTelefone("444444444");

        Agenda agenda = new Agenda();
        agenda.adicionarContato(contato1);
        agenda.adicionarContato(contato2);

        Contato contatoEncontrado1 = agenda.buscarContatoPorNome("João");
        if (contatoEncontrado1 != null) {
            System.out.println("Contato encontrado por nome: " + contatoEncontrado1.getNome());
        }

        Contato contatoEncontrado2 = agenda.buscarContatoPorEmail("maria@email.com");
        if (contatoEncontrado2 != null) {
            System.out.println("Contato encontrado por email: " + contatoEncontrado2.getNome());
        }

        List<Contato> contatosEncontrados = agenda.buscarContatoPorParte("222");
        System.out.println("Contatos encontrados por parte: ");
        for (Contato contato : contatosEncontrados) {
            System.out.println(contato.getNome());
        }
    }
}
