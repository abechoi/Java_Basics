/*
	LOOPS:
	1. while, do-while, and for loops
	2. Added foreach loop
*/

public class loops{

	public static void main(String[] args){

		int x = 0;
		int[] arr = new int[10];

		// WHILELOOP1
		System.out.println( "\nWHILELOOP1" );
		while( x < 10 ){

			System.out.printf( "x = %d\n", x );
			++x;
		}

		// DOWHILELOOP1
		x = 0;
		System.out.println( "\nDOWHILELOOP1" );
		do{

			System.out.printf( "x = %d\n", x );
			++x;

		}while( x < 10);

		// FORLOOP1
		System.out.println( "\nFORLOOP1" );
		for( int i = 0; i < 10; ++i ){

			System.out.printf( "i = %d\n", i );

			arr[i] = i; // fill array for the foreach loop
		}

		// FOREACHLOOP1
		System.out.println( "\nFOREACHLOOP1" );
		for( int i : arr ){

			System.out.printf( "i = %d\n", i );
		}

	}// END MAIN
}// END CLASS








