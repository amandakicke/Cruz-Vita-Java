
public class Teste {

public static void main(String[] args) {
		
		
		Cliente titular1 = new Cliente("Amanda", "012.345.678.90", "032 9999 9999");
		Cliente titular2 = new Cliente("Fulano", "912.345.678.90", "032 8888 9999");
		
		titular1.criaConta(0001, 001);
		titular2.criaConta(0002, 001);
		
		System.out.println(titular1);
		System.out.println("Saldo inicial: " + titular1.saldo);
		System.out.println(titular2);
		System.out.println("Saldo inicial: " + titular2.saldo);
		
		System.out.println("----------------------------");
		
		System.out.println("Depósito na conta 001 " + titular1.depositar(200));
		System.out.println("Saldo atual: " + titular1.saldo);
		System.out.println("Depósito na conta 001 " + titular2.depositar(300));
		System.out.println("Saldo atual: " + titular2.saldo);
		
		System.out.println("----------------------------");
	
		System.out.println("Saque na conta 001 " + titular1.sacar(400));
		System.out.println("Saque na conta 002 " + titular1.sacar(50));
		
		System.out.println("----------------------------");
		
		System.out.println("Saldo da conta 001 " + titular1.saldo);
		System.out.println("Saldo da conta 002 " + titular2.saldo);
		
		System.out.println("----------------------------");
		
		System.out.println("Conta 001 transfere R$ 50,00 para a conta 002");
		titular1.transferir(titular2, 50);
		System.out.println("Saldo atual: " + titular1.saldo);
		System.out.println("Saldo atual: " + titular2.saldo);
		
		System.out.println("----------------------------");
		
		
		
		
	
		
	}

}
