package es.studium.Concatena;

import java.util.Scanner;

public class Concatena
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner (System.in);
		String cadena1,cadena2,resultado;
		System.out.println("Dame una cadena ");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena ");
		cadena2 = teclado.nextLine();
		resultado = (cadena1+ " " +cadena2);
		System.out.println(resultado);

	}

}

//PROGRAMA Concatena
//VARIABLES
//CADENA cadena1,cadena2,resultado
// ESCRIBIR "dame una cadena"
//Leer cadena1
// ESCRIBIR " dame otra cadena"
// LEER cadena2
// resultado = cadena1 + " " + cadena2
// ESCRIBIR resultado
//FIN
