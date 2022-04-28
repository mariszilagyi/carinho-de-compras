package br.com.msvendas.carrinhodecompras.controller.dto;

import java.math.BigDecimal;

import br.com.msvendas.carrinhodecompras.modelo.Produto;

public class ProdutosDto {

	private String nome;
	private String descricao;
	private BigDecimal preco;

	public ProdutosDto(Produto produtos) {
		this.nome = produtos.getNome();
		this.descricao = produtos.getDescricao();
		this.preco = produtos.getPreco();
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

}
