public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1582, 42152);
		System.out.println(conta.getAgencia() + conta.getNumero());
		
		Conta conta2 = new Conta(1584, 44152);
		Conta conta3 = new Conta(1534, 44152);
		
		System.out.println(Conta.getTotal());
	}
}
