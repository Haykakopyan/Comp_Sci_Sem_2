import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("First Name:");
	String nme = sc.nextLine();
	System.out.println("Age:");
	int number = sc.nextInt();
	System.out.println("Birthday Month in numerical form:");
	int month = sc.nextInt();
	System.out.println("Birthday Day:");
	int day = sc.nextInt();
	System.out.println("Birthday Year:");
	int year = sc.nextInt();
	System.out.println("what is a buck fifty?:");
	double num = sc.nextDouble();
	System.out.println("Your name is " + nme + " you were born " + month+"/"+day+"/"+year);
	System.out.println("You are " + number + " years old");
	System.out.println("You have " + num + " in your wallet");
	
	
	
	
	}
}
