# César Henrique Soares Marques - RA 622120352
## Una LISTA V - 2023/2

### 1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

'''
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
'''

### 2. Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.

'''
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
'''

### 3. Faça um Programa que leia 4 notas, mostre as notas e a média na tela.

'''
package lista5;
import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float notas[] = new float [4];
		
		float soma = 0, media;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a %dª nota: ", i+1);
				notas[i] = read.nextFloat();
				soma = soma + notas[i];
		}
		
		System.out.print("Notas: ");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + "\n");
		}
		
		media = soma/notas.length;
		
		System.out.printf("A média das notas informadas é de %.2f.", media);
	}

}
'''

### 4. Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

'''
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
'''

### 5. Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor ímpar. Imprima os três vetores.


'''
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
'''

### 6. Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
