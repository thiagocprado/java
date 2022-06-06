package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		// instânciação de uma classe do tipo conta
		Conta primeiraConta = new Conta();

		// referencia ao saldo da primeira conta - ao atributo saldo do objeto conta -
		// orientado a objeto
		primeiraConta.saldo = 200;

		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;

		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("é a mesma conta");
		} else {
			System.out.println("contas diferentes");
		}

		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}

// Uma classe é uma especificação de um tipo, definindo atributos e comportamentos.
// Um objeto é uma instância de uma classe onde podemos definir valores para seus atributos.