package gerenciamentoContatos;

public class Main {
	
	public static void main(String[] args) {
		
		 GerenciadorContato gerenciador = new GerenciadorContato();

	        // Adicionando contatos
	        gerenciador.adicionarContato(new Contato(1, "Rafaela Sousa", "123456789"));
	        gerenciador.adicionarContato(new Contato(2, "Gabriel da Silva", "012345678"));

	        // Pesquisando um contato
	        Contato contato = gerenciador.pesquisarContatoPorId(1);
	        if (contato != null) {
	            System.out.println("Contato encontrado: " + contato.getNome());
	        } else {
	            System.out.println("Contato não encontrado");
	        }

	        // Removendo um contato
	        gerenciador.removerContato(1);
	        contato = gerenciador.pesquisarContatoPorId(1);
	        if (contato == null) {
	            System.out.println("Contato removido");
	        }
		
	}
}



