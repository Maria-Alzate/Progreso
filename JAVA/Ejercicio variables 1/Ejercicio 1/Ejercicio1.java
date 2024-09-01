import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Variable para leer el teclado		
		Scanner teclado = new Scanner(System.in);

		int numero_1 = 0;
		int numero_2 = 0;
		int resultado = 0;
	
    	System.out.print("Ingrese numero 1: ");
		numero_1 = teclado.nextInt();

		System.out.println("");

		System.out.print("Ingrese numero 2: ");
		numero_2 = teclado.nextInt();

		System.out.println("");

		resultado = numero_1 + numero_2;
		System.out.println("Esta es la suma de los dos números: "+resultado);

    }
}