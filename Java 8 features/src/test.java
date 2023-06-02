public class test {

	public static void main(String[] args) {
	Parent p= new Parent();
	Parent.Child c = p.new Child();    
	p.parentCar();
	c.childBike();
	
	}

}
class Parent{
	public void parentCar(){
		System.out.println("Maruti Car");
		class Parent2{
			public void parent2Car(){
				System.out.println("BMW car");
			}
		}
		Parent2 pp=new Parent2();
		pp.parent2Car();
	}
	
	class Child{
		public void childBike(){
			System.out.println("R15 bike");
			class Child2{
				public void child2Bike(){
					System.out.println("RE bike");
				}
			}
			Child2 cc=new Child2();
			cc.child2Bike();
		}
	}
	
	
}