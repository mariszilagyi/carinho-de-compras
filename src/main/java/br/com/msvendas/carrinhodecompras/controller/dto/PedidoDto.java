package br.com.msvendas.carrinhodecompras.controller.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.msvendas.carrinhodecompras.modelo.Pedido;
import br.com.msvendas.carrinhodecompras.modelo.StatusPedido;

public class PedidoDto {

	private Long id;
	private List<ItemPedidoDto> itenspedidos;
	private BigDecimal totalDoPedido;
	private StatusPedido statusDoPedido;
	private LocalDateTime dataCriacao;

	public PedidoDto(Pedido pedido) {

		this.id = pedido.getId();
		this.itenspedidos = new ArrayList<>();
		this.itenspedidos.addAll(pedido.getItensPedidos().stream()
				.map(ItemPedidoDto::new).collect(Collectors.toList()));
		this.totalDoPedido = pedido.getTotalDoPedido();
		this.statusDoPedido = pedido.getStatusDoPedido();
		this.dataCriacao = pedido.getData();
	}

	public Long getId() {
		return id;
	}

	public List<ItemPedidoDto> getItenspedidos() {
		return itenspedidos;
	}

	public BigDecimal getTotalDoPedido() {
		return totalDoPedido;
	}

	public StatusPedido getStatusDoPedido() {
		return statusDoPedido;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static List<PedidoDto> converter(List<Pedido> pedidos) {
		return pedidos.stream().map(PedidoDto::new).collect(Collectors.toList());
	}

}
