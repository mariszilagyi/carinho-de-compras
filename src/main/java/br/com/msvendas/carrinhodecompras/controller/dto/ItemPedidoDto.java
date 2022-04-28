package br.com.msvendas.carrinhodecompras.controller.dto;

import java.math.BigDecimal;

import br.com.msvendas.carrinhodecompras.modelo.ItemPedido;

public class ItemPedidoDto {

	private Long id;
	private BigDecimal preco;
	private Integer quantidade;
	private BigDecimal precoTotal;

	public ItemPedidoDto(ItemPedido itemPedido) {

		this.id = itemPedido.getId();
		this.preco = itemPedido.getIdProduto().getPreco();
		this.quantidade = itemPedido.getQuantidade();
		this.precoTotal = itemPedido.getPrecoTotal();
	}

	public Long getId() {
		return id;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public BigDecimal getPrecoTotal() {
		return precoTotal;
	}

}
