package Fabrica.Calculador;

import Calculador.Class.Adicao;
import Calculador.Class.Divisao;
import Calculador.Class.Multiplicacao;
import Calculador.Class.Substracao;
import Calculador.Interface.CalculadorMath;

public class CalcularFabrica {

	public CalculadorMath criarCalculador(int numero1, int numero2, String calculo) {
		if(calculo.equals("+")) {
			return new Adicao(numero1, numero2);
		}
		else if(calculo.equals("-")) {
			return new Substracao(numero1, numero2);
		}
		else if(calculo.equals("*")) {
			return new Multiplicacao(numero1, numero2);
		}
		else if(calculo.equals("/")) {
			return new Divisao(numero1, numero2);
		}
		else {
			return null;
		}
	}
}
