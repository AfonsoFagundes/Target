package Target;

import java.util.Scanner;

public class FaturamentoDiario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double menorValor = Integer.MAX_VALUE;
		double maiorValor = Integer.MIN_VALUE;
		
	int [] faturamentosDiarios = new int [23];
	
	  System.out.print("\nDigite o faturamento diario: " );
      String mostrarTexto=sc.next();
	for(int i=0 ; i < 23 ; i++){
        System.out.print("" );
        faturamentosDiarios[i] = sc.nextInt();
		
	  }
	for(int i=0 ; i< 23 ; i++){
        System.out.printf("Dia %d -> Valor armazenado: %d\n" ,(i+1) , (faturamentosDiarios[i]));
	}
	
	}
}
