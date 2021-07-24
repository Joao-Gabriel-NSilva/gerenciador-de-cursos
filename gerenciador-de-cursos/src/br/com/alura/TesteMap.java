package br.com.alura;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {

		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Paulo", 31);
		nomesParaIdade.put("Adriano", 25);
		nomesParaIdade.put("Alberto", 33);
		nomesParaIdade.put("Guilherme", 26);

		// iterando em um set de chaves
		nomesParaIdade.keySet().forEach(nome -> {
			System.out.println(nomesParaIdade.get(nome));
		});
		
		// iterando em uma collection de valores
		nomesParaIdade.values().forEach(idade -> {
			System.out.println(idade);
		});

		// iterando em uma collection de associação key - value
		nomesParaIdade.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
		
//		Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();		
//		for (Entry<String, Integer> associacao : associacoes) {
//		    System.out.println(associacao.getKey() + " - " + associacao.getValue());
//		}

	}

}
