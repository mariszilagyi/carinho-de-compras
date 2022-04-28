package br.com.msvendas.carrinhodecompras.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {


	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;
	private LocalDateTime data = LocalDateTime.now();
	
	@OneToMany(mappedBy = "id")
	private List<ItemPedido> itensPedidos;
	private BigDecimal totalDoPedido;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido statusDoPedido;

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
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	public BigDecimal getValorTotal() {
		return totalDoPedido;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.totalDoPedido = valorTotal;
	}

	public BigDecimal getTotalDoPedido() {
		return totalDoPedido;
	}

	public void setTotalDoPedido(BigDecimal totalDoPedido) {
		this.totalDoPedido = totalDoPedido;
	}

	public StatusPedido getStatusDoPedido() {
		return statusDoPedido;
	}

	public void setStatusDoPedido(StatusPedido statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}
	

}
