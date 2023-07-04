package principal;

import java.util.Scanner;

import clases.CuentaBancaria;

public class Ej1_1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		System.out.println("Programa de gestión de cuenta bancaria.");
		
		System.out.println("Introduce el DNI:");
		cuenta1.setDni(sc.nextLong());
		
		System.out.println("Saldo inicial:");
		cuenta1.ingresar(sc.nextDouble());
		
		System.out.println("Interés:");
		cuenta1.setInteres(sc.nextDouble());
		
		System.out.println("La cuenta 1 es:" + cuenta1);

		
		System.out.println("Creando la cuenta 2:.");
		CuentaBancaria cuenta2 = new CuentaBancaria(45000000, 250, 0.07);
		
		System.out.println("La cuenta 2 es:" + cuenta2);
		
		int opcion = 0;
		do
		{
			System.out.println("1. Actualizar saldo.");
			System.out.println("2. Ingresar.");
			System.out.println("3. Retirar dinero.");
			System.out.println("0. Salir.");
			System.out.println("Introduce una opción:");
			opcion = sc.nextInt();
					
			switch (opcion)
			{
				case 1:
					System.out.printf("El saldo antes de la actualización es de %.2f\n",
						cuenta1.getSaldo());
					System.out.printf("Actualizando saldo a interés %.2f...\n", cuenta1.getInteres());
					cuenta1.actualizarSaldo();
					System.out.printf("El saldo despues de la actualización es de %.2f", cuenta1.getSaldo());
					break;
				case 2:
					System.out.printf("Cantidad a ingresar: ");
					double cantidad = sc.nextDouble();
						if (cuenta1.ingresar(cantidad))
							System.out.printf("Ingreso realizado. Saldo actual: %.2f\n", cuenta1.getSaldo());
						else
							System.out.println("No se ha podido ingresar el dinero.");
					break;
				case 3:
					System.out.printf("Cantidad a retirar: ");
					cantidad = sc.nextDouble();
						if (cuenta1.retirar(cantidad))
							System.out.printf("Recoja su dinero. Saldo actual: %.2f\n", cuenta1.getSaldo());
						else
							System.out.printf("Saldo insuficiente. Saldo actual: %.2f\n", cuenta1.getSaldo());
					break;
				case 0:
					System.out.printf("Que tenga un buen día.");
					break;
				default:
					System.out.printf("Opción incorrecta.");
			}
		} while (opcion != 0);
	}
}
