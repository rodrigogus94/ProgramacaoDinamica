
public class BottomUpPD {
	
	//Programação donâmica com Bottom - up ( de baixo para cima
	static boolean p = false;
	public static int fiboPD(int n) {
		int[] fib = new int[n + 1];
		
		fib[0] = 0;
		fib[1] = 1;
		if (p == false) {
			System.out.print("    |(" + 0 + "):" + fib[0] + "\n");
			System.out.print("(" + 1 + "):" + fib[1] + "\n");
			p = true;
		}
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}

	public static void main(String[] args) {

		int numero = 500000;

		double startTime = System.currentTimeMillis();
		for (int i = 2; i < numero; i++) {
			System.out.print("(" + i + "):" + BottomUpPD.fiboPD(i) + "\n");
		}

		double lastTime = System.currentTimeMillis();
		System.out.println("Tempo total em milessegundos: " + (lastTime - startTime));
		System.out.println("Tempo total em segundos: " + (lastTime - startTime) / 1000);
		System.out.println("Tempo total em munitos: " + (((lastTime - startTime) *60)/3600)/1000);

	}
}
