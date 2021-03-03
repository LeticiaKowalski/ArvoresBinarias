package arvoresbinarias;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Arvore<Integer> arvore = new Arvore<Integer>();
		arvore.adicionar(10); 
		arvore.adicionar(8);
		arvore.adicionar(5);
		arvore.adicionar(9);
		arvore.adicionar(18);
		arvore.adicionar(13);
		arvore.adicionar(20);
		
		
			System.out.println("\n- Mostrando toda a atividade 1 -");
			
			System.out.println("\na)Caminhamento prefixado � esquerda:");
			arvore.prefEsquerda(arvore.getRaiz());
		
			System.out.println("\nb)Caminhamento prefixado � direita:");
			arvore.prefDireita(arvore.getRaiz());
		
			System.out.println("\nc)Caminhamento central � esquerda:");
			arvore.centEsquerda(arvore.getRaiz());
		
			System.out.println("\nd)Caminhamento central � direita:");
			arvore.centDireita(arvore.getRaiz());
		
			System.out.println("\ne)Caminhamento p�s-fixado � esquerda:");
			arvore.posEsquerda(arvore.getRaiz());
		
			System.out.println("\nf)Caminhamento p�s-fixado � direita:");
			arvore.posDireita(arvore.getRaiz());
		
		
			Elemento2 e = new Elemento2(0);
			Arvore2 narvore = new Arvore2();
			narvore.inserir(new Elemento2(10));
			narvore.inserir(new Elemento2(8));
			narvore.inserir(new Elemento2(5));
			narvore.inserir(new Elemento2(9));
			narvore.inserir(new Elemento2(18));
			narvore.inserir(new Elemento2(13));
			narvore.inserir(new Elemento2(20));
				

			System.out.println();
			System.out.println(narvore);
			System.out.println("\nc) Mostrar os n�s folhas: ");
			arvore.folhass();
			
			
	}

}
