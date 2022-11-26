package part3Textbook;

import java.util.*;
public class Palindromic {

	//checks word to be palindromic
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		String word = input.nextLine();
		
		while(!isPalindromic(word)) {
			System.out.println(isPalindromic(word));
			word = input.nextLine();
		}
		System.out.println(isPalindromic(word));

		
	}
	
	
	//first check: are the first and last characters are equal
	//next check: pass through the string with the first and last characters removed
	
	public static boolean isPalindromic(String word) {
		if(word.length() <=1) { //1 letter word is palindromic
			return true;
		} else if(word.charAt(0) != word.charAt(word.length()-1)) { //if the first letter is not equal to the last, return 
			return false;
		} else
			return isPalindromic(word.substring(1,word.length()-1)); //passes the word back through the function with the first and last letters removed
		
		
	}
}
