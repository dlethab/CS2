package part3Textbook;

import java.util.Scanner;
public class Fibonacci {
	//a recursive method is one which invokes itself
	private static int counter = 0;
	public static void main(String args[]) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter num: ");
		int num = input.nextInt();
		
		System.out.println("index: " + num + ", fibonacci number: " + fib(num));
		System.out.println("counter: " + counter);
		
	}
	
	
	public static long fib(int index) {
		counter++;
		if(index == 0)
			return 0;
		if(index == 1)
			return 1;
		else
			return fib(index -2) + fib(index -1); //adds the two previous numbers in the index
		// index 4, 	return fib(2)	 + 			fib(3)
		//			return fib(1) + fib(0)	+ 	fib(1) + fib(2)
		//												fib(0) + fib(1)
	}
	
	
	
}
