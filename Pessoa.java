package exercicios;

public class Pessoa {
	String nome;
	
	int idade;
	
	
	void falar(String frase) {
		System.out.println(frase);
	}
	
	void apresentarSe() {
		String frase = " Oi, meu nome é " + nome;
		
		falar(frase);
	}
	
	
	public static void main (String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "José";
		
		p1.falar("alguma coisa: ");
		p1.apresentarSe();
		
	}

}

