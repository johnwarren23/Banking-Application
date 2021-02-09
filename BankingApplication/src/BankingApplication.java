import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount("John", "4022");
		bank.showMenu();

	}

}


class BankAccount
{
	private double balance;
	private double previousTransaction;
	private String customerName;
	private String customerID;
	
	BankAccount(String cName, String cID)
	{
		customerName = cName;
		customerID = cID;
	}
	
	void checkBalance()
	{
		System.out.println("Balance: " + balance); //checks the current balance	
	}
	
	void deposit(double amount)
	{
	
			balance = balance + amount; //adds the amount you entered to your balance
			previousTransaction = amount; //stores the amount entered
		
		
	}
	
	void withdraw(double amount)
	{
	
			balance = balance - (amount); //subtracts the amount you entered from you balance
			previousTransaction = amount; //stores the amount entered
		
	}
	
	void getPreviousTransaction()
	{
		System.out.println("Withdrawn: " +  (previousTransaction)); //Math.abs turns the negative into a positive
	}
	

	
	
	void showMenu()
	{
		char option = 0; //must have a starting value
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is " + customerID);
		System.out.println("\n");
		System.out.println("A: Check Balance");
		System.out.println("B: Deposit");
		System.out.println("C: Withdraw");
		System.out.println("D: Previous Transaction");
		System.out.println("E: Exit");
		
		do {
			System.out.println("=================================");
			System.out.println("Enter an option");
		    option = keyboard.next().charAt(0);
			System.out.println("\n");
			
			
			switch(option)
			{
			case 'A':
				System.out.println("------------------------------");
				checkBalance();
				System.out.println("------------------------------");
				System.out.println("\n");
				break;
				
			case 'B': 
				System.out.println("------------------------------");
				System.out.println("Enter an amount to deposit: ");
				double amount = keyboard.nextDouble();
				deposit(amount);
				System.out.println("\n");
				break;
				
				
			case 'C':
				System.out.println("Enter an amount to withdraw");
				double amount2 = keyboard.nextDouble();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("------------------------------");
				getPreviousTransaction();
				System.out.println("------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("Thank you for your time.");
				break;
				
				default:
					System.out.println("Invalid Option! Please try again.");
			}
				
				
			}while(option != 'E');
		}
}

			
		
		
	


	
	
