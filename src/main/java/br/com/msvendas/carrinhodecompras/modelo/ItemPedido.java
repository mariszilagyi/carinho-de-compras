package br.com.msvendas.carrinhodecompras.modelo;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Produto preco;
	private Integer quantidade;
	private BigDecimal precoTotal;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemPedido other = (ItemPedido) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getIdProduto() {
		return produto;
	}

	public void setIdProduto(Produto idProduto) {
		this.produto = idProduto;
	}

	public Produto getPreco() {
		return preco;
	}

	public void setPreco(Produto preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

//	public void setPrecoTotal(BigDecimal precoTotal) {
//		this.precoTotal = precoTotal;
//	}

	public Pedido getIdPedido() {
		return pedido;
	}

	public void setIdPedido(Pedido idPedido) {
		this.pedido = idPedido;
	}

}
