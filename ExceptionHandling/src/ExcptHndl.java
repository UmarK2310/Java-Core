
public class ExcptHndl {

	public static void main(String[] args) {
		

	}

}
class VotingSystem{
	public void valid(int age){
		if(age>18){
			System.out.println("You are eligible to vote.");
		}
		else{
			throw new ArithmeticException("You are not elgible to vote");
			
			
		}
	}
}
