import java.util.ArrayList;
import java.util.LinkedList;

public class timecalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();  
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
                for (int i=0; i<100000; i++){  
        	 list.add("Ravi");
        	 list.add("jayanth");
        	 list.remove(0);
        	 
        }  
        System.out.println("Time taken by ArrayList: " +
        (System.currentTimeMillis() - startTime) + "ms");  
        //------------------------------------------------------------
          startTime = System.currentTimeMillis();  
        LinkedList<String> ll=new LinkedList<String>();  
           for (int i=0; i<100000; i++){  
        	   ll.add("Ravi");
          	 ll.add("jayanth");
          	 ll.remove(0);
        }  
        System.out.println("Time taken by LinkedList: " + 
        (System.currentTimeMillis() - startTime) + "ms");
	}

}
