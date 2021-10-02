package entities;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private StatusPedido status;
	private Cliente cliente;
	
	private List<ItemDoPedido> itens = new ArrayList<>();
	
	public Pedido(Date moment, StatusPedido status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemDoPedido> getItens() {
		return itens;
	}
	
	public void addItem(ItemDoPedido item) {
		itens.add(item);
	}
	public void remove(ItemDoPedido item){
		itens.remove(item);
	}
	public double total() {
		double sum = 0.0;
		for (ItemDoPedido i: itens) {
			System.out.println(i.toString());
			sum += i.subTotal();
		}
		return sum;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Total da compra R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
