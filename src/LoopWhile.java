import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*
		 * Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de existem 5 quantos alunos existem e sem a necessidade de armazenar
		 * permanentemente a idade de cada um desses alunos, qual � a melhor forma de
		 * calcular essa m�dia?
		 */

		int idade;
		double media = 0;
		int quantidadeAluno = 0;
		Scanner leitor = new Scanner(System.in);

		while (quantidadeAluno < 5) {
			System.out.println("Informe a idade do " + quantidadeAluno + " aluno:");
			idade = leitor.nextInt();
			media = media + idade;
			quantidadeAluno++;
		}

		media = media / 5.0;
		System.out.println("A m�dida �: " + media);
	}

}
