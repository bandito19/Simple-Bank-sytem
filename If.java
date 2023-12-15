package hello;
import java.util.Scanner;
public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = inp.nextInt();
		if (num > 0) {
			System.out.println("The number is posetive.");
		}
		else if  (num < 0) {
			System.out.println("The number is negative.");
		}
		else {
			System.out.println("The number is Zero.");
		}
	}

}
