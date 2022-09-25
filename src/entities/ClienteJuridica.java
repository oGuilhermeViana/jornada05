package entities;

public class ClienteJuridica extends Cliente {

	private String cnpj;

	public ClienteJuridica() {
		super();
	}

	public ClienteJuridica(Long id, String nome, String endereco, String tipo, String cnpj) {
		super(id, nome, endereco, tipo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
