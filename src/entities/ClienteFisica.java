package entities;

public class ClienteFisica extends Cliente{

	private String cpf;

	public ClienteFisica() {
		super();
	}

	public ClienteFisica(Long id, String nome, String endereco, String tipo, String cpf) {
		super(id, nome, endereco, tipo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
