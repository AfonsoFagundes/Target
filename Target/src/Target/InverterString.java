package Target;

	import java.util.Scanner;

	public class InverterString {
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Digite uma texto: ");
	        String texto = sc.nextLine();
	        String inverterString = "";

	        for (int i = texto.length()-1; i >= 0; i--) {
	            inverterString += texto.charAt(i);
	        }

	        System.out.println("String invertida: " + inverterString);

    }
}