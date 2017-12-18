package ed.listaligada;

public class ListaLigada {

	private Celula primeiro = null;
	private Celula ultimo = null;
	private int totalDeElementos = 0;

	public void adicionaComeco(Object elemento) {

		if(this.totalDeElementos == 0){
			Celula nova = new Celula(elemento);
			this.primeiro = nova;
			this.ultimo = nova;
		} else {
			Celula nova = new Celula(elemento, this.primeiro);
			this.primeiro.setAnterior(nova);
			this.primeiro = nova;
		}

		this.totalDeElementos++;
	}

	public void adiciona(Object elemento) { // Adiciona no fim
		if (this.totalDeElementos == 0) {
			adicionaComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultimo.setProximo(nova);
			nova.setAnterior(this.ultimo);
			this.ultimo = nova;
			this.totalDeElementos++;
		}
	}

	private boolean posicaoValida(int posicao) { // Posição Válida
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	private Celula pegaCelula(int posicao) {

		if (!posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inválida!");
		}

		Celula atual = primeiro;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}

		return atual;

	}

	public void adiciona(int posicao, Object elemento) { // Adiciona em qualquer posição

		if (posicao == 0) {
			adicionaComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			adiciona(elemento);
		} else {

			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			
			Celula nova = new Celula(elemento, anterior.getProximo());
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			
			this.totalDeElementos++;
		}
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}
	
	public void removeComeco(){
		if(this.totalDeElementos == 0){
			throw new IllegalArgumentException("Lista vazia!");
		}
		this.primeiro = this.primeiro.getProximo();
		this.totalDeElementos--;
		
		if (this.totalDeElementos == 0){
			this.ultimo = null;
		}
	}
	
	public void remove(int posicao) {
		if(posicao == 0){
			removeComeco();
		} else if (posicao == this.totalDeElementos - 1){
			this.removeFim();
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			proxima.setProximo(proxima);
			anterior.setProximo(anterior);
			
			this.totalDeElementos--;
		}
	}
	
	public void removeFim(){
		if(this.totalDeElementos == 1){
			this.removeComeco();
		} else {
			Celula penultima = this.ultimo.getAnterior();
			penultima.setProximo(null);
			this.ultimo = penultima;
			this.totalDeElementos--;
		}
	}

	public int tamanho() {
		return this.totalDeElementos;
	}

	public boolean contem(Object elemento) {
		Celula atual = this.primeiro;
		while (atual != null){
			if(atual.getElemento().equals(elemento)){
				return true;
			}
			atual = atual.getProximo();
		}
		
		return false;
	}

	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[ ]";
		}

		Celula atual = primeiro;

		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}

}
