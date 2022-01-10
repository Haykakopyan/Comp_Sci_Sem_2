import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("Gamble away your savings you have $100 to spend,");
	System.out.println("if you get 2 same numbers you double your wager");
	System.out.println("if you get 3 same numbers you get triple your wager");
	System.out.println("however if you get no matching numbers you lose your wager");
	System.out.println("Do you Want to play if so press y:");
	String x = sc.nextLine();
	String yes = new String ("y");
	boolean a;
	a =(x.equals (yes));
	if(a){
		System.out.println("Choose your wager:");
		int w = sc.nextInt();
		if(w <= 100){
			int rand_a = rand.nextInt(10);
			int rand_b = rand.nextInt(10);
			int rand_c = rand.nextInt(10);
			int re = rand_a = rand_b;
			boolean b;
			b =(rand_b == rand_c);
			boolean c;
			c =(rand_b == rand_a);
			boolean d;
			d =(rand_a == rand_c);
			boolean e;
			e =(rand_a == rand_b);
			boolean f;
			f =(rand_c == re);
			
		System.out.println(rand_a+"|"+rand_b+"|"+rand_c);
			if(b){
			System.out.println("you now have "+ w * 2 +" you win");
		}
		else if(c){
			System.out.println("you now have "+ w * 2 +" you win");
		}
		else if(d){
			System.out.println("you now have "+ w * 2 +" you win");
		}
		else if(e){
			System.out.println("you now have "+ w * 2 +" you win");
		}
		else if(f){
			System.out.println("you now have "+ w * 3 +" you win");
		}
		else{
			System.out.println("please try again");
		}
		}
		}
		
	}
}
