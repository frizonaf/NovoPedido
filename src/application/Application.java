package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemDoPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Application {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Nome do cliente: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Data de nascimento: ");
		Date dataNascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nomeCliente, dataNascimento);
		
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Entre com o número de ítens do pedido: ");
		int numItens = sc.nextInt();
		
		for (int i = 0; i < numItens; i++) {
			System.err.println();
			sc.nextLine();
			System.err.print("Entre com o produto #" + (i + 1) + ": ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: R$" + ": ");
			double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			ItemDoPedido iten = new ItemDoPedido(produto, quantidade, precoProduto);
			pedido.addItem(iten);
		}
		System.out.println();
		System.out.println("Resumo da compra:");
		System.out.println(pedido);

	}

}
