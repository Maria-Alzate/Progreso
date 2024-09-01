import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);

        int base = 0;
        int altura = 0;
        int area = 0;

        
        System.out.print("Ingrese la base del triángulo ");
		base = teclado.nextInt();

        System.out.println("");

        System.out.print("Ingrese la altura del triángulo ");
		altura = teclado.nextInt();

        System.out.println("");

        area = (base * altura) / 2;

        System.out.println("El área del triángulo es: "+ area);




    }
}