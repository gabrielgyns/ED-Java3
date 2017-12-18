package ed.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TesteConjunto {

	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Mauricio");
		System.out.println(conjunto);
		
		conjunto.adiciona("Marcelo");
		System.out.println(conjunto);
		
		conjunto.adiciona("Gabriel");
		System.out.println(conjunto);
		
		conjunto.adiciona("Amanda");
		System.out.println(conjunto);
		
		conjunto.remove("Marcelo");
		System.out.println(conjunto);
		
		System.out.println("===========================================");
		
		Set<String> conjuntoJava = new HashSet<String>();
		
		conjuntoJava.add("Java");
		conjuntoJava.add("JavaScript");
		conjuntoJava.add("C#");
		conjuntoJava.add("C++");
		
		System.out.println(conjuntoJava);
		
		String x = "Gabriel";
		System.out.println(x.hashCode());
		
		System.out.println("Gabriel> " + "Gabriel".hashCode());
		System.out.println("Alice> " + "Alice".hashCode());
		System.out.println("Fernanda> " + "Fernanda".hashCode());
		System.out.println("Cecília> " + "Cecília".hashCode());
		

	}

}
