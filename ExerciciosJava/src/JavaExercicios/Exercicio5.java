package JavaExercicios;

import java.util.Scanner;

public class Exercicio5 {
public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int num,soma=0,media=0,i=0;
		
		do {
			
			System.out.println("Entre com um n�mero: ");
			num = sc.nextInt();
			
			if(num > 0) {
			soma = soma + num;
			i++;
			}
			
					
		}while(num > 0);
		
		media = (media + soma)/ i;
		
		System.out.println("A soma dos numero apresentados �: "+ soma);
		System.out.println("A m�dia e total dos numero lidos �: "+ media + " e "+ i +" n�meros lidos" );
		sc.close();
	}
}
