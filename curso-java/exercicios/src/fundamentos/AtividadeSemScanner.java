package fundamentos;

public class AtividadeSemScanner {

	public static void main(String[] args) {
		double fahrenheit = 86.0; // Valor definido manualmente
		final double fator = 5.0/9.0; // Fator fixo da fórmula
		final double ajuste = 32.0; // Ajuste fixo da fórmula
		
		double celsius = (fahrenheit - ajuste) * fator;
		System.out.println("A temperatura em celsius é: " + celsius + "°C");
		
		fahrenheit = 150;
		celsius = (fahrenheit - ajuste) * fator;
		System.out.println("A temperatura em celsius é: " + celsius + "°C");
		

	}
}
