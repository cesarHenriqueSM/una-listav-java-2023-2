package lista5;
import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		    char[] caracteres = new char[10];

		        for (int i = 0; i < caracteres.length; i++) {
		            System.out.printf("Digite o %d° caractere: ", i+1);
		            	caracteres[i] = read.next().charAt(0);
		        }

		        int contador_consoantes = 0;
		        System.out.print("Consoantes lidas: ");
		        for (int i = 0; i < caracteres.length; i++) {
		            char c = Character.toLowerCase(caracteres[i]);
		            if (c >= 'a' && c <= 'z' && c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
		                System.out.print(caracteres[i] + " ");
		                contador_consoantes++;
		            }
		        }

		        System.out.println("\nTotal de consoantes: " + contador_consoantes);

	}
	
}