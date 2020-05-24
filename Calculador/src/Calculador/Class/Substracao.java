package Calculador.Class;

public class Substracao extends CalculadorMath {

	public Substracao(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	protected int doCalcular() {
		return numero1 - numero2;
	}

}
