
public class TestaEscopo {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 16;
		int quantidadePessoas = 1;
		boolean acompanhado; // não tem valor padrão
		// boolean acompanhado = quantidadePessoas >= 2;
		// boolean expressaoBooleana = idade >= 18 || acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
		
		if (idade >= 18 && quantidadePessoas >= 2) {
			System.out.println("Seja bem-vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}
}
