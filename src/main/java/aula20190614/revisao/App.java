package aula20190614.revisao;

import java.util.Calendar;

public class App {
	
	public static void main(String[] args) {
		
		/*
		Produto soja = new Produto();
		soja.setId(1);
		soja.setNome("Soja a granel");
		soja.setPreço(3.50d);
		
		...
		
		soja.setPreço(4.00d);
		*/
		
		Produto soja = new Produto(1,"Soja a granel",3.50d);
		Produto omo = new Produto(2,"Omo Progress",12.10d);
		
		
		//Criar aqui o primeiro pedido..
		Calendar c = Calendar.getInstance();
		c.set(c.DAY_OF_MONTH, 10);
		c.set(c.MONTH, 0);
		c.set(c.YEAR, 2019);
		
		ItemPedido[] itens = new ItemPedido[] {new ItemPedido(1, 10.00, soja), new ItemPedido(2, 20.00, omo)};
		Pedido p1 = new Pedido(1, 100, c.getTime(), itens);
		System.out.println("O total do pedido 1 é: " + p1.getValorTotal());
		

		soja = new Produto(1,"Soja a granel",4.00d);
		omo = new Produto(2,"Omo Progress",11.50d);
		
		//Criar aqui o segundo pedido...
		ItemPedido[] itens2 = new ItemPedido[] {new ItemPedido(1, 10.00, soja), new ItemPedido(2, 20.00, omo)};		
		Pedido p2 = new Pedido(2, 102, c.getTime(), itens2);
		System.out.println("O total do pedido 2 é: " + p2.getValorTotal());
		
		
	}

}
