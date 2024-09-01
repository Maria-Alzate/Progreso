import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);

        float precio_normal  = 0;
        int descuento = 0;
        float precio_descuento = 0;
        
        

        System.out.print("Ingrese el precio normal del artículo: ");
		precio_normal = teclado.nextFloat();

        System.out.println("");

        System.out.print("Ingrese el porcentaje de descuento sin el %: ");
		descuento = teclado.nextInt();
        
        System.out.println("");

        precio_descuento = precio_normal - ((precio_normal * descuento) / 100);

        System.out.println("El precio con descuento es: "+ precio_descuento);

    }
} 