package lista5;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
			float vet[] = new float [10];
		
			for (int i = 0; i < vet.length; i++) {
				System.out.printf("Informe o %d° número: ", i+1);
					vet[i] = read.nextFloat();
			}
		
			System.out.print("Impressão: ");
		
			for (int i = 9; i >= 0; i--) {
				System.out.print(vet[i] + "\n");
			}

	}
	
}
