package Calculador.App;

import Calculador.Interface.CalculadorMath;
import Fabrica.Calculador.CalcularFabrica;

public class Progamm {

	public static void main(String[] args) {
		String calculo = "*";
		int numero1 = 3;
		int numero2 = 2;
		
		CalcularFabrica calcul = new CalcularFabrica();
		CalculadorMath calculador = calcul.criarCalculador(numero1, numero2, calculo);
		
		if(calculador != null){
			System.out.println(calculador.calcular());
		}
		else {
			System.out.println( "Calculo invalido");
		}
	}
}
