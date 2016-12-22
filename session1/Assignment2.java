package session1;

public class Assignment2 {

	public static void main(String[] args) {
		int a= 20;
		int b= 10;
		b= a-- - --a;
		System.out.println("b="+b);
		int c=a--;
		System.out.println("c="+c);
		int d=a>>2;
		System.out.println("d="+d);
		int e=a&b;
		System.out.println("e="+e);		
	}

}
/*
 * output
 * ******
 * b=2
 * c=18
 * d=4
 * e=0
 */