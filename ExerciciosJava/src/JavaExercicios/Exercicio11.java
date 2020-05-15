package JavaExercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				int [][] M = new int[5][5];
				int [] SL = new int[5];
				int [] SC = new int[5];
				
				
				for(int i = 0; i < 5; i++) {
					for(int j = 0; j < 5; j++) {
						System.out.printf("Insira o elemento M[%d][%d]: ",i+1, j+1);
						M[i][j] = sc.nextInt();
					}
				}
				sc.close();
				
				System.out.println("\n---Matriz M---");
				for(int i = 0; i < 5; i++) {
					for(int j = 0; j < 5; j++) {
						System.out.printf("\t%d\t", M[i][j]);
					}
					System.out.println();
				}
				
			
				for(int i = 0; i < 5; i++) {
					for(int j = 0; j < 5; j++) {
						
						SL[i] += M[i][j];
					}	
				}
				//Somando as colunas
				for(int j = 0; j < 5; j++) {
					for(int i = 0; i < 5; i++) {
						
						SC[j] += M[i][j];
					}	
				}
				
				for(int i = 0; i < 5; i++) {
					System.out.println("A Soma da coluna " + (i+1) + " = " + SC[i]);
				}
				
				System.out.println();
				
				for(int i = 0; i < 5; i++) {
					System.out.println("A Soma da linha " + (i+1) + " = " + SL[i]);
				}
			
			}
}
