package br.com.msvendas.carrinhodecompras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.msvendas.carrinhodecompras.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
