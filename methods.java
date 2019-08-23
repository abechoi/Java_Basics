/*
	METHODS:
	1. Input 2 integers
	2. Use mult method to multiply

*/
import java.util.Scanner;

public class methods{

	public static void main(String[] args){

		int x, y, z;
		x = 0; y = 0; z = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integers: ");

		x = sc.nextInt();
		y = sc.nextInt();
		z = mult( x, y);
		
		System.out.printf("product = %d\n", z);

	}// END MAIN

	// MULT METHOD
	static int mult( int x, int y){

		return x * y;
	}
}// END CLASS