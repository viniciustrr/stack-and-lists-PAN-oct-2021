package array1;

import java.util.HashMap;
import java.util.Map;

public class HashFor {
	public static void main(String[] args) {
		Map<String, String> tabelaCursos = new HashMap<>();
		
		tabelaCursos.put("Ang", "Angular9");
		tabelaCursos.put("J...", "Java");
		tabelaCursos.put("O...", "Oracle");
		
		for(Map.Entry<String, String> conjuntinho : tabelaCursos.entrySet()) {
			System.out.println(conjuntinho.getKey() + " = " + conjuntinho.getValue());
		}
		
		System.out.println("-------------");
		
		for(Map.Entry<String, String> conjuntinho : tabelaCursos.entrySet()) {
			if(conjuntinho.getKey() == "Ang") {
				System.out.println(conjuntinho.getKey() + " = " + conjuntinho.getValue());
			}
		}
		
	}
}
