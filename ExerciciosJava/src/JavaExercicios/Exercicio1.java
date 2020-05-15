package JavaExercicios;

public class Exercicio1 {
	

public static void main(String args[])
{
		
		int somaImpar=0;
				
		System.out.println("Os numeros impares são: ");
		for(int i= 1;i <= 500;i++) {
			
				
			if(i%2 != 0 && i%3 == 0) {
				somaImpar = somaImpar + i;
				System.out.println(i);
				
			}else {
				
			}
			
		}
}
}
