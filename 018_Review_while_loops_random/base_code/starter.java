import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int rand_b = rand.nextInt(1000);
		while(true){
			System.out.println("Guess a int:");
		int a = sc.nextInt();
		if(a > rand_b){
			System.out.println("too high");
		}
		if(a < rand_b){
			System.out.println("too low");
		}
		if(a == rand_b){
			System.out.println("good job");
			break;
		}
		}

		
	}
}
