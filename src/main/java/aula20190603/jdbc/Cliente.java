package aula20190603.jdbc;

import java.util.Date;

public class Cliente {
	
	private Integer id;
	private String nome;
	private Date nascimento;

	public Cliente(Integer id, String nome, Date nascimento) {
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;		
	}
	
	public Integer getId() {
		return id;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public String getNome() {
		return nome;
	}

}
