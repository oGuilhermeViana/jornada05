package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ClienteFisica;
import entities.ClienteJuridica;
import entities.Compra;
import entities.Impressora;
import entities.ItensCompra;
import entities.Produto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<ItensCompra> list = new ArrayList<>();
		Cliente cliente = null;
		ItensCompra ic = null;
		
		
		// Cliente
		System.out.print("ID do cliente: ");
		Long id = sc.nextLong();
		
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Endereço: ");
		String endereco = sc.nextLine();
		
		System.out.print("Tipo: (f) Pessoa Fisica - (j) Pessoa Juridíca: ");
		char tipo = sc.next().charAt(0);

		
		if (tipo == 'f') {
			System.out.print("CPF: ");
			sc.nextLine();
			String cpf = sc.nextLine();

			cliente = new ClienteFisica(id, nome, endereco, endereco, cpf);

		} else if (tipo == 'j') {
			System.out.println("CNPJ: ");
			sc.nextLine();
			String cnpj = sc.nextLine();

			cliente = new ClienteJuridica(id, nome, endereco, endereco, cnpj);
		}

		System.out.println();
		System.out.print("Digite o total de produtos: ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i = 1; i <= n; i++) {

			// Produto
			id = Long.valueOf(i);
			System.out.println("ID do "+ i +"° produto: " + id);
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();

			Produto produto = new Produto(id, nome, preco);

			// Compra
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt();
			System.out.print("Desconto: ");
			Double desconto = sc.nextDouble();

			ic = new ItensCompra(produto, quantidade, desconto);

			list.add(ic);
			System.out.println();
		}
		
		System.out.print("ID da compra: ");
		id = sc.nextLong();
		System.out.println();
		
		Compra compra = new Compra(id, cliente, list);

		System.out.println("Lista de compra");
		System.out.println("Quantidade - Nome do Produto - Preço - Total");
		
		new Impressora().Imprimir(compra);
		
	}

}
