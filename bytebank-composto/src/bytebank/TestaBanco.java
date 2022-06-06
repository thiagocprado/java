package bytebank;

public class TestaBanco {
	public static void main(String[] args) {
		Cliente thiago = new Cliente(); 
		thiago.nome = "Thiago Prado";
		thiago.cpf = "111.111.111-22";
		thiago.profissao = "programador";
		
		
		Conta contaDoThiago = new Conta();
		contaDoThiago.deposita(100);
		
		 // associação -> atribuir uma referência pro atributo titular 
		contaDoThiago.titular = thiago;
	}
}
