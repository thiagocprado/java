
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		// conta.numero = 1337
		conta.setNumero(1377);
		System.out.println(conta.getNumero());
		
		Cliente clienteUm = new Cliente();
		// conta.titular = clienteUm;
		
		clienteUm.setNome("thiago");
		conta.setTitular(clienteUm);
		
		System.out.println(conta.getTitular());
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
	}
}
