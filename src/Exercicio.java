public class Exercicio {
	public static void main(String[] args) {
		String product01 = "Computer";
		String product02 = "Oficce Desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", product01, price1);
		System.out.printf("%s, which price is $ %.2f %n", product02, price2);
		System.out.println();
		System.out.printf("%d years old, code %d  and gender: %c", age, code, gender);
		System.out.println();
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f", measure);
		System.out.println();
		System.out.printf("Rouded(three decimal places): %.3f", measure);
		System.out.println();
		System.out.printf("US decimal point: %.3f", measure);

	}
}
