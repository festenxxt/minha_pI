package persistencia;

import java.io.IOException;

import model.Marca;

public class MarcaPersistencia implements CRUD{
	
	private Marca marca;
	
	public MarcaPersistencia(Marca marca) {
		this.marca = marca;
	}

	@Override
	public String consultar(String solicitacaoID, String SolicitacaoDescricao) {
		return "consultar#" + solicitacaoID+","+SolicitacaoDescricao+"\n";
	}

	@Override
	public String inserir() throws IOException {
		return "inserir#"+marca.toString();
	}

	@Override
	public String alterar(String solicitacaoID, String SolicitacaoDescricao) {
		
		return "alterar#" + solicitacaoID+","+SolicitacaoDescricao+"\n";
	}

	@Override
	public String remover() {
		// TODO Auto-generated method stub
		return null;
	}



}
