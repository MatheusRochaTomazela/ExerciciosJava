package util;

public class Calculator {

	public static final double PI = 3.14159;
	
	public static double circunferencia(double raio) {
		return PI * (raio*2);
	}
	public static double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3) /3;
	}
}
