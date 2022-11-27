package visao;

import java.util.Scanner;
import modelo.Crianca;
import modelo.Endereco;
import modelo.Responsavel;
import modelo.Cuidador;
import modelo.Turma;

public class Main {

	public static void main(String[] args) {
		int digito;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Menu Principal\r\n"
					+ "--------------------------\r\n"
					+ "1  - Cadastrar aluno\r\n"
					+ "2  - Editar dados Aluno \r\n"
					+ "3  - Cadastrar Cuidador\r\n"
					+ "4  - Alterar dados cuidador\r\n"
					+ "5  - Relatorio de aluno\r\n"
					+ "6  - Cadastrar turma\r\n"
					+ "7  - Alterar Turma\r\n"
					+ "8  - Cadastrar Extra-Curricular\r\n"
					+ "9  - Editar Extra-Curricular\r\n"
					+ "10 - Sair do Sistema ");
			
			digito = teclado.nextInt();
			switch(digito) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				break;
			default:
				System.out.println("Opção invalida");
			
			}
		
		
		}while(digito != 10);
	}
		
}
