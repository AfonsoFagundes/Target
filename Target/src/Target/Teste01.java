package Target;
import java.util.Scanner;

public class Teste01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int indice = 13;
		int soma = 0;
		int k =0;
		
		do {
			k++;
			soma = soma+k;
			System.out.println("Resultado: "+soma);
		}
		while (k < indice); {}
	    
		
	}

}
