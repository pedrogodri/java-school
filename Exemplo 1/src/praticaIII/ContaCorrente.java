package praticaIII;

public class ContaCorrente {
	public String Nome;
	public String Cpf;
	public Integer NumeroConta;
	public Double Saldo;
	
	public void ApresentarDados() {
		System.out.println("Titular: " + Nome);
		System.out.println("CPF: " + Cpf);
		System.out.println("Numero Conta: " + NumeroConta);
		System.out.println("Saldo: " + Saldo);
	}
	
	public Double Sacar(Double sacarDinheiro) {
		
		Saldo -= sacarDinheiro;
		return Saldo;
	}
	
	public Double Depositar(Double depositarDinheiro) {
		Saldo += depositarDinheiro;
		return Saldo;
	}
}
