package aula20190610.repository_final;

import java.util.List;

public interface CorRepository {
	
	void incluir(Cor c) throws Exception;
	void excluir(Integer id) throws Exception;
	void atualizar(Cor c) throws Exception;
	List<Cor> obterTodas() throws Exception;

}
