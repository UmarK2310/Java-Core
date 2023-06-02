package accessSpecifier;

public class First {

	public static void main(String[] args) {
		gPay gp1=new gPay();
			gp1.test();
		}
	}
class gPay {
	public void test(){
		System.out.println("This is test methodin other class");
	}

}
