package ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	public ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	public void adiciona(String palavra){
		if(!this.contem(palavra)){
			int indice = calculaIndice(palavra);
			List<String> lista = tabela.get(indice);
			lista.add(palavra);
		}
	}
	
	public void remove(String palavra){
		if(contem(palavra)){
			int indice = calculaIndice(palavra);
			List<String> lista = tabela.get(indice);
			lista.remove(palavra);
		}
	}

	private boolean contem(String palavra) {
		int indice = calculaIndice(palavra);
		return tabela.get(indice).contains(palavra);
	}

	private int calculaIndice(String palavra) {
		// TODO Auto-generated method stub
		return palavra.toLowerCase().charAt(0) % 26;
	}

	@Override
	public String toString() {
		return tabela.toString();
	}

}
