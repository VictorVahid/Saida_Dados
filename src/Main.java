import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		int y = 32;
		double x = 10.2313;
		String nome = "Maria";
		int idade = 31;
		double renda = 5000.0;

		Locale.setDefault(Locale.US);
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		System.out.printf("%.4f%n",x);
		System.out.println("Hello world!");
		System.out.println("O carro tem: " +x+ " Metros!");
		System.out.printf("O carro tem: %.2f metros!",x);
		System.out.printf("%n%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}
}