package session1;

/*
 *Write a program that swaps the values of two variables without using third variable
 */
public class Assignment3 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		// Code to swap 'x' and 'y'
		x = x + y; // x now becomes 15
		y = x - y; // y becomes 10
		x = x - y; // x becomes 5
		System.out.println("After Swapping: x =" + x + ", y=" + y);
	}

}

/*
 * OUTPUT
 * ******
 * After Swapping: x =5, y=10
 */
