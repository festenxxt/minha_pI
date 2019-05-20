package rede;

import java.io.IOException;

public class ClientSingleton {
	
	private Client instancia;
	
	public Client getConnection() throws IOException {
		if(instancia == null) {
			return new Client();
		}
		return instancia;
	}


}
