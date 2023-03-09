package baralho;

public class Carta {

	public String nome;
	public String naipe;
	
	public Carta(String nome, String naipe) {
		this.nome = nome;
		this.naipe = naipe;
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

	@Override
	public String toString() {
		return nome + " de " + naipe;
	}

	
	
}
