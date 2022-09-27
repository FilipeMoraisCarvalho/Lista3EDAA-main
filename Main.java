public class Main {
	public static void main(String args[]) {
		
		Carrinho carrinho = new Carrinho(10);
		
		Produto a = new Produto("Cebola", "Cebola Grande", 3, 4);
		Produto b = new Produto("Pimenta", "Pimenta Forte", 2, 40);
		Produto c = new Produto("Ovo", "Ovo Caipira", 30, 24);
		Produto d = new Produto("Pão", "Pão Doce", 5, 3);
		Produto e = new Produto("Goiaba", "Verde", 5, 2);
		Produto f = new Produto("Sabão", "Sabão Azul", 1, 22);
		Produto g = new Produto("Tinta", "Tinta Azul", 6, 10);
		Produto h = new Produto("Azeite", "Azeite de Oliva", 20, 11);
		Produto i = new Produto("Feijão", "Feijão Preto", 22, 33);
		Produto j = new Produto("Frango", "File de Frango", 4, 20);
		
		carrinho.Inserir(a);
		carrinho.Inserir(b);
		carrinho.Inserir(c);
		carrinho.Inserir(d);
		carrinho.Inserir(e);
		carrinho.Inserir(f);
		carrinho.Inserir(g);
		carrinho.Inserir(h);
		carrinho.Inserir(i);
		carrinho.Inserir(j);
		
		carrinho.Imprimir();
		System.out.println("Removendo Item 2");
		carrinho.Retirar(2);
		carrinho.Imprimir();


		System.out.println("##### Limpando Lista #####");
		carrinho.LimparLista();;
		carrinho.Imprimir();
	}
}