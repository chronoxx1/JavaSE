package semana4.com.ejemplos;

import java.util.Scanner;

public class Mundo {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Ingrese..");
		
		double a = read.nextDouble();
		double b = read.nextDouble();
		double c = read.nextDouble();
		
		double x1 = ((-b) + Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
		double x2 = ((-b) - Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
		
		System.out.println(x1);
		System.out.println(x2);
	}

}
