package aula20190607.repository;

import java.util.List;

public interface CorRepository {
	
	void incluir(Cor c);
	void excluir(Integer id);
	void atualizar(Cor c);
	List<Cor> obterTodas();

}
