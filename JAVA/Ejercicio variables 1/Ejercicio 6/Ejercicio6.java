import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);

        float numero_1 = 0;
        float numero_2 = 0;
        float numero_3 = 0;
        float numero_4 = 0;
        float numero_5 = 0;
        float promedio = 0;
        
        System.out.println("Promedio de 5 notas");

        System.out.println("");

        System.out.print("Ingrese nota 1: ");
		numero_1 = teclado.nextFloat();

        System.out.println("");

        System.out.print("Ingrese nota 2: ");
		numero_2 = teclado.nextFloat();
        
        System.out.println("");

        System.out.print("Ingrese nota 3: ");
		numero_3 = teclado.nextFloat();
        
        System.out.println("");

        System.out.print("Ingrese nota 4: ");
		numero_4 = teclado.nextFloat();
        
        System.out.println("");

        System.out.print("Ingrese nota 5: ");
		numero_5 = teclado.nextFloat();
        
        System.out.println("");

        promedio = (numero_1 + numero_2 + numero_3 + numero_4 + numero_5) / 5;

        System.out.println("El promedio de las 5 notas es: "+ promedio);

    }
} 