package gerenciamentoContatos;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorContato {
	private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void removerContato(int id) {
        contatos.removeIf(contato -> contato.getId() == id);
    }

    public Contato pesquisarContatoPorId(int id) {
        return contatos.stream()
                .filter(contato -> contato.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
}
