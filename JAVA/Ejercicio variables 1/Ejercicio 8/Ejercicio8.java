import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);

        String cadena_1;
        String cadena_2;
    

        System.out.print("Ingrese una oración: ");
		cadena_1 = teclado.nextLine();

        System.out.println("");

        System.out.print("Ingrese otra oración: ");
		cadena_2 = teclado.nextLine();
        
        System.out.println("");

        System.out.println("La oración quedaría así: "+ cadena_1 + " " + cadena_2 );

    }
} 