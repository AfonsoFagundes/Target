package Target;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// solicita ao usuário um número para verificar se pertence à sequência de
		// Fibonacci
		System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
		int num = sc.nextInt();

		int a = 0; 
		int b = 1; 
		int c = 0; 

		while (c < num) { 
			c = a + b;
			a = b;
			b = c;
		}

		if (c == num) { 
			System.out.println(num + " pertence à sequência de Fibonacci!");
		} else {
			System.out.println(num + " não pertence à sequência de Fibonacci!");
		}
	}
}