package com.github.fabriciofx.pooed.matriz;

import javax.swing.JOptionPane;

public class QuadradoNumerico {
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

	public static int[][] quadrado(int tamanho) {
		int[][] m = new int[tamanho][tamanho];

		int a = 0, b = tamanho, v = 1;
		for (int j = 0; j < tamanho / 2; j++) {
			for (int i = a; i < b; i++) {
				m[j][i] = v;
				m[i][j] = v;
				m[tamanho -1 - j][i] = v;
				m[i][tamanho -1 - j] = v;
			}
			v++;
			a++;
			b--;
		}
		
		if (tamanho % 2 == 1) {
			m[tamanho / 2][tamanho / 2] = v;
		}
		
		return m;
	}
	
	public static void main(String[] args) {
		int[][] m = new int[6][6];

		int a = 0, b = 6, v = 1;
		for (int j = 0; j < 3; j++) {
			for (int i = a; i < b; i++) {
				m[j][i] = v;
				m[i][j] = v;
				m[5 - j][i] = v;
				m[i][5 - j] = v;
			}
			v++;
			a++;
			b--;
		}

		mostra(m);
		mostra(quadrado(15));
	}
}
