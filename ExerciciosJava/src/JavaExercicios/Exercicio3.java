package JavaExercicios;

public class Exercicio3 {
public static void main(String args[]) {
		
		
		
		for(int i=233; i < 456;i++) {
			if(i < 300) {
				System.out.println(i);
				
			}
			else if(i > 299 && i <401) {
				i =  i + 2;
				System.out.println(i);
				
			}else {
				i = i + 4;
				System.out.println(i);
			}
	}
}
}
