package elevenPointTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
	public static int quotient( int num, int denominator) throws ArithmeticException {
		return num / denominator;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean con = true;
		
		do {
			try {
				System.out.println("Pls enter an integer numerator");
				int numerator = scanner.nextInt()	;
				System.out.println("Pls enter an integer denominator");
				int denominator = scanner.nextInt()	;
				
				int result = quotient(numerator, denominator);
				System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result	);
				con = false;
			} catch (InputMismatchException e) {
				System.err.printf("\nException: %s\n", e);
				scanner.nextLine()	;
				System.out.println("must enter integers.Please try again\n");
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.err.printf("\nException: %s\n", e);
				System.err.println("Zero is an invalid denominator.Pls try again. \n");
			}
		} while (con);
	}

}
