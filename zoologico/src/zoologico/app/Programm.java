package zoologico.app;

import br.com.treinaweb.zoologico.classes.Animals;
import br.com.treinaweb.zoologico.classes.Cachorro;

public class Programm {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Hello");
		
		cachorro.setNome("Tarzan");
		cachorro.setIdade(1);
		System.out.println("Ola "+ cachorro.getNome() + "vc tem " + cachorro.getIdade()+ " anos de vida");
		
		if(cachorro.maiorIdade()) {
			System.out.println("� maior de idade");
		}
		else {
			System.out.println("� menor de idade\n");
		}
		
		cachorro.emitirBarulho();
	}

}
