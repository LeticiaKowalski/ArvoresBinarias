package arvoresbinarias;

public class Elemento<Tipo> {

	private Tipo valor;
	private Elemento<Tipo> esquerda;
	private Elemento<Tipo> direita;
	
	
	public Elemento(Tipo novoValor) {
		this.valor = novoValor;
		this.esquerda = null;
		this.direita = null;
	}


	public Tipo getValor() {
		return valor;
	}


	public void setValor(Tipo valor) {
		this.valor = valor;
	}


	public Elemento<Tipo> getEsquerda() {
		return esquerda;
	}


	public void setEsquerda(Elemento<Tipo> esquerda) {
		this.esquerda = esquerda;
	}


	public Elemento<Tipo> getDireita() {
		return direita;
	}


	public void setDireita(Elemento<Tipo> direita) {
		this.direita = direita;
	}

}