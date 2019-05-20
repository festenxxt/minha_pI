package controle;

import java.io.IOException;

import model.Entidade;
import model.Marca;
import persistencia.CRUD;
import rede.ClientSingleton;

public class Controle {
	
	private Entidade entidade;
	private CRUD contexto;
        private ClientSingleton client;
	
	public Controle(CRUD contexto) {
		this.contexto = contexto;
	}
	
	public void executaOrdem(String ordem) throws IOException {
		switch(ordem) {
		case"inserir":
                    client.getConnection().escrever(contexto.inserir());
			break;
                    case"alterar":
			break;
		case"consultar":
			break;
		}
	}
	
}
