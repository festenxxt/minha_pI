package rede;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

	
	/*
	 * A classe Client vai ser a responsável por implementar a classe Socket e estabelecer a conexão com o servidor.
	 * 
	 * Precisamos garantir que toda vez que um cliente fizer uma requisição, temos que ter uma instância para atender
	 * à requisição.
	 * 
	 * Deve existir apenas uma instância dessa classe para fazer as requisições
	 * 
	 * É a classe responsável por enviar dados para o servidor e receber as respostas
	 */
	
	private Socket socket;
	private InputStream read;
	private OutputStream write;
	private DataOutputStream dataWrite;
	private DataInputStream dataRead;
	
	public Client() throws IOException {
		socket = new Socket("127.0.0.1", 9999);
		read = socket.getInputStream();
		dataRead = new DataInputStream(read);
		write = socket.getOutputStream();
		dataWrite = new DataOutputStream(write);
	}
	
	public void escrever(String mensagem) throws IOException {		
		dataWrite.writeUTF(mensagem);
	}
	
	public  String ler() throws IOException {
		
		return dataRead.readUTF();
		
	}
}
