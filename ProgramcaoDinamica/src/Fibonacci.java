
public class Fibonacci {

	public static int fib(int numero) {
		if(numero < 2) {
			return numero;
		}else {
			return fib(numero - 1) + fib(numero -2); 
		}
		
	}
	
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		int numero =100;
		for (int i = 0; i < numero; i++) {
            System.out.print("(" + i + "):" + Fibonacci.fib(i) + "\n");
        }
		
		double lastTime= System.currentTimeMillis();
		System.out.println("Tempo total em milessegundos: " + (lastTime - startTime)); 
	    System.out.println("Tempo total em segundos: " + (lastTime - startTime)/1000); 
	}
	
}
