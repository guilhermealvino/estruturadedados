package produtos;

//Selction Sort

public class TestaOdenacao {

	public static void main(String[] args) {
		
		Produto produtos[] = {
				new Produto("Lamboghini", 1000000),
				new Produto("Jipe", 46000),
				new Produto("Brasilia", 16000),
				new Produto("Smart", 46000),
				new Produto("Fusca", 17000)
		};
		
		//selectionSort(produtos, produtos.length);
		novoSort(produtos, produtos.length);
		
		imprime(produtos);

	}

	private static void imprime(Produto[] produtos) {
		for(Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}
	}
	
	private static void novoSort(Produto[] produtos, int quantidadeDeElementos) {
		for(int atual = 0; atual < quantidadeDeElementos; atual++) {
			System.out.println("Estou na casinha " + atual);
			
			int analise = atual;
			while (analise > 0 && produtos[analise].getPreco() < produtos[analise-1].getPreco()) {
				System.out.println("Estou trocando "+ analise + " com " + (analise-1));
				
				Produto produtoAnalise = produtos[analise];
				Produto produtoAnaliseMenos1 = produtos[analise - 1];
				System.out.println("Estou trocando "+ produtoAnalise.getNome()
													+ " com " + produtoAnaliseMenos1.getNome());
				
				produtos[analise] = produtoAnaliseMenos1;
				produtos[analise-1] = produtoAnalise;
				analise--;
			}
			imprime(produtos);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}

	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		
		for(int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
			System.out.println("Estou na casinha " +atual);
			int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
			System.out.println("Trocando a posi��o " + atual + " com a " + menor + "\n");
			
			Produto produtoAtual = produtos[atual];
			Produto produtoMenor = produtos[menor];
			System.out.println("Trocando " + produtoAtual.getNome() + " para " + produtoMenor.getNome());
			
			produtos[atual] = produtoMenor;
			produtos[menor] = produtoAtual;
		}
		
	}

	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
		for(int atual = inicio; atual <= termino; atual++) {
			if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				maisBarato = atual;
			}
		}
		return maisBarato;
	}

}