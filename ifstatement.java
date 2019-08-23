/*
	Ifstatement:
	1. Basic if statements and else-if chains
*/

public class ifstatement{

	public static void main(String[] args) {
		
		int a, b, c, d;
		a = 0; b = 1; c = 2; d = 3;

		if( a >= b ){
			System.out.println("a is greater than or equal to b.");
		}
		else{
			System.out.println("a is less than b.");
		}

		if( d < a ){
			System.out.println("d is less than a.");
		}
		else if( c > a && b > a){
			System.out.println("a is less than b and c.");
		}
		else{
			System.out.println("ELSE");
		}

	}// END MAIN
}// END PROGRAM
