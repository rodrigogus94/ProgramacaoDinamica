
public class ProblemaMochila {

	public static int calcular(int capacidade, int[] pesos, int[] valores) {
		int n = pesos.length;
		int[][] mochila = new int[n + 1][capacidade + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= capacidade; j++) {
				if ((i == 0) || (j == 0)) {
					mochila[i][j] = 0;
				} else {
					if (pesos[i-1] <= j) {
						mochila[i][j] = Math.max(valores[i-1] + mochila[i - 1][j - pesos[i - 1]], mochila[i - 1][j]);
					} else {
						mochila[i][j] = mochila[i - 1][j];
					}
				}
			}
			
		

		}
		most(mochila);
		return mochila[n][capacidade];
	
	}
	
	public static void most(int[][] mochila) {
		String most= "";
		for (int i = 0; i < mochila.length; i++) {
			for (int j = 0; j < mochila.length; j++) {
				most += mochila[i][j] + " |" ;
			}
		}
		
		System.out.println(most);
	}
	
	
	public static void main(String[] args) {
		int[] valores = {60, 100, 120};
		int[] pesos = {10, 20, 30};
		int capacidade = 50;
		
		
		System.out.println("Valor maximo da mochila: " + calcular(capacidade, pesos, valores) );
 	}

}
