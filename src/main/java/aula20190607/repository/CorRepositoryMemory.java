package aula20190607.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CorRepositoryMemory implements CorRepository {
	private Set<Cor> cores = new HashSet<>();

	@Override
	public void incluir(Cor c) {
		this.cores.add(c);
	}

	@Override
	public void excluir(Integer id) {
		Cor aExcluir = null;
		for (Cor c : this.cores) {
			if (c.getId() == id ) {
				aExcluir = c;
			}
		}
		this.cores.remove(aExcluir);
	}

	@Override
	public void atualizar(Cor c) {
		this.excluir(c.getId());
		this.incluir(c);
	}

	@Override
	public List<Cor> obterTodas() {
		//return new ArrayList<>();
		return new ArrayList<>(this.cores);
	}
}
