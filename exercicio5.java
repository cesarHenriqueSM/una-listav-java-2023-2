package lista5;
import java.util.Scanner;

public class exercicio5 {
	
	public static void main(String[] args) {
	
		Scanner read = new Scanner(System.in);
		
		int numeros[] = new int [20], par = 0, impar = 0, contadorP = 0, contadorI = 0;
		
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
				numeros[i] = read.nextInt();
				
				if(numeros[i] % 2 == 0) {
					par++;
				}
				else {
					impar++;
				}
		}
		
		int numeros_pares[] = new int [par];
		int numeros_impares[] = new int [impar];
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				contadorP++;
				numeros_pares[contadorP-1] = numeros[i];
			}
			else {
				contadorI++;
				numeros_impares[contadorI-1] = numeros[i];
			}
		}
		
		System.out.print("Vetor original: ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.print("\nVetor números pares: ");
		for(int i = 0; i < numeros_pares.length; i++) {
			System.out.print(numeros_pares[i] + " ");
		}
		System.out.print("\nVetor números ímpares: ");
		for(int i = 0; i < numeros_impares.length; i++) {
			System.out.print(numeros_impares[i] + " ");
		}
	}
}