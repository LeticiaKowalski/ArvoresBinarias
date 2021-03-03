package arvoresbinarias;

	public class Arvore<Tipo extends Comparable> {
		
		private Elemento<Tipo> raiz;

		
		public Arvore() {
			this.raiz = null;
		}
		
		public void adicionar(Tipo valor) {
			Elemento<Tipo> novoElemento = new Elemento<Tipo> (valor);
			if (raiz == null) {
				this.raiz = novoElemento;
			} else {
				Elemento<Tipo> atual = this.raiz;
				while(true) {
					if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
						if (atual.getEsquerda() != null) {
							atual = atual.getEsquerda();
						} else {
							atual.setEsquerda(novoElemento);
							break;
						}
					} else { // se for maior ou igual
						if (atual.getDireita() != null) {
							atual = atual.getDireita();
						} else {
							atual.setDireita(novoElemento);
							break;
						}
					}
				}
			}
		}
		
		
		public Elemento<Tipo> getRaiz() {
			return raiz;
		}

		public void ladoEsquerdo(Elemento<Tipo> atual) {
			if (atual != null) {
				ladoEsquerdo(atual.getEsquerda());
				System.out.println(atual.getValor());
			}
		}

		public void centEsquerda(Elemento<Tipo> atual) {
			if (atual != null) {
				centEsquerda(atual.getEsquerda());
				System.out.println(atual.getValor());
				centEsquerda(atual.getDireita());
			}
		}
		
		public void centDireita(Elemento<Tipo> atual) {
			if (atual != null) {
				centDireita(atual.getDireita());
				System.out.println(atual.getValor());
				centDireita(atual.getEsquerda());
			}
		}
		
		public void prefEsquerda(Elemento<Tipo> atual) {
			if (atual != null) {
				System.out.println(atual.getValor());
				prefEsquerda(atual.getEsquerda());
				prefEsquerda(atual.getDireita());
			}
		}
		
		public void prefDireita(Elemento<Tipo> atual) {
			if (atual != null) {
				System.out.println(atual.getValor());
				prefDireita(atual.getDireita());
				prefDireita(atual.getEsquerda());
			}
		}
		
		public void posEsquerda(Elemento<Tipo> atual) {
			if (atual != null) {
				posEsquerda(atual.getEsquerda());
				posEsquerda(atual.getDireita());
				System.out.println(atual.getValor());
			}
		}
		
		public void posDireita(Elemento<Tipo> atual) {
			if (atual != null) {
				posDireita(atual.getDireita());
				posDireita(atual.getEsquerda());
				System.out.println(atual.getValor());
			}
		}
		
		public int folhas(Elemento<Tipo> atual) {
			if (atual == null)
				return 0;
			if (atual.getEsquerda() == null && atual.getDireita() == null)
				return 1;
			return folhas(atual.getEsquerda()) + folhas(atual.getDireita());
		}
		
		public void folhass() {
			System.out.println(folhas(raiz));
		}
		
		
}
