
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado = true;
		boolean expressaoBooleana = idade >= 18 || acompanhado;

		if (expressaoBooleana) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente voc? n?o pode entrar");
		}
		
		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente voc? n?o pode entrar");
		}
	}
}
