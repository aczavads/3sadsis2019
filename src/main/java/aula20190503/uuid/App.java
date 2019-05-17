package aula20190503.uuid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class App {
	
	
	public static void main(String[] args) {
		String primeiro = UUID.randomUUID().toString();
		Set<String> uuidsGerados = new HashSet<>();
		uuidsGerados.add(primeiro);
		uuidsGerados.add(primeiro);
		uuidsGerados.add(primeiro);
		uuidsGerados.add(primeiro);
		for (String uuid : uuidsGerados) {
			System.out.println(uuid);
		}
		System.out.println("---------------");
		uuidsGerados.clear();
		for (int i = 0; i < 10_000_000; i++) {
			uuidsGerados.add(UUID.randomUUID().toString());
		}
//		for (String uuid : uuidsGerados) {
//			System.out.println(uuid);
//		}
		System.out.println("Fim. Tamanho da coleção=" + uuidsGerados.size());
	}

}
