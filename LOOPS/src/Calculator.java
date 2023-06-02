
public class Calculator {
	public static void main(String[] args) {

Son s=new Son(150,50); //both a class object will be created ???
s.car();
		}

}
class Father {
	int sbi=10000;
	void car(){
		System.out.println("Father car");
	}
	Father(){
		System.out.println("Father's Def Constructors");
	}
	Father(int a){
		car();
		System.out.println("Father's Para Constructor : " +a);
	}
}

class Son  extends Father{
	int sbi=1000;
	void car(){
		System.out.println(sbi);
		System.out.println(super.sbi);
		super.car();
		System.out.println("Son's Car");
	}
	void cycle(){
	System.out.println("Son's Cycle");	
	}
	Son()
{
	
	System.out.println("Def construc of Son's class");
}

Son(int a,int b){
	
	super(25);
	
	
	
;	System.out.println("Son's class param constructor : " + (a+b));
}
}
