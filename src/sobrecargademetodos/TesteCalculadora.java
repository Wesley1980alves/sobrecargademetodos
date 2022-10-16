package sobrecargademetodos;

public class TesteCalculadora {

	public static void main(String[] args) {
		MinhaCalculadora calc = new MinhaCalculadora();
		System.out.println(calc.soma(120, 125));
		System.out.println(calc.soma(20, 30));
		System.out.println(calc.soma(120, 20, 35));
		System.out.println(calc.soma(125, 3, 15, 154));
		System.out.println(calc.soma("Nao deixa morrer a ", "flor da vida" ));
		System.out.println(calc.soma("Jamais desprese a vida\n", "Nao importa o quanto dificil seja", "\nAte as flores caim em algum momento", "\nEntao lembre-se cair ,nao e sinal de derrota  ", "\nLevante-se e continui lutando que com o tempo florescera"));

	}

}
