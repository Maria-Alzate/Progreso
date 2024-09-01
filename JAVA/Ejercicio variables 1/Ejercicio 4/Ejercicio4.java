import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);

        int numero_1 = 0;
        int numero_2 = 0;

        
        System.out.print("Ingrese el primer número ");
		numero_1 = teclado.nextInt();

        System.out.println("");

        System.out.print("Ingrese el segundo número ");
		numero_2 = teclado.nextInt();

        System.out.println("");


        System.out.println("El intercambio sería el siguiente: ");

         System.out.println(numero_2);
         System.out.print(numero_1);



    }
}