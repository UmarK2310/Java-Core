package accessSpecifier;

public class Second extends Third{
public static void main(String args[]){
	Third t=new Third();
	t.test2();
}
}
class Third{
void test2(){
		System.out.println("Thie is test2 method");
		gPay gp=new gPay();
		gp.test();
}
}
