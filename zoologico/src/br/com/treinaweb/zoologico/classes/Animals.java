package br.com.treinaweb.zoologico.classes;

public abstract class Animals implements Animavel {
	private String nome;
	protected int idade;
	protected Boolean estaVivo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public Boolean estaVivo() {
		return estaVivo;
	}
	
	public Animals(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.estaVivo = true;
	}
	
	
	public Animals(String nome2, String string) {
		// TODO Auto-generated constructor stub
	}

	public void setIdade(int idade) {
		this.idade = idade;
		this.estaVivo = true;
	}
	
	public abstract void emitirBarulho();
	
	
	public Boolean maiorIdade() {
		if(estaVivo) {
			return idade >= 1;
		}
		
		return false;
		
	}
	
	public final void estaMorto() {
		this.estaVivo = false;
	}
}