package modelo;

public class Responsavel extends Pessoa {
	private int telefone;
	private Endereco endereco; 

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getTelefone() {
		return this.telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
