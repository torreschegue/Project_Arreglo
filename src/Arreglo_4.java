import java.util.Scanner;

public class Arreglo_4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] datos;
		int cantidad;
		
		System.out.println("Cantidad de numero a ingresar:");
		cantidad = teclado.nextInt();
		
		datos = new int[cantidad];
		
		// Llenando el Arreglo
		for(int indice = 0; indice<datos.length; indice ++) {
			System.out.println("Ingresa tu valor: " + (indice));
			datos[indice]=teclado.nextInt();
		}

		// Imprimir el Arreglo
		for (int indice = 0; indice < datos.length; indice++) {
			System.out.println("["+ indice +"] : " + datos[indice]);
		}
			
		
	}

}
