package Calculador.Class;

public class Divisao extends CalculadorMath {

	public Divisao(int numero1, int numero2) {
		super(numero1, numero2);
	}

	@Override
	public Boolean validar () {
		return numero1 >= 0 && numero2 > 0;
	}
	
	@Override
	protected int doCalcular() {
		return numero1 / numero2;
	}

}
