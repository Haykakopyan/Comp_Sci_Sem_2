import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Give us an input");
		int a = sc.nextInt();
		System.out.println("Another input");
		int b = sc.nextInt();
		int c = a * b;
		boolean q;
		q =(c%3 == 0);
		if(q){
			System.out.println("it is divisble by 3");
		}
		else{
			return("It is not divisble by 3");
		}
		}
}


