package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

/**
 * Esta é uma classe teste desenvolvida para fins didaticos
 * 
 * @version 1.0
 * @author diego maciel
 *@category aprendizado
 */


public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		                               	
	//	System.out.println(calc.getTotalImposto());

	}

}
