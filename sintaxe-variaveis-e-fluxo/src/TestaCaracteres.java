
public class TestaCaracteres {

	public static void main(String[] args) {
		char letra = 'a';
		char valor = 66; // unicode ou ascii
		
		String palavra = "Thiago Cintra Prado";
		
		System.out.println(letra);
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
