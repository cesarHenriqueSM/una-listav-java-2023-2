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
