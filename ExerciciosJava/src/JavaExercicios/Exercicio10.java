package JavaExercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][] N1 = new int[4][6];
		int [][] N2 = new int[4][6]; 
		
		int [][] M1 = new int[4][6];
		int [][] M2 = new int[4][6];
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("Insira o elemento N1[%d][%d]: ",i+1, j+1);
				N1[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("Insira o elemento N2[%d][%d]: ",i+1, j+1);
				N2[i][j] = sc.nextInt();
			}
		}
		sc.close();
	
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				M1[i][j] = N1[i][j] + N2[i][j];
			}
		}
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				M2[i][j] = N1[i][j] - N2[i][j];
			}
		}
		
		System.out.println("\n---Matriz M1---");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("\t %d \t", M1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\n---Matriz M2---");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.printf("\t %d \t", M2[i][j]);
			}
			System.out.println();
		}
		
	}
}
