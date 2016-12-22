package session1;

/*
 * Write a program to print the sum of two numbers without using + operator. 
 * Other operators have to be used.
 */

public class Assignment1 {

	public static void main(String[] args) {
		int firstNumber = 7;
		int secondNumber = 8;
		int sum = add(firstNumber, secondNumber);
		System.out.println("Addition of two number is " + firstNumber + "+"
				+ secondNumber + "=" + sum);		
	}

	public static int add(int firstNumber, int secondNumber) {

		if (secondNumber == 0)
			return firstNumber;
		
		int sum = firstNumber ^ secondNumber; // SUM of two integer isfirstNumber XOR secondNumber
		int carry = (firstNumber & secondNumber) << 1; // CARRY of two integer is firstNumber AND secondNumber
		
		return add(sum, carry);
	}

}

/*
 * OUTPUT
 * ******
 * Addition of two number is 7+8=15
 */
		
