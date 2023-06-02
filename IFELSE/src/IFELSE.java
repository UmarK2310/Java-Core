import java.util.Scanner;

public class IFELSE {

	static int findMileage(int cc){
		int m=0;
		if(cc>=100 && cc<=125)
			m=75;
		else if(cc>=126 && cc<=135)
			m=70;
		else if(cc>=136 && cc<=150)
			m=60;
		else if(cc>=151 && cc<=200)
			m=50;
		else if((cc>=201 && cc<=220))
			m=35;
		else
			System.out.println("Wrong Input");
	
		return m;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the cc of the bike");
		int cc=s.nextInt();
		System.out.println("The mileage of the bike is::"+IFELSE.findMileage(cc));
}
}

