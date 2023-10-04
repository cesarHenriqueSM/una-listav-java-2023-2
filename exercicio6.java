package lista5;
import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double media [] = new double [10];
		int contador_media = 0;
		
		for(int i = 0; i < media.length; i++) {
			double notas = 0;
			System.out.printf("Informe as 4 notas do %d° aluno: ", i+1);
			for(int j = 0; j < 4; j++) {
				System.out.printf("\n%dª nota: ", j+1);
					notas += read.nextDouble();
			}
			media[i] = notas / 4;
			if(media[i] >= 7) {
				contador_media++;
			}
		}
		
		System.out.print("O número de alunos com a nota maior ou igual a sete é " + contador_media);
		for (int i = 0; i < media.length; i++) {
			System.out.printf("\nMédia do %d° aluno: ", i+1);
			System.out.print(media[i]);
		}
	}

}
