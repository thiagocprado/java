package bytebank;

public class Conta {
	private double saldo; // atributo
	int agencia;
	int numero;
	Cliente titular;
	// método - maneira de depositar dinheiro em uma conta 
	public void deposita(double valor) {
		
		// referencia ao objeto que está sendo invocado - no caso se invocarmos a conta do thiago, ele estará fazendo referencia a essa conta do thiago
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false; 
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} 
			
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}


// o que iremos produzir a partir da classe conta é chamado de objeto ou instância
// instânciar é um sinônimo para construção, imaginemos que iremos criar uma casa a partir de uma planta
// podemos dizer que vamos instâciar uma casa (classe do tipo casa)