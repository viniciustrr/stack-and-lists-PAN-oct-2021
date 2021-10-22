package array1;

import java.util.ArrayList;

public class ArrayFor {
	public static void main(String[] args) {
		ArrayList<String> pessoas = new ArrayList();
		
		pessoas.add("Luiza");
		pessoas.add("Gabriel");
		pessoas.add("Marcio");
		
		System.out.println("------ Todas pessoas ------");
		for (String pessoinha: pessoas) {
			System.out.printf("Posi��o %s \n", pessoinha);
		}
		
		System.out.println("------ comeca com L ------");
		for (String pessoinha: pessoas) {
			if(pessoinha.charAt(0) == 'L') {
				System.out.printf("Posi��o %s \n", pessoinha);
			}
		}
		
		System.out.println("------ Pessoas e indices ------");
		System.out.println("Indo de um por um");
		
		int i =0;
		
		for (String pessoinha: pessoas) {
			System.out.printf("Posi��o %d - %s \n", i,pessoinha);
			i++;
		}
	}
}
