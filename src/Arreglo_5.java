import java.util.Scanner;

public class Arreglo_5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] nombres;
		int[] edades;
		String [] telefono;
		
		nombres = new String[2];
		edades = new int [2];
		telefono = new String[2];
		
		
		//Capturamos Nombre y Edad en un solo ciclo
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese Nombre [" + i + "]:");
			nombres[i]=teclado.next();
			System.out.println("Ingrese Edad [" + i + "]:");
			edades[i]=teclado.nextInt();
			System.out.println("Ingrese Telefono [" + i + "]:");
			telefono[i]=teclado.next();
		}
		
		// imprimir
		System.out.println();
		System.out.println("Informacion de los Arreglos : "); // Horizontal
		for(int i = 0; i < nombres.length; i++ ) {
			System.out.println("Nombre ["+ i +"] : " + nombres[i]);
			System.out.println("Edad ["+ i +"] : " + edades[i]);
			System.out.println("Telefono ["+ i +"] : " + telefono[i]);
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Informacion de los Arreglos: "); // Lineal
		for(int i = 0; i < nombres.length; i++ ) {
			System.out.println("Persona ["+ i +"] : " + nombres[i] + ", Edad ["+ i +"] : " + edades[i] + ", Telefono ["+ i +"] : " + telefono[i]);
			System.out.println();
		}
		
	}

}
