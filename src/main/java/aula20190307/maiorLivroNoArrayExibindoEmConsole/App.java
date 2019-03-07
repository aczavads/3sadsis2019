package aula20190307.maiorLivroNoArrayExibindoEmConsole;

public class App {
	
	public static void main(String[] args) {
		Livro[] livros = {
				new Livro("Bíblia Sagrada", 899),
				new Livro("Big Java", 1000),
				new Livro("UML Applied", 210),
				new Livro("Software Engineering", 725)
		};

		if (livros == null || livros.length == 0) {
			System.out.println("Não há livros para testar!");
		} else {
			Livro maior = livros[0];
			for (int contador=1; contador<livros.length; contador++) {
				if (livros[contador].numeroDePaginas > maior.numeroDePaginas) {
					maior = livros[contador];
				}
			}
			System.out.println("O maior livro é " +maior.titulo+ " com " + maior.numeroDePaginas + " páginas.");			
		}
	}
}
