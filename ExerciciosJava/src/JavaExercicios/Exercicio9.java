package JavaExercicios;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int matricula[] = new int[60], listaMatricula[] = new int [60];
		int i = 0, contador = 0, estaCursando;
		boolean sim = true, nao = false, disciplinaX[] = new boolean [60], disciplinaY[] = new boolean [60];
		
		for(i= 0; i < matricula.length; i++) {
			System.out.printf("Informe o numero da sua matricula: ");
			matricula[i] = sc.nextInt();
			while(matricula[i] > 999) {
				System.out.println("Matricula invalida, digite novamente.");
				System.out.printf("Informe o numero da sua matricula: ");
				matricula[i] = sc.nextInt();
			}
			System.out.println("Voce cursa a disciplina X ? Sim[1] Nao[2]");
			estaCursando = sc.nextInt();
			if(estaCursando == 1) {
				disciplinaX[i] = sim;
			} else {
				disciplinaX[i] = nao;
			}
			System.out.println("Voce cursa a disciplina Y ? Sim[1] Não[2]");
			estaCursando = sc.nextInt();
			
			if(estaCursando == 1) {
				disciplinaY[i] = sim;
			} else {
				disciplinaY[i] = nao;
			}
		}

	
		for(i = 0; i < matricula.length; i++) {
			if(disciplinaX[i] == disciplinaY[i] && disciplinaX[i] != false && disciplinaY[i] != false) {
				contador += 1;
				listaMatricula[i] = matricula[i];
			}
		}
		
	
		if(contador > 0) {
			System.out.println(contador + " alunos estao cursando as disciplinas X e Y simultaneamente");
			System.out.println("Sao eles;");
			
			
			for(i = 0; i < matricula.length; i++) {
				if(listaMatricula[i] > 0) {
					System.out.println("Matricula: " + listaMatricula[i]);
				}	
			}
			
		} else {
			System.out.println("Nenhum aluno cursa simultaneamente as disciplinas X e Y");
		}
		
	}
}
