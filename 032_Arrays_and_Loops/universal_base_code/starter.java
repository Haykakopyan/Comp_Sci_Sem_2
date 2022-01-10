import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[]a;
		int count;
		a = new int[1000];
		count = 0;
		while (count < a.length)
			{
				Random rand = new Random();
				a[count] = rand.nextInt(1000);
				System.out.println(a[count]);
				count++;
			}	
		
	

		
	}
}
