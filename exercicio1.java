package lista5;
import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
			int vet[] = new int [5];
			
			for (int i = 0; i < vet.length; i++) {
				System.out.printf("Informe o %d° número: ", i+1);
					vet[i] = read.nextInt();
			}
			
			System.out.print("Impressão: ");
			
			for (int i = 0; i < vet.length; i++) {
				System.out.print(vet[i] + "\n");
			}
		
	}

}
