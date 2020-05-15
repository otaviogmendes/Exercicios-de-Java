package JavaExercicios;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		 float media = 0,nota1,nota2;
		 String nome;
		 int i =0;
		
		 
		while(i <= 5) {
				
		 
		 System.out.printf("Entre com o nome do aluno: ");
		 nome = sc.next();
		 
		
		 System.out.println("Entre com a nota A: ");
		 nota1 = sc.nextFloat();
		 
		 if(nota1 > 10 || nota1 < 0) {
			 System.out.println("Nota Inválida");
			 
			 do {
				 System.out.println("Entre com a nota A novamente: ");
				 nota1 = sc.nextFloat();
			 }while(nota1 > 10);
		 }
		 
			 System.out.println("Entre com a nota B: ");
			 nota2 = sc.nextFloat();
			 
			 if(nota2 > 10 || nota2 < 0) {
				 System.out.println("Nota Inválida");
				 
				 do {
					 System.out.println("Entre com a nota B novamente: ");
					 nota2 = sc.nextFloat();
				 }while(nota2 > 10);
			 }
			 
			 	media = (nota1 + nota2) /2;
			 	System.out.println("O aluno " + nome + " tem a média " + media);
			 	i++;
		 
		 }
			sc.close();
		 
	}
}
