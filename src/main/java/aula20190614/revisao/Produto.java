package aula20190614.revisao;

public class Produto {
	private final Integer id;
	private final String nome;
	private final double preço;

	public Produto(Integer id, String nome, double preço) {
		this.id = id;
		this.nome = nome;
		this.preço = preço;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreço() {
		return preço;
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
		Produto other = (Produto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	

}
