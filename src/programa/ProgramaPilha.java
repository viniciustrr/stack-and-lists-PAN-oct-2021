package programa;

import java.util.Stack;

public class ProgramaPilha  extends pilhaRepo {
	public static void main(String[] args) {
		Stack<String> pilhinha = new Stack<>();
		System.out.println("Stack: "+ pilhinha);
		inserindoPush(pilhinha,"Caixa acustica 110");
		inserindoPush(pilhinha,"Caixa acustica 210");
		inserindoPush(pilhinha,"Note");
		deletandoPop(pilhinha);
		deletandoPop(pilhinha);
	}
}
