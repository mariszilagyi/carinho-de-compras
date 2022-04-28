package br.com.msvendas.carrinhodecompras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msvendas.carrinhodecompras.controller.dto.PedidoDto;
import br.com.msvendas.carrinhodecompras.modelo.Pedido;
import br.com.msvendas.carrinhodecompras.repository.PedidoRepository;

@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public List<PedidoDto> lista() {
			List<Pedido> pedidos = pedidoRepository.findAll();
			return PedidoDto.converter(pedidos);
		
	}

}
