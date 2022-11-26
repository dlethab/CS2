
import java.util.*;
public class ATM extends Account{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//object array
		Account[] accountArray = new Account[10];
		
		//create 10 accounts
		for(int i = 0; i <= 9; i++) {
			accountArray[i] = new Account(i, 100);
		}
		
		int id = 2;
		boolean atm = true;
		
		while(atm) {
			System.out.print("Enter ID: ");
			id = input.nextInt();
			
			//check if id is valid and in range
			while(id > 9 | id < 0) {
				System.out.print("Please enter a valid id: ");
				id = input.nextInt();
			}
			
			//bank functions menu
			int userVal;
			double amount; //used for withdraw and deposit
			
			do {
				System.out.println("Main menu");
				System.out.println("1. check balance");
				System.out.println("2. withdraw");
				System.out.println("3. deposit");
				System.out.println("4. exit");
				System.out.print("Enter a choice: ");
				userVal = input.nextInt();
				
				//checks valid input
				while(userVal > 4 | userVal < 1) {
					System.out.print("Please enter a valid choice: ");
					userVal = input.nextInt();
				}
				
				if(userVal == 1) {
					//balance
					System.out.println("Current balance: " + accountArray[id].getBalance());
				} else if (userVal == 2) {
					//withdraw
					System.out.print("Enter an amount to withdraw: ");
					amount = input.nextDouble();
					accountArray[id].withdraw(amount);
					
				} else if (userVal == 3) {
					//deposit
					System.out.print("Enter an amount to deposit: ");
					amount = input.nextDouble();
					accountArray[id].deposit(amount);
					
				}
				
			} while (userVal != 4);
			
		}
		
	}
}