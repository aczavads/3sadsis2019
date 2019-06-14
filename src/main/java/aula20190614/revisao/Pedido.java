package aula20190614.revisao;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pedido {

	private final Integer id;
	private final Integer n�mero;
	private final Date emiss�o;
	//private ItemPedido[] itens;
	private final Set<ItemPedido> itens = new HashSet<>();

	public Pedido(Integer id, Integer n�mero, Date emiss�o, ItemPedido[] itens) {
		this.id = id;
		this.n�mero = n�mero;
		this.emiss�o = emiss�o;
		//this.itens = itens;
		for (ItemPedido itemPedido : itens) {
			this.itens.add(itemPedido);
		}
	}
	
	public double getValorTotal() {
		double valorTotal = 0.00;
		for (ItemPedido itemPedido : itens) {
			valorTotal += itemPedido.getQuantidade() * itemPedido.getPre�oUnit�rio();
		}
		return valorTotal;
	}

	public Integer getId() {
		return id;
	}

	public Integer getN�mero() {
		return n�mero;
	}

	public Date getEmiss�o() {
		return emiss�o;
	}

	public Set<ItemPedido> getItens() {
		//return itens;
		return Collections.unmodifiableSet(this.itens);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
