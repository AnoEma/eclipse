package br.com.treinaweb.zoologico.classes;

public  class Cachorro extends Animals {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public Cachorro(String nome) {
		super(nome, "Cachorro");
	}

	@Override
	public void emitirBarulho() {
		
		if(estaVivo){
			System.out.println("latido do Cachorro");
		}else {
			System.out.println("Acabou � tetraaaaaaaa");
		}
	}
	
	@Override
	public Boolean maiorIdade() {
		if(estaVivo) {
			return idade > 2;
		}
		else {
			return false;
		}
		
	}
}
