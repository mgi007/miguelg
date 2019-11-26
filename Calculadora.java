package tk.goya.introduccion;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce una opcion del 1 al 5:");
		System.out.println("1-SUMA");
		System.out.println("2-RESTA");
		System.out.println("3-MULTIPLICACION");
		System.out.println("4-DIVISION");
		System.out.println("5-SALIR");
		System.out.println("Introduce una opcion del 1 al 5");
		// int opcion = scan.nextInt();
	

		boolean opcionCorrecta = true;
		
		int opcion ; 
			
		do {
			opcion = scan.nextInt();
			
			if(opcion < 1 || opcion > 5)
		
			System.out.println("Error");
			while (opcion < 1 || opcion > 5) {
				 opcion = scan.nextInt();
				
			}
			opcionCorrecta=(opcion ==5);
				if (!opcionCorrecta) {

					//Scanner scan = new Scanner(System.in);
					float num1;
					float num2;
					float operacion;
					switch (opcion) {
					case '1':
						System.out.println("Elegiste la opcion suma");
						System.out.println("Introduce primer numero: ");
						num1 = scan.nextInt();
						System.out.println("Introduce el sugunso numero: ");
						num2 = scan.nextInt();
						operacion = num1 + num2;
						System.out.println("El resultado de " + num1 + " + " + num2 + " = " + operacion);
						break;
					case '2':
						System.out.println("Elegiste la opcion resta");
						System.out.println("Introduce primer numero: ");
						num1 = scan.nextInt();
						System.out.println("Introduce el sugunso numero: ");
						num2 = scan.nextInt();
						operacion = num1 - num2;
						System.out.println("El resultado de " + num1 + " + " + num2 + " = " + operacion);
						break;
					case '3':
						System.out.println("Elegiste la opcion multiplicacion");
						System.out.println("Introduce primer numero: ");
						num1 = scan.nextInt();
						System.out.println("Introduce el sugunso numero: ");
						num2 = scan.nextInt();
						operacion = num1 * num2;
						System.out.println("El resultado de " + num1 + " + " + num2 + " = " + operacion);
						break;
					case '4':
						System.out.println("Elegiste la opcion division");
						System.out.println("Introduce primer numero: ");
						num1 = scan.nextFloat();
						System.out.println("Introduce el sugunso numero: ");
						num2 = scan.nextFloat();
						operacion = num1 / num2;
						System.out.println("El resultado de " + num1 + " + " + num2 + " = " + operacion);
					case '5':
						System.out.println("Elegiste la opcion salir del programa");
						opcionCorrecta = true;
						break;

					}
				}

			} while (!opcionCorrecta);
			System.out.println("Se acabo el programa");
		
		}
	}
// este codigo ha sido modificado para realizar la practica de entornos
