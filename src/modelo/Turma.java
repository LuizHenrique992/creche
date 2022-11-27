package modelo;

public class Turma {
	private String nomeTurma;
	private int codigoTurma;
	private int quantiaAlunosMaximo;
	
	public String getNomeTurma() {
		return nomeTurma;
	}
	
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public int getCodigoTurma() {
		return codigoTurma;
	}
	
	public void setCodigoTurma(int codigoTurma) {
		this.codigoTurma = codigoTurma;
	}
	
	public int getQuantiaAlunosMaximo() {
		return quantiaAlunosMaximo;
	}
	
	public void setQuantiaAlunosMaximo(int quantiaAlunosMaximo) {
		this.quantiaAlunosMaximo = quantiaAlunosMaximo;
	}
}
