package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

	private List<String> nomes = new LinkedList<String>();
	
	public void adiciona(String nome){
		nomes.add(nome);
	}
	
	public String remove(){
		return nomes.remove(0);
	}
	
	public void vazia(){
		if(!nomes.isEmpty()){
			System.out.println("A lista n�o est� vazia!");
		} else {
			System.out.println(" A lista est� vazia!");
		}
	}
	
	@Override
	public String toString() {
		return nomes.toString();
	}
	
}
