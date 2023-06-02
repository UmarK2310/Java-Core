public class Oops {
	public static void main(String args[]) {
		
	B b=new B(10,10,10);
	}
}

class A {
	A() {
		System.out.println("Def const A");
	}

	A(int x) {
		this(10,50);
		System.out.println(x);
	}
	A(int x,int y) {
		this();
		System.out.println(x+y);
	}
}

class B extends A{
	B(){
		super(10);
		System.out.println("Def cons of B Class");
	}
	B(int a,int b,int c){
		
		this();
		
		System.out.println(a+b+c);
	}
}
