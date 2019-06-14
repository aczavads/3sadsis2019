package aula20190614.revisao;

public class Produto {
	private final Integer id;
	private final String nome;
	private final double pre�o;

	public Produto(Integer id, String nome, double pre�o) {
		this.id = id;
		this.nome = nome;
		this.pre�o = pre�o;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPre�o() {
		return pre�o;
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
