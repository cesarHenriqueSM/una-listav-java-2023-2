package lista5;
import java.util.Scanner;

public class exemplo {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
			int matriz_bingo[] [] = new int [4] [4];
			
			for (int linha = 0; linha < matriz_bingo.length; linha++) {
				for (int coluna = 0; coluna < matriz_bingo.length; coluna++) {
					System.out.printf("Informe o número da %dª linha; %dª coluna: ", linha+1, coluna+1);
						matriz_bingo[linha][coluna] = read.nextInt();
				}
			}
			
			System.out.println("Matriz:");
			for (int linha = 0; linha < matriz_bingo.length; linha++) {
				System.out.print("\n");
				for (int coluna = 0; coluna < matriz_bingo.length; coluna++) {
					System.out.print(matriz_bingo[linha] [coluna] + " ");
				}
			}

	}
}
