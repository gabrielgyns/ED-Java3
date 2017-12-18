package ed.listaligada;

public class TestaListaLigada {

	public static void main(String[] args) {
		
		ListaLigada lista = new ListaLigada();
		
		//Adicionando no começo da lista
		System.out.println(lista);
		lista.adicionaComeco("Gabriel");
		System.out.println(lista);
		lista.adicionaComeco("Alice");
		System.out.println(lista);
		lista.adicionaComeco("Rodr.");
		System.out.println(lista);
		
		// Adicionando no final da lista
		lista.adiciona("Marcelo");
		System.out.println(lista);
		
		//Adicionando em qualquer lugar da lista
		lista.adiciona(1, "Fernanda");
		System.out.println(lista);
		
		System.out.println(lista.pega(1));
		
	}

}
