package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTeste {
    @Test
	public void deveSomarDoisValores() {
		int valorA = 1;
		int valorB = 1;

        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valorA, valorB);
        
		assertEquals(2, soma);
	}

	@Test
	public void deveSomarTresValores() {
		int valorA = 1;
		int valorB = 1;
		int valorC = 1;

        CalculadoraNova calc = new CalculadoraNova();
        int soma = calc.somar(valorA, valorB, valorC);
        
		assertEquals(2, soma);
	}
}
