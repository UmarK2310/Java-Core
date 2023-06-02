import java.util.Scanner;

public class groupq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int salary,travel,food,saving,shifts,extra;
		char c=0;
		System.out.println("Welcome to Salary Calculation Portal");
		do{
				System.out.println("Please Enter your salary:");
		salary=s.nextInt();
		
		if(salary>8000){
			System.out.println("Salary too large");
		}
		else 
		{	System.out.println("Please Enter your shifts:");
			shifts=s.nextInt();
		    if(shifts==0)	
			System.out.println("Shift too small");
		    
		    else if(salary<0)
			System.out.println("Salary too small");
		    else
		   {	food=(salary/100)*20;
			travel=(salary/100)*30;
			extra=(salary/100)*2;
			saving=salary+(extra*shifts)  - (food+travel);
			System.out.println("Your savings are:"+saving);	}		    	
		    System.out.println("Do you want to calculate more??(Y/N)=");
		    c=s.next().charAt(0);
		}
		}while(c=='Y');
		

}
}
//System.exit(0);	
