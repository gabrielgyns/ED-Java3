package ed.fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestaFila {
	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.adiciona("Gabriel");
		System.out.println("Adicionou: " + fila);
		
		fila.adiciona("Alice");
		System.out.println("Adicionou: " + fila);
		
		fila.adiciona("Rodrigo");
		System.out.println("Adicionou: " + fila);
		
		fila.adiciona("Fernanda");
		System.out.println("Adicionou: " + fila);
		
		fila.adiciona("Natan");
		System.out.println("Adicionou: " + fila);
		
		fila.adiciona("Cecília");
		System.out.println("Adicionou: " + fila);
		
		
		System.out.println("A remover: " + fila.remove());
		System.out.println("Removido o primeiro a ser inserido: " + fila);
		
		fila.vazia();
		
		System.out.println("===========================================");
		
		Queue<String> nomes = new LinkedList<String>();
		nomes.add("Java");
		nomes.add("C++");
		nomes.add("C#");
		nomes.add("JavaScript");
		nomes.add("Python");
		System.out.println(nomes);
		
		System.out.println("Removendo: " + nomes.remove());
		System.out.println(nomes);
		
		System.out.println("Removendo: " + nomes.poll()); // Mesma coisa do nomes.remove()
		System.out.println(nomes);
		
		System.out.println("Tamanho: " + nomes.size());
		System.out.println("A lista está vazia: " + nomes.isEmpty());
	}
}
