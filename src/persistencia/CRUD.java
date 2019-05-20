package persistencia;

import java.io.IOException;

public interface CRUD{
	
	public String consultar(String solicitacao, String SolicitacaoDescricao);
	public String inserir() throws IOException;
	public String alterar(String solicitacao, String SolicitacaoDescricao);
	public String remover();

}
