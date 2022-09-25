package entities;

public class Impressora {
	
	public void Imprimir(Compra compra) {
		double totalCompra = 0;
		for(ItensCompra c : compra.getList()) {
			
			double total = c.getQuantidade() * c.getProduto().getPreco() - c.getQuantidade() * c.getProduto().getPreco() * c.getDesconto() / 100;
			totalCompra += total;
			
			System.out.println(c.getQuantidade() + " - \t" +
							   c.getProduto().getNome() + " - \t" + 
							   String.format("%.2f", c.getProduto().getPreco()) + " - \t" +
							   String.format("%.2f", total)
							   );
		}
		System.out.println("Total: " + String.format("%.2f", totalCompra));
	}
	
}
