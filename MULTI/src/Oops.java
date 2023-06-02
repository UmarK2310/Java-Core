import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Oops {
	public static void main(String[] args) {

		NumericThread n = new NumericThread();
		AlphaThread a = new AlphaThread();

		// Needs to start the thread
		n.start();
		n.setPriority(10);
		a.start();
		if (n.isAlive()) {
			System.out.println("Numeric Thread is Alive");
		} else {
			System.out.println("Numeric thread is dead");
		

		if (a.isAlive()) {
			System.out.println("Alpha Thread is Alive");
		} else {
			System.out.println("Alpha thread is dead");
		}

		// Getting to know the thread name
		System.out.println(n.getName());
		System.out.println(a.getName());

		// Getting to know thread states
		System.out.println(n.getState());
		System.out.println(a.getState());

		// Setting the name to the thread
		n.setName("Numeric Thread");
		a.setName("Alpha Thread");

		// finding the current thread
		System.out.println(Thread.currentThread().getName());

		// Getting to know thread states
		System.out.println(n.getState());
		System.out.println(a.getState());

		// Finding the priority of the each thread

		System.out.println(n.getPriority());
		System.out.println(a.getPriority());

		// finding the thread is Alive or not

		if (n.isAlive()) {
			System.out.println("Numeric Thread is Alive");
		} else {
			System.out.println("Numeric thread is dead");
		}

		if (a.isAlive()) {
			System.out.println("Alpha Thread is Alive");
		} else {
			System.out.println("Alpha thread is dead");
		}

	}
}
}

class NumericThread extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}
}

class AlphaThread extends Thread {

	public void run() {
		for (char c = 'A'; c <= 'Z'; ++c) {
			System.out.println(c);
		}
	}
}
