import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);

        int Grados_celsius = 0;
        int Grados_Fahrenheit = 0;

        System.out.print("Ingrese temperatura en grados Celsius: ");
		Grados_celsius = teclado.nextInt();

		System.out.println("");

        Grados_Fahrenheit = (Grados_celsius * 9/5) + 32;

        System.out.println("La temperatura en grados Fahrenheit es: "+Grados_Fahrenheit);




    }
}