package baralho;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Baralho {

	private ArrayList<Carta> cartas;

	public Baralho() {

		cartas = new ArrayList<>();

		String[] nome = { "Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Rainha", "Rei", "Coringa" };
		String[] naipe = { "Ouros", "Espadas", "Paus", "Copas" };

		for (int i = 0; i < nome.length; i++) {
			for (int n = 0; n < naipe.length; n++) {
				Carta carta = new Carta(null, null);
				carta.setNome(nome[i]);
				carta.setNaipe(naipe[n]);
				cartas.add(carta);
			}
		}
	}

	public void imprimeBaralho() {
		Iterator it = cartas.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("O baralho possui " + cartas.size() + " cartas");
	}

	public void embaralha() {
		Collections.shuffle(cartas);
		imprimeBaralho();
	}

	public void darCartas() {
		if (!cartas.isEmpty()) {
			System.out.println(cartas.get(0));
			cartas.remove(0);
			System.out.println("O baralho possui agora " + cartas.size() + " cartas");
		} else {
			System.out.println("O baralho está vazio. Imprima o baralho novamente.");
		}
	}

	public void temCarta() {
		if (!cartas.isEmpty()) {
			System.out.println("O baralho ainda possui " + cartas.size() + " cartas");
		} else {
			System.out.println("O baralho está vazio. Imprima o baralho novamente.");
		}
	}
}
