package br.edu.ifpe.garanhuns.pooed.matriz;

import javax.swing.JOptionPane;

public class Multiplicacao {
	public static int[][] multiplica(int[][] A, int[][] B) {
		int linhasA = A.length;
		int colunasA = A[0].length;
		int linhasB = B.length;
		int colunasB = B[0].length;
		
		if (colunasA != linhasB) {
			JOptionPane.showMessageDialog(null, "as matrizes são possuem dimensões compatíveis");
			return null;
		}
		
		// A = | 1  2  3 |             A = | [0][0]  [0][1]  [0][2] |
		//     |-2  0  4 | 2x3             | [1][0]  [1][1]  [1][2] | 2x3
		//
		//     | 2  3 |                    | [0][0]  [0][1] |
		// B = | 0  1 |                B = | [1][0]  [1][1] |
		//     |-1  4 | 3x2                | [2][0]  [2][1] | 3x2
		//
		// M = |-1  17 |               M = | [0][0]  [0][1] |
		//     |-8  10 | 2x2               | [1][0]  [1][1] | 2x2
		//
		//   i  j      i  k      k  j      i  k      k  j      i  k      k  j
		// M[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0] + A[0][2] * B[2][0] 
		// M[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1] + A[0][2] * B[2][1] 
		// M[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0] + A[1][2] * B[2][0] 
		// M[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1] + A[1][2] * B[2][1]
		//
		// M[i][j] = M[i][j] + A[i][k] * B[k][j] 
		int[][] M = new int[linhasA][colunasB];
		
		for (int i = 0; i < linhasA; i++) {
			for (int j = 0; j < colunasB; j++) {
				for (int k = 0; k < colunasA; k++) {
					M[i][j] = M[i][j] + A[i][k] * B[k][j];
				}
			}
		}
		
		return M;
	}

	public static void mostra(int[][] M) {
		String r = "";
		int linhas = M.length;
		int colunas = M[0].length;
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				r = r + M[i][j] + " ";
			}
			
			r = r + "\n";
		}
		
		JOptionPane.showMessageDialog(null, r);
	}
	
	public static void main(String[] args) {
		int[][] A = {{1, 2, 3}, {-2, 0, 4}};
		int[][] B = {{2, 3}, {0, 1}, {-1, 4}};
		
		int[][] R = multiplica(A, B);
		mostra(R);
	}
}
