	package aula20190307.maiorLivroNoArquivoComSubRotina;
	
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
	
	public class App {
		public static void main(String[] args) {
			Livro[] livros = criarArrayDeLivros();
			Livro maior = recuperarMaiorLivroDoArray(livros);
			if (maior == null) {
				System.out.println("Não há livros para testar!");
			} else {
				System.out.println("O maior livro é " + maior.titulo + " com " + maior.numeroDePaginas + " páginas.");
			}
		}
		private static Livro[] criarArrayDeLivros() {
			List<Livro> livros = new ArrayList<>();
			try (Scanner leitor = new Scanner(App.class.getResourceAsStream("livros.txt"))) {
				while (leitor.hasNextLine()) {
					String linha = leitor.nextLine();
					Livro novo = new Livro(obterTitulo(linha), obterNumeroDePaginas(linha));
					livros.add(novo);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}		
			return livros.toArray(new Livro[] {});
		}
		private static int obterNumeroDePaginas(String linha) {
			return Integer.parseInt(linha.split(",")[1].trim());
		}
		private static String obterTitulo(String linha) {
			return linha.split(",")[0].trim();
		}
		public static Livro recuperarMaiorLivroDoArray(Livro[] livros) {
			if (livros == null || livros.length == 0) {
				return null;
			}
			Livro maior = livros[0];
			for (int contador = 0; contador < livros.length; contador++) {
				Livro atual = livros[contador];
				if (atual.numeroDePaginas > maior.numeroDePaginas) {
					maior = atual;
				}
			}
			return maior;
		}
	
	}
