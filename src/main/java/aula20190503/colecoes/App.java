package aula20190503.colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {
	
	public static void main(String[] args) {
		List<String> listaDeNomes = new ArrayList<>();
		listaDeNomes.add("Ana");
		listaDeNomes.add("Ana");
		listaDeNomes.add("Ana");
		listaDeNomes.add("Joana");
		System.out.println("Nomes na lista...");
		for (String nome : listaDeNomes) {
			System.out.println(nome);
		}
		System.out.println("Fim dos nomes.");
		System.out.println("Valor na posicao 3: " + listaDeNomes.get(3));
		listaDeNomes.remove(3);
		System.out.println("Valor na última posição:" + listaDeNomes.get(listaDeNomes.size()-1));
		
		Set<String> conjuntoDeNomes = new HashSet<>();
		conjuntoDeNomes.add("Ana");
		conjuntoDeNomes.add("Ana");
		conjuntoDeNomes.add("Ana");
		conjuntoDeNomes.add("Joana");
		conjuntoDeNomes.remove("Joana");
		System.out.println("Nomes no conjunto...");
		for (String nome : conjuntoDeNomes) {
			System.out.println(nome);
		}
		System.out.println("Fim dos nomes.");
		
		Map<String, Integer> mapaDeIdadesPorPessoa = new HashMap<>();
		mapaDeIdadesPorPessoa.put("Ana", 18);
		mapaDeIdadesPorPessoa.put("Joana", 22);
		mapaDeIdadesPorPessoa.put("Ana", 21);
		
		for (String nome : mapaDeIdadesPorPessoa.keySet()) {
			System.out.println(nome + ", idade: " + mapaDeIdadesPorPessoa.get(nome));
		}
		
		mapaDeIdadesPorPessoa.remove("Ana");
		System.out.println("Tem 'Ana' no mapa? " + mapaDeIdadesPorPessoa.containsKey("Ana"));
		System.out.println("Tem 'Joana' no mapa? " + mapaDeIdadesPorPessoa.containsKey("Joana"));
		System.out.println("Tem 'Carol' no mapa? " + mapaDeIdadesPorPessoa.containsKey("Carol"));
		
		
		
	}

}
