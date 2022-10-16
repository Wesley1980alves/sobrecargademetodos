package sobrecargademetodos;

public class MinhaCalculadora {
	double valor;

	public int soma(int valor, int valor2) {
		return valor + valor2;

	}

	public double soma(double valor, int valor2) {
		return valor * valor2;
	}

	public double soma(int valor, int valor2, float valor3) {
		return valor * valor2 - valor3;
	}

	public double soma(int valor, int valor2, int valor3, double valor4) {
		return (valor4 * valor) + valor3 - valor2;
	}
	public String soma(String nome1,String nome2) {
		return nome1+nome2;
	}
	public String soma(String nome1,String nome2,String nome3,String nome4,String nome5) {
		return nome1+nome2+nome3+nome4+nome5;
	}

}
