import java.util.Scanner;
import java.lang.Math;

public class Power {
public static void main(String [] args){
	
	Scanner s= new Scanner(System.in);
	System.out.println("ENter Your Number:");
	int n=s.nextInt();
	if(n<0)
		System.out.println("Number too small!!!");
	else if(n>32767)
		System.out.println("Number too large!!!");
	else if(n==1)
		System.out.println("No");
	else
	{
		while(n!=1)
		{
			if(n%2 != 0)
			{		System.out.println("No");
				System.exit(0);
			}
			n=n/2;			
		}
		System.out.println("Yes");
	/*double j=Math.sqrt(n);
	if(j==2)
		System.out.println("Yes");
	else
		System.out.println("No");
		*/
		
	}
}
}
