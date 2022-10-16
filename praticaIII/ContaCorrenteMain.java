package praticaIII;

public class ContaCorrenteMain extends ContaCorrente {
	public static void main(String[] args) {
		ContaCorrente contaC = new ContaCorrente();
		contaC.Nome = "Pedro";
		contaC.Cpf = "104.752.299-32";
		contaC.NumeroConta = 69;
		contaC.Saldo = 999.99;
		
		contaC.ApresentarDados();
		
		Double sacarDinheiro = 99.99;
		contaC.Sacar(sacarDinheiro);
		System.out.println("Novo saldo: " + contaC.Saldo);
		
		Double depositarDinheiro = 100.00;
		contaC.Depositar(depositarDinheiro);
		System.out.println("Novo saldo: " + contaC.Saldo);
	}
	
	
}
