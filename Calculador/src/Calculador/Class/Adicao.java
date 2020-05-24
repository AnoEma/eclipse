package Calculador.Class;

public class Adicao extends CalculadorMath {

	public Adicao(int numero1, int numero2) {
		super(numero1, numero2);
		
	}

	@Override
	protected int doCalcular() {
		return numero1 + numero2;
	}

}