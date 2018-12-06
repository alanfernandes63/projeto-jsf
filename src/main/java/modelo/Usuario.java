package modelo;

public class Usuario {
	
	private String nome;
	private String cidade;
	private int id;
	
	
	public Usuario() {
		super();
	}
	
	
	
	
	public Usuario(String nome, String cidade,int id) {
		super();
		this.nome = nome;
		this.cidade = cidade;
		this.id = id;
	}




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
}
