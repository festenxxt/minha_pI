package model;

public class Marca extends Entidade{
	
	private String descricao;
	private int situacao;


	
	public Marca(String descricao, int idMarca, int situacao) {
		super();
		this.descricao = descricao;
		super.id = idMarca;
		this.situacao = situacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(byte sit) {
		situacao = sit;
	}
	
	@Override
	public String toString() {
		return "Marca"+"#"+ getDescricao()+ ","+getId()+","+getSituacao()+"\n";
		
	}
}
