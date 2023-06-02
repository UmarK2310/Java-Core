import java.util.Scanner;

public class BankAccount{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankDetails Umar = new BankDetails();
		Umar.getAccountName();
		Umar.getAccountNumber();
		Umar.Deposit(500);
		Umar.Deposit(1500);
		
		Umar.getBalance();
		
		Umar.withdraw(500);
		
		Umar.getBalance();
		Umar.interest(10);
		Umar.addInterest();
		Umar.getBalance();
		
	}

}
class BankDetails {
	String accountName;
	int accountnumber=0;
	double balance=0;
	double interestamount = 0;
	Scanner s =new Scanner(System.in);
	void getAccountName(){
		System.out.println("Enter Your Account Name: ");
		accountName=s.nextLine();
	}
	void getAccountNumber(){
		System.out.println("Enter your Account Number :");
		accountnumber=s.nextInt();
	}
	void getBalance(){
		System.out.println("You current balance is :"+balance);
	}
	void Deposit(double amount){
		balance=balance + amount;
	}
	void withdraw(double amount){
		balance=balance-amount;
		
	}
	void interest(int a){
		interestamount = (balance/100)*a ;
		System.out.println("Interest (10%) = "+interestamount);
	}
	void addInterest(){
		balance = balance + interestamount;
		System.out.println("Interest Added");
	}
}

