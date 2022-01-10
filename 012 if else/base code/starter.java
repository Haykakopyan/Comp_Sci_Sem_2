import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Input a number between 1 - 100");
	int a = sc.nextInt();
	int rand_c = 1 + 101*rand.nextInt();
	boolean fly;
	fly =( a == rand_c);
	boolean no;
	no =(a > 100);
	boolean ye;
	ye =(a < 1);
	if(fly){
		System.out.println("congrats you win");
	}
	else
	{
		System.out.print("try again ");
	}
	if(no){
		System.out.println("you dumbass listen to the instrusctions");
	}
	if(ye){
		System.out.println("Maybe listen to the instructions");
	}
	}
}
