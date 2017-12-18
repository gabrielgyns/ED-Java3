package ed.pilhas;

import java.util.Stack;

public class TestePilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha pilha = new Pilha();
		
		pilha.push("Gabriel");
		System.out.println("Adicionou: " + pilha);
		
		pilha.push("Alice");
		System.out.println("Adicionou: " + pilha);
		
		pilha.push("Rodrigo");
		System.out.println("Adicionou: " + pilha);
		
		pilha.push("Fernanda");
		System.out.println("Adicionou: " + pilha);
		
		pilha.push("Natan");
		System.out.println("Adicionou: " + pilha);
		
		pilha.push("Cecília");
		System.out.println("Adicionou: " + pilha);
		
		pilha.pop();
		System.out.println("Removeu o último: " + pilha);
		
		pilha.popAny(3);
		System.out.println("Removeu posição 03:" + pilha);
		
		pilha.vazia();
		
		System.out.println("===========================================");
		
		Stack<String> nomes = new Stack<String>();
		nomes.push("Java");
		nomes.push("C++");
		nomes.push("C#");
		nomes.push("JavaScript");
		nomes.push("Python");
		System.out.println(nomes);
		
		System.out.println("Removendo: " + nomes.pop());
		System.out.println(nomes);
		
		System.out.println("Tamanho: " + nomes.size());
		System.out.println("A lista está vazia: " + nomes.isEmpty());
		
	}

}
