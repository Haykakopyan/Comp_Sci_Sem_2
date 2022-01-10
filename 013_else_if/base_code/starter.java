import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Input a number between 1 - 100");
	int a = sc.nextInt();
	int rand_c = 1+rand.nextInt(101);
	boolean fly;
	fly =( a == rand_c);
	boolean no;
	no =(a > rand_c);
	boolean ye;
	ye =(a < rand_c);
	if(fly){
		System.out.println("congrats you win");
	}
	if(no){
		System.out.println("try something smaller");
	}
	if(ye){
		System.out.println("try something bigger");
	}
	}
}
