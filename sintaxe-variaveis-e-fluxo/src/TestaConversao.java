
public class TestaConversao {

	public static void main(String[] args) {
		
		double salario = 1250.70;
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		int valor = (int) salario; // casting
		int x = 2000000000;
		
		long numeroGrande = 1237928713982l; // o "l" ? necess?rio para indicar que queremos um long
		short valorPequeno = 2131;
		byte b = 127;
		
		float pontoFlutuante = 3.14f; // o f ? a mesma ideia do "l"
		
		System.out.println(valor);
		System.out.println(x);
		System.out.println(numeroGrande);
		System.out.println(valorPequeno);
		System.out.println(b);
		System.out.println(total);
		System.out.println(pontoFlutuante);
	}
}
