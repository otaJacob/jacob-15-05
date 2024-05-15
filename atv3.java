package lpa;

public class atv3 {
	    public static void main(String[] args) {
	        // Criação da matriz 4x4
	        int[][] matriz = new int[4][4];

	        // Armazenando valores inteiros na diagonal principal
	        for (int i = 0; i < 4; i++) {
	            matriz[i][i] = i + 1; // Usando valores de 1 a 4 para a diagonal
	        }

	        // Exibindo a matriz resultante
	        System.out.println("Matriz 4x4 com valores na diagonal principal:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}