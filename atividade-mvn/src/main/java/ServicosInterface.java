
public interface ServicosInterface {
	
	public double sacar(float valor);
	
	public double depositar(float valor);
	
	void criaConta(int numero, int agencia);

	double transferir(Cliente contaDestino, float valor);
}
