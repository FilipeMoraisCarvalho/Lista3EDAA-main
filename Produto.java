public class Produto {
	private int quantidade;
	private double valorTotal;
	private String nome;
	private String descricao;
	
	public Produto() {

	}
	
	public Produto(String nome, String descricao, int quantidade, double valorTotal) {
		super();
		this.quantidade = quantidade;
		this.valorTotal = valorTotal;
		this.nome = nome;
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Produto [quantidade=" + quantidade + ", valorTotal=" + valorTotal + ", nome=" + nome + ", descricao="
				+ descricao + "]";
	}
}
