import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
public class watch {
	public static void main(String[] args) {

	Seconds s=new Seconds();
	Minutes m=new Minutes();
	
	//seconds
	s.start();
	try{
		
		
		s.join();
	}
	catch(Exception e){
		System.out.println("Sorry for the inconvience");
	}
	//minutes
	try{
	m.start();
	
	}
	catch(Exception e){
		System.out.println("Sorry for the incon");
	}
	
	
	//Seconds
	Seconds s1=new Seconds();
	s1.start();
	try{
		
		s1.join();
	}
	catch(Exception e){
		System.out.println("Sorry for the inconvience");
	}
		

	}
}

class Seconds extends Thread{
	public void run(){
		for(int i=1;i<=60;i++){
			
			System.out.println("Seconds :" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Minutes extends Thread{
public void run(){
		for(int i=1;i<=60;i++){
			System.out.println("Minutes :"+i);
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}