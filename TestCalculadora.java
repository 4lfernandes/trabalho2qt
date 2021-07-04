package trabalho2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.*;

public class TestCalculadora {
		
	private Calculadora calc = new Calculadora();;
	
	@Test
	@DisplayName("Teste de soma")
	public void TesteCalculadoraSoma() {
		
		Assertions.assertEquals(12,calc.soma(5,7));
		Assertions.assertEquals(2,calc.soma(-5,7));
		Assertions.assertEquals(-2,calc.soma(5,-7));
		Assertions.assertEquals(-20,calc.soma(-13,-7));
	}
	
	@Test
	@DisplayName("Teste de subtração")
	public void TesteCalculadoraSubtracao() {
		
		Assertions.assertEquals(-2,calc.subtracao(5,7));
		Assertions.assertEquals(-12,calc.subtracao(-5,7));
		Assertions.assertEquals(12,calc.subtracao(5,-7));
		Assertions.assertEquals(6,calc.subtracao(13,7));
		
	}
	
	@Test
	@DisplayName("Teste de divisão")
	public void TesteCalculadoraDivisao() {
		
		Assertions.assertEquals(3,calc.divisao(15,5));
		Assertions.assertEquals(0,calc.divisao(0,7));
		Assertions.assertEquals(0,calc.divisao(2,4));//resultado igual a zero por que o metodo foi implementado recebendo argumentos inteiros
		
		
	}
	@Test
	@DisplayName("Teste de divisão por zero")
	
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	@DisplayName("Teste do somatorio")
	public void TesteCalculadoraSomatorio() {
		
		Assertions.assertEquals(6,calc.somatoria(3));
		Assertions.assertEquals(0,calc.somatoria(0));
		
	}
	
	@Test
	@DisplayName("Teste do numero positivo")
	public void TesteCalculadoraPositivo() {
		
		
		
		Assertions.assertEquals(true,calc.ehPositivo(3));
		Assertions.assertEquals(false,calc.ehPositivo(-5));
		
	}
	
	@Test
	@DisplayName("Teste da comparação")
	public void TesteCalculadoraCompara() {
		
		Calculadora calc = new Calculadora();
		
		Assertions.assertEquals(0,calc.compara(2,2));
		Assertions.assertEquals(1,calc.compara(54,2));
		Assertions.assertEquals(-1,calc.compara(0,25));
	}
	
	
	
}
