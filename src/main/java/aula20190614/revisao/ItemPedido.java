package aula20190614.revisao;

public class ItemPedido {

	private final Integer id;
	private final double quantidade;
	private final Produto produto;
	private final double preçoUnitário;

	public ItemPedido(Integer id, double quantidade, Produto produto) {
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
		this.preçoUnitário = produto.getPreço();
	}

	public Integer getId() {
		return id;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}
	public double getPreçoUnitário() {
		return preçoUnitário;
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
		ItemPedido other = (ItemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
