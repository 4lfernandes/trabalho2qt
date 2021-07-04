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



public class TestCarrinho {
	
	private Produto prod1 = new Produto("Cadeira",200);
	private Produto prod2 = new Produto("Mesa",700);
	private Produto prod3 = new Produto("Ps4",5200);
	private Produto prod4 = new Produto("Pc Gamer ultra mega bolado",1200);
	private Carrinho carr = new Carrinho();
	
	@Test
	@DisplayName("Teste de subtração")
	public void TestIntegrado() {
		
		Assertions.assertEquals(0,carr.getValorTotal());
		carr.addItem(prod1);
		Assertions.assertEquals(200,carr.getValorTotal());
		carr.addItem(prod2);
		Assertions.assertEquals(900,carr.getValorTotal());
		carr.addItem(prod3);
		Assertions.assertEquals(6100,carr.getValorTotal());
		carr.addItem(prod4);
		Assertions.assertEquals(7300,carr.getValorTotal());
		
		try {
			carr.removeItem(prod2);
		} catch (ProdutoNaoEncontradoException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		Assertions.assertEquals(6600,carr.getValorTotal());
		
		Assertions.assertEquals(3,carr.getQtdeItems());
		
		carr.esvazia();
		
		Assertions.assertEquals(0,carr.getQtdeItems());
		
		}
	}
	


