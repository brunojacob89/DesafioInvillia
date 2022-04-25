import java.util.Scanner;

public class Abastecimento {

	public static void main(String[] args) {
		
		double tamanhoPista;
		int numeroVoltas;
		int numeroAbastecimento;
		double consumo;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o comprimento da Pista em METROS: ");
		tamanhoPista = teclado.nextDouble();
		
		System.out.print("Digite o número TOTAL de voltas: ");
		numeroVoltas = teclado.nextInt();
		
		System.out.print("Digite o número de REABASTECIMENTOS desejados: ");
		numeroAbastecimento = teclado.nextInt();
		
		System.out.print("Digite o CONSUMO do carro em KM/L");
		consumo = teclado.nextDouble();
		
		double pitStop = (numeroVoltas / numeroAbastecimento) / consumo;
		double reabastecimento = pitStop * tamanhoPista;
		
		System.out.println("Numero de litros minimo ate o reabastecimento = " + reabastecimento);
	}
}
