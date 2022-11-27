package modelo;

public class Endereco {
	private String rua;
	private String cep;
	private int numeroDaCasa;
	private String pontoReferencia;
	private String bairro;
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return this.rua;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getCep() {
		return this.cep;
	}
	
	public void setNumeroDacasa(int numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	
	public int getNumeroDaCasa() {
		return this.numeroDaCasa;
	}
	
	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}
	
	public String getPontoRefencia() {
		return this.pontoReferencia;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return this.bairro;
	}
}
