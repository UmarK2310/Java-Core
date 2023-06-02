import java.util.Scanner;

public class testingif {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int i = scan.nextInt();
         
        double d=scan.nextDouble();
        
        s=scan.nextLine(); 
        int ij = scan.nextInt();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}