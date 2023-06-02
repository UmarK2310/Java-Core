
public class displaytxt {
   
	public static void main(String[] args) {
        String str = "....";
             
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }     
        //for(int i=0;i<str.length();i++)
        	//System.out.print(ch[i]);
    	int x=0;
    	//int length= 7;
    	//while (ch[x] != ch[7])
    		while (x != ch.length)
    	{ System.out.print(ch[x]);
    	  for (long i=0; i<200000000; i++); 
    	  x++ ;
    	  
    	}  
	}

}
