package Target;

public class Faturamento {

	    public static void main(String[] args) {
	        double sp = 67836.43;
	        double rj = 36678.66;
	        double mg = 29229.88;
	        double es = 27165.48;
	        double outros = 19849.53;
	        
	        double total = sp + rj + mg + es + outros;
	        
	        double percSp = (sp/total)*100;
	        double percRj = (rj/total)*100;
	        double percMg = (mg/total)*100;
	        double percEs = (es/total)*100;
	        double percOutros = (outros/total)*100;
	        
	        System.out.println("Percentual de representação do faturamento por estado:");
	        System.out.printf("SP: %.2f%%\n", percSp);
	        System.out.printf("RJ: %.2f%%\n", percRj);
	        System.out.printf("MG: %.2f%%\n", percMg);
	        System.out.printf("ES: %.2f%%\n", percEs);
	        System.out.printf("Outros: %.2f%%\n", percOutros);
	    }
}
