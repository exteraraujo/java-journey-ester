package fundamentos;

import java.util.Scanner;

public class AtividadeTemperatura {
	
	public static void main(String[] args) {
		//(°F - 32) * 5/9 = °C
		Scanner scanner = new Scanner (System.in);
		
		// Pedir ao usuário para digitar a temperatura em fahrenheit
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double fahrenheit= scanner.nextDouble();
		scanner.close();
		
	   // Converter a temperatura para Celcius 
		double celsius= (fahrenheit - 32) * 5/9;

       //Mostrar resultado na tela
       System.out.printf("A temperatura em Celsius é: %.2f°C\n", celsius);
       
       scanner.close();

	
		
	}

}
