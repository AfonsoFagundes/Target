package Target;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("TABUADA");
		int tabuada = sc.nextInt();
		
		
		for (int i = 1; i <= 10 ; i++){
			
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
			
		}
		
		
	}

}
