package entities;

public class ItemDoPedido {

	private Produto produto;
	private Integer quantidade;
	private Double preco;
	
	public ItemDoPedido(Produto produto, Integer quantidade, Double preco) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public double subTotal() {
		return getQuantidade() * getPreco();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[produto = " + produto + ", " + quantidade + ", $");
		sb.append(String.format("%.2f", preco));
		sb.append("]");
		sb.append("Subtotal: ");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}
	
}
