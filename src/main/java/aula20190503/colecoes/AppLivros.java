package aula20190503.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import aula20190307.maiorLivroNoArquivoComSubRotina.Livro;

public class AppLivros {
	
	public static void main(String[] args) {
		List<Livro> acervo = new ArrayList<>();
		acervo.add(new Livro("Big Java","Horstmann"));
		acervo.add(new Livro("Conceitos de comp. com Java","Horstmann"));
		acervo.add(new Livro("Objects first","Horstmann"));
		acervo.add(new Livro("UML Primer","Booch"));
		acervo.add(new Livro("Rational Unified Process","Booch"));
		acervo.add(new Livro("Applying UML and patterns","Fowler"));
		
		List<String> nomesDosAutoresDistinct = retornarAutoresDistinct(acervo);
		//Listar os nomes.
		Map<String, Integer> livrosPorAutor = retornarContagemDeLivrosPorAutor(acervo);
		//Listar o nome do autor com a quantidade de livros dele.
		
		
	}

}
