package ed.listaligada;

public class Celula {
	
	private Object elemento;
	private Celula anterior;
	private Celula proximo;
	
	public Celula(Object elemento) {
		this(elemento, null);
	}
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	
	// ANTERIOR
	public Celula getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}
	
	// PRÓXIMO
	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	// ELEMENTO
	public Object getElemento() {
		return elemento;
	}
	
	
	
	
	
}
