package aula20190610.repository_final;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CorRepositoryMemory implements CorRepository {
	private Set<Cor> cores = new HashSet<>();

	public CorRepositoryMemory() {
		System.out.println("Inicializando CorRepositoryMemory...");
	}
	
	@Override
	public void incluir(Cor c) throws Exception {
		this.cores.add(c);
	}

	@Override
	public void excluir(Integer id) throws Exception {
		Cor aExcluir = null;
		for (Cor c : this.cores) {
			if (c.getId() == id ) {
				aExcluir = c;
			}
		}
		this.cores.remove(aExcluir);
	}

	@Override
	public void atualizar(Cor c) throws Exception {
		this.excluir(c.getId());
		this.incluir(c);
	}

	@Override
	public List<Cor> obterTodas() throws Exception {
		//return new ArrayList<>();
		return new ArrayList<>(this.cores);
	}
}









