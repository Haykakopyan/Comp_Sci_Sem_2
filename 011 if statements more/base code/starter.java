import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("input a number:");
	int n= sc.nextInt();
	System.out.println("input another number:");
	int num = sc.nextInt();
	boolean j;
	j =(n == num);
	boolean k;
	k =(n != num);
	if (j){
		System.out.println("congrats on being a gyot");
	}
	if (k){
		System.out.println("congrats xzik");
	}
	}
}
