package programa;

import java.util.Stack;

public class pilhaRepo {
	public static void inserindoPush(Stack pilhinha, String x) {
		pilhinha.push(x);
		System.out.println("Push -> " + x);
		System.out.println("Stack: " + pilhinha);
		
	}
	
	public static void deletandoPop(Stack pilhinha) {
		System.out.println("Pop -> ");
		String x = (String) pilhinha.pop();
		System.out.println(x);
		System.out.println("Stack: "+ pilhinha);
	}
}
