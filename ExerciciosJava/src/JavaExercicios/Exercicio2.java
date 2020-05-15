package JavaExercicios;

public class Exercicio2 {
public static void main(String args[]) {
		
		int resultado = 0;
		
		for(int i=1000;i<=1999;i++) {
			if(i%11 == 0 || i%2 == 5) {
				resultado = resultado + i;
				System.out.println(i);
			}
			
		}
	}
}
