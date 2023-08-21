package exer3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		Aluno aluno = new Aluno();
		
		System.out.print("Insira o Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Insira as Notas do Aluno: ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Total da nota: %.2f%n", aluno.totalNota());
		if (aluno.totalNota() < 60.0) {
		System.out.println("Você falhou!");
		System.out.printf("Faltou %.2f pontos %n", aluno.pontosFaltantes());
		}
		else {
		System.out.println("Você passou!");
		}

		
		sc.close();
	}

}