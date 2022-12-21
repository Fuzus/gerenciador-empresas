package br.com.fuzus.gerenciador.model;

public class Empresa {
	
	private Integer id;
	private String nome;
	
	public Empresa() {}

	public Empresa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
