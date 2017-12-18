package ed.pilhas;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<String> nomes = new LinkedList<String>();
	
	public void push(String nome){ // Insere na pilha
		nomes.add(nome);
	}
	
	public String pop(){ // Remove da pilha
		return nomes.remove(nomes.size() - 1);
	}
	
	public String popAny(int posicao){
		return nomes.remove(posicao);
	}
	
	public void vazia(){
		if (nomes.isEmpty()) {
			System.out.println("====> A pilha está vazia!");
		} else {
			System.out.println("====> A pilha não está vazia!");
		}
	}
	
	@Override
	public String toString() {
		
		return nomes.toString();
	}
	
}
