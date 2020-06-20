package sequencia.fibonacci;

public class MainFibo {

	public static void main(String[] args) {
		
			calcularFibonacci(7, ",");
			System.out.println();
			
			calcularFibonacci(9, "*");
			System.out.println();
			
			int[] valores = calcularFibonacci(10);
			for(int v : valores) {
				System.out.print(v + "-");
			}
		}
	
	static void calcularFibonacci(int vezes, String separador) {
		for (int proximo = 1, anterior = 0, cont = 0; cont < vezes; cont++) {
			System.out.print(anterior + separador);
			anterior = anterior + proximo;
			proximo = anterior -  proximo;	
		}
	}
	
	static int[] calcularFibonacci(int vezes) {
		int[] resposta = new int[vezes];
		for (int proximo = 1, anterior = 0, cont = 0; cont < vezes; cont++) {
			anterior = anterior + proximo;
			proximo = anterior -  proximo;
			resposta [cont] = anterior;
		}
		return resposta;

}
}


