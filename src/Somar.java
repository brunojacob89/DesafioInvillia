import java.util.Scanner;

public class Somar {

	public static void main(String[] args) {

		double numero1;
		double numero2;
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.print("Digite numero 1= ");
		numero1 = teclado.nextDouble();
		System.out.print("Digite numero 2= ");
		numero2 = teclado.nextDouble();
		
		double resultado = somarDoisNumeros(numero1, numero2);
	
		}
	
	public static double somarDoisNumeros (double numero1 , double numero2) {
		
		double resultado = numero1 + numero2;
		System.out.println("Valor do resultado = " + resultado);
		return resultado;
	}
	

}
