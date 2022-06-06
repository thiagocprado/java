package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoThiago = new Conta();
		contaDoThiago.deposita(1000);
		
		Conta contaDoMarcelo = new Conta();
		contaDoMarcelo.deposita(1000);
		
		// System.out.println(contaDoThiago.saldo);
		
		boolean conseguiuretirar = contaDoThiago.saca(500);
		
		System.out.println(contaDoThiago.saldo);
		System.out.println(conseguiuretirar);
		
		contaDoMarcelo.transfere(300, contaDoThiago);
		
		System.out.println(contaDoMarcelo.saldo);
		System.out.println(contaDoThiago.saldo);
	}

}
