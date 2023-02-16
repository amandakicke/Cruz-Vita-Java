
public class Banco implements ServicosInterface {

	private int numero;
	private int agencia;
	protected double saldo;

	public void Conta(int numero, int agencia) {
		this.numero = numero;
		this.agencia = agencia;
					
	}
	
	public void criaConta(int numero, int agencia) {
				
	}

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public double saldo() {
		return 0;
	}

	public double sacar(float valor) {
		if (valor > this.saldo) {
			System.out.println("Saque negado. Saque acima do disponível");
			return this.saldo;
		} else {
		System.out.println("Saque de R$ " + valor + " realizado com sucesso");
		System.out.println("Saldo atual R$ " + this.saldo);
		return this.saldo -= valor;
		}
	}
	public double depositar(float valor) {
		return this.saldo += valor;

	}
	
	public double transferir(Cliente contaDestino, float valor) {
		if (valor > this.saldo) {
			System.out.println("Operação negada. Valor acima do disponível");
		}
		contaDestino.saldo += valor;
		return this.saldo -= valor;

	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}

			
}
	
