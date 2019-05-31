package aula20190531.repository;

import java.sql.Connection;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		Cor azul = new Cor(1,"Azul");
		Cor verde = new Cor(2,"Verde");
		
		Connection conexão = null; // DriverManager.getConnection...
		//CorRepository repo = new CorRepositoryJDBC(conexão);
		//CorRepository repo = new CorRepositoryMemory();
		CorRepository repo = null;
		
		repo.incluir(azul);
		repo.incluir(verde);
		
		verde = new Cor(2, "Verde Musgo");
		repo.atualizar(verde); 
		
		repo.excluir(azul.getId());
		
		List<Cor> cores = repo.obterTodas();
		
		System.out.println("Listando as cores...");
		for (Cor cor : cores) {
			System.out.println("  " + cor.getNome());
		}
		System.out.println("Fim da listagem.");
	}

}
