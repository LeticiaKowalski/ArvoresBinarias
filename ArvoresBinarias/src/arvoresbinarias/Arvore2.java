package arvoresbinarias;

public class Arvore2 {
		
		private Elemento2 e;
		private Arvore2 dir;
		private Arvore2 esq;
		private int quantElemento;
		private int maior, menor;
		private String pares;
		
		
		public Arvore2() {
			this.e = null;
			this.esq = null;
			this.dir = null;
			this.quantElemento = 0;
		}
		
		public Arvore2(Elemento2 e) {
			this.e = e;
			this.dir = null;
			this.esq = null;
			this.quantElemento = 0;
		}
		
		
		public Elemento2 getE() {
			return e;
		}
		public void setE(Elemento2 e) {
			this.e = e;
		}
		
		public Arvore2 getDir() {
			return dir;
		}
		public void setDir(Arvore2 dir) {
			this.dir = dir;
		}
		
		public Arvore2 getEsq() {
			return esq;
		}
		public void setEsq(Arvore2 esq) {
			this.esq = esq;
		}
		
		public int getQuantElemento() {
			return quantElemento;
		}
		public void setQuantElemento(int quantElemento) {
			this.quantElemento = quantElemento;
		}

		public int getMaior() {
			return maior;
		}
		public void setMaior(int maior) {
			this.maior = maior;
		}
		
		public int getMenor() {
			return menor;
		}
		public void setMenor(int menor) {
			this.menor = menor;
		}
		
		public String getPares() {
			return pares;
		}
		public void setPares(String pares) {
			this.pares = pares;
		}
		
		//METODOS
		public boolean ehVazia() {
			return (this.e == null);
		}
		
		
		public void inserir(Elemento2 e) {
			maiormenor(e.getValor());
			par(e.getValor());
			if (ehVazia()) {
				this.e = e;
			} else {
				Arvore2 narvore = new Arvore2(e);
				if (e.getValor() < this.e.getValor()) {
					if(this.esq == null) {
						this.esq = narvore;
						//System.out.println("Elemento inserido "+e.getValor()+", a esquerda de "+this.e.getValor() );
					} else {
						this.esq.inserir(e);
					}
					
				} else if(e.getValor() > this.e.getValor()) {
					if(this.dir == null) {
						this.dir = narvore;
						//System.out.println("Elemento inserido "+e.getValor()+", a direita de "+this.e.getValor() );
					} else {
						this.dir.inserir(e);
					}
				}
			}
			
			this.quantElemento++;
		}

		public Arvore2 remover(Elemento2 e) {
			if(this.e.getValor() == e.getValor()) {
				if(this.esq == null && this.dir == null) {
					return null;
				} else if(this.esq != null && this.dir == null) {
					return this.esq;
				} else if(this.esq == null && this.dir != null) {
					return this.dir;
				} else {
					Arvore2 aux = this.esq;
					while(aux.dir != null) {
						aux = aux.dir;
					}
					this.e = aux.getE();
					aux.setE(e);
					this.esq = esq.remover(e);	
				}
			} else if(e.getValor() < this.e.getValor()) {
				this.esq = this.esq.remover(e);
			} else if(e.getValor() > this.e.getValor()) {
				this.dir = this.dir.remover(e);
			}
			this.quantElemento--;
			return this;
		}
		
		public boolean busca(int valor) {
			if(ehVazia()) {
				return false;
			} else {
				if(this.e.getValor() == valor) {
					return true;
				} else if(valor < this.e.getValor()) {
					if(this.esq == null) {
						return false;
					} else {
						return this.esq.busca(valor);
					}
				} else if(valor > this.e.getValor()) {
					if(this.dir == null) {
						return false;
					} else {
						return this.dir.busca(valor);
					}
				}
			}
			return false;
		}
		
		public void impPreOrdem() {
			if(!ehVazia()) {
				System.out.print(this.e.getValor() + " ");
				if(this.esq != null) {
					this.esq.impPreOrdem();
				}
				if(this.dir != null) {
					this.dir.impPreOrdem();
				}
			}
		}
		
		public void impInOrdem() {
			if(!ehVazia()) {			
				if(this.esq != null) {
					this.esq.impInOrdem();
				}
				System.out.print(this.e.getValor() + " ");
				if(this.dir != null) {
					this.dir.impInOrdem();
				}
			}
		}
		
		public void impPosOrdem() {
			if(!ehVazia()) {
				if(this.dir != null) {
					this.dir.impPosOrdem();
				}
				if(this.esq != null) {
					this.esq.impPosOrdem();
				}
				System.out.print(this.e.getValor() + " ");
			}
			
		}
		
		public void impInOrdemInv() {
			if(!ehVazia()) {			
				if(this.dir != null) {
					this.dir.impInOrdem();
				}
				System.out.print(this.e.getValor() + " ");
				if(this.esq != null) {
					this.esq.impInOrdem();
				}
			}
		}
			
		public void centEsq(Arvore2 arvore) {
			if(arvore != null) {
				centEsq(arvore.getEsq());
				System.out.println(e.getValor());
			}
		}
		
		
		public void impSubDir() {
			
				if(this.dir == null && this.esq == null) {
					this.esq.impSubDir();
				}
				System.out.println(this.e.getValor());
				
		}
		
		
		public void maiormenor(int valor) {
			if(getMaior() < valor) {
				setMaior(valor);
			}
			if(getMenor() > valor || getMenor() == 0 ) {
				setMenor(valor);
			}
		}

		public void par(int valor) {
			if(getPares() == null) {
				setPares("");
			}
			if(valor % 2 == 0) {
				setPares(getPares()+Integer.toString(valor)+", ");
			}
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("\n- Mostrando toda a atividade 2 -\n");
			builder.append("\na) Mostrar o maior número: ");
			builder.append("\n");
			builder.append(maior);
			builder.append("\n");
			builder.append("\nb) Mostrar o menor número: ");
			builder.append("\n");
			builder.append(menor);
			builder.append("\n");
			builder.append("\nh) Contar quantos elementos existe na árvore: ");
			builder.append("\n");
			builder.append(quantElemento);
			builder.append("\n");
			builder.append("\nj) Mostrar somente os números pares: ");
			builder.append("\n");
			builder.append(pares);
			return builder.toString();
		
		}
}
