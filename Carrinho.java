
public class Carrinho {
	int P = 0;

	int U = 0;

	int M;

	private Produto[] Lista_C;


	public Carrinho(int max) {
		Lista_C = new Produto[max];
	}


	public boolean vazio() {
		return (this.P == this.U);
	}


	public void Inserir(Produto p) {
		if (!vazio() && this.U == this.Lista_C.length) {
			System.out.println("Lista Completa”");
		} 
		else {
			this.Lista_C[this.U] = p;
			this.U = this.U + 1;
			System.out.println("Produto inserido");
		}
	}
	
	public void Retirar(int posicao) {
		if (posicao >= this.Lista_C.length) {
			System.out.println("Esse Item não foi encontrado");
		} 
		else {
			System.out.println("Removendo ITEM: " +  this.Lista_C[posicao]);
			this.Lista_C[posicao] = null;
			for(int i = posicao; i < Lista_C.length; i++) {
				if(i < (Lista_C.length - 1)) {
					this.Lista_C[i] = this.Lista_C[i+1];
					this.Lista_C[i+1] = null;
				}
			}
		}
	}
	
	public void Imprimir() {
		System.out.println("Imprimindo");
		for(Produto item : Lista_C) {
			System.out.println(item);
		}
	}
	
	public void LimparLista() {
		this.Lista_C = new Produto[this.Lista_C.length];
	}
}
