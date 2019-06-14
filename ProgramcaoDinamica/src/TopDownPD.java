
public class TopDownPD {

	 static int[] tabela;
	 static int n;

	public static int fib(int numero) {
		n = 1;
		return (int) recursao(numero);
	}

	public static int recursao(int numero) {
		if (numero < 0) {
			return tabela[0];
		} else {
			if (n < 3) {
				tabela[numero] = n - 1;
				n++;
			} else {
				tabela[numero] = tabela[numero + 1] + tabela[numero + 2];
			}
			 return recursao(numero - 1);
		}

	}

	public static void main(String[] args) {

		int numero = 32000;
		tabela = new int[numero];

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numero; i++) {
			System.out.print("(" + i + "):" + TopDownPD.fib(i) + "\n");
		}

		long lastTime = System.currentTimeMillis();
		System.out.println("Tempo total em milessegundos: " + (lastTime - startTime));
		System.out.println("Tempo total em segundos: " + (lastTime - startTime) / 1000);
	
	}

}
