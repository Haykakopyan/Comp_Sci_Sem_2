import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String a = sc.nextLine();
		System.out.println("how many times do you want it repeated:");
		int b = sc.nextInt();
		int c = 1;
		//int smorg = sc.nextLine();
		while(true)
		{
			System.out.println(a);
			if (c == b){
				break;
			}
			c = c + 1;
			
			
		}



		
	}
}
