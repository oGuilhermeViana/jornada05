package entities;

public class Cliente {
	
	private Long id;
	private String nome;
	private String endereco;
	private String tipo;
	
	public Cliente() {
	}
	
	public Cliente(Long id, String nome, String endereco, String tipo) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.tipo = tipo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return id + ", " + nome + ", " + endereco + ", " + tipo;
	}
	
	
	
}
