import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int rand_n = rand.nextInt(10);
	int rand_d = 1+ rand.nextInt(100);
	double rand_c = 2.5+rand.nextDouble();
	double rand_b = 14 +rand.nextDouble() + rand.nextInt(575);
	double rand_f = 20 + rand.nextDouble() + rand.nextInt(35);
	System.out.println(rand_n);
	System.out.println(rand_d);
	System.out.println(rand_c);
	System.out.println(rand_b);
	System.out.println(rand_f);
	}
}
