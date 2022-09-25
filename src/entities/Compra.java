package entities;

import java.util.List;

public class Compra {
	private Long id;
	private Cliente cliente;
	private List<ItensCompra> list;

	public Compra() {
	}

	public Compra(Long id, Cliente cliente, List<ItensCompra> list) {
		this.id = id;
		this.cliente = cliente;
		this.list = list;
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

	public List<ItensCompra> getList() {
		return list;
	}

	public void setList(List<ItensCompra> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return id + "\n" + cliente + "\n" + list;
	}

	
}
