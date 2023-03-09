package baralho;

public class Teste {

	public static void main(String[] args) {

		Baralho baralho = new Baralho();

		System.out.println("---BARALHO CRIADO---");
		baralho.imprimeBaralho();
		System.out.println();
		
		System.out.println("---CARTAS EMBARALHADAS---");
		baralho.embaralha();
		System.out.println();
		
		System.out.println("---RETIRA A PRIMEIRA CARTA DA PILHA---");
		baralho.darCartas();
		baralho.darCartas();
		baralho.darCartas();
		baralho.darCartas();
		baralho.darCartas();
		System.out.println();
		
		System.out.println("---O BARALHO AINDA POSSUI CARTAS?---");
		baralho.temCarta();
		System.out.println();
		
		System.out.println("---EMBARALHA O RESTANTE DAS CARTAS---");
		baralho.embaralha();
	}

}
