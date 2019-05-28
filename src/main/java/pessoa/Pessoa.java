package pessoa;

import java.util.UUID;

public abstract class Pessoa /* extends Object */ {
	private UUID id;
	private String nome;

	public Pessoa(String nome) {
		this.id = UUID.randomUUID();
		this.nome = nome;
	}

	public Pessoa(UUID id, String nome) {
		this.id = UUID.randomUUID();
		this.id = id;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public UUID getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (!other.getClass().equals(this.getClass())) {
			return false;
		}
		Pessoa aux = (Pessoa) other;
		if (aux.getId().equals(this.getId())) {
			return true;
		}
		return false;
	}

}
