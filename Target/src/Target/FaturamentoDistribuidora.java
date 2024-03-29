package Target;

import java.util.Scanner;

public class FaturamentoDistribuidora {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// vetor de faturamento diário da distribuidora
		double[] faturamentoDiario = { 15.000, 28.000, 21.000, 32.500, 18.000, 22.000, 28.000, 31.000, 24.000, 29.000,
				26.000, 32.000 };

		// calcula o menor valor de faturamento diário
		double menorFaturamentoDiario = faturamentoDiario[0];
		for (int i = 1; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] < menorFaturamentoDiario) {
				menorFaturamentoDiario = faturamentoDiario[i];
			}
		}
		System.out.println("Menor faturamento diário: " + menorFaturamentoDiario);

		// calcula o maior valor de faturamento diário
		double maiorFaturamentoDiario = faturamentoDiario[0];
		for (int i = 1; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > maiorFaturamentoDiario) {
				maiorFaturamentoDiario = faturamentoDiario[i];
			}
		}
		System.out.println("Maior faturamento diário: " + maiorFaturamentoDiario);

		// média mensal de faturamento diário
		double somaFaturamentoDiario = 0;
		for (int i = 0; i < faturamentoDiario.length; i++) {
			somaFaturamentoDiario += faturamentoDiario[i];
		}
		double mediaMensalFaturamentoDiario = somaFaturamentoDiario / faturamentoDiario.length;

		// calcula o número de dias no mês em que o faturamento diário foi superior à
		// média mensal
		int numeroDiasSuperiorMedia = 0;
		for (int i = 0; i < faturamentoDiario.length; i++) {
			if (faturamentoDiario[i] > mediaMensalFaturamentoDiario) {
				numeroDiasSuperiorMedia++;
			}
		}
		System.out.println("Número de dias com faturamento diário superior à média mensal: " + numeroDiasSuperiorMedia);
	}
}
