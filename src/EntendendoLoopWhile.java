import java.util.Scanner;

public class EntendendoLoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
		 * calcular essa m�dia?
		 */

		int idade;
		double media = 0;
		int quantidadeAluno = 0;
		int totalAluno;
		Scanner leitor = new Scanner(System.in);

		System.out.println("Por favor informe a quantidade de alunos: ");
		totalAluno = leitor.nextInt();

		while (quantidadeAluno < totalAluno) {
			System.out.println("Informe a idade do " + quantidadeAluno + " aluno:");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAluno++;
		}

		media = media / (double) totalAluno;
		System.out.println("A m�dida �: " + media);
	}

}
