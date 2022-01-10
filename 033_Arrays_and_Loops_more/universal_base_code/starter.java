import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Random rand = new Random();
		int[] a = new int [10];
		int num = 1000;
		int b = 0;
		while(b< a.length)
			{
			a[b] = rand.nextInt(100);
			System.out.println(a[b] + " ");
			b++;
			}	
			b = 0;
			System.out.println();
			while(b<a.length){
				if(a[b] < num){
					num = a[b];
				}
				b++;
			}
			int v = 0;
			int max = a[0];
			System.out.println();
			while(v<a.length){
				if(a[v] > max){
					max = a[v];
				}
				v++;
			}
			double total = 0;
			for(int i=0; i < a.length; i++){
				total = total + a[i];
			}
			double average = total / a.length;
			
			System.out.println("The maximum of the random numbers is " + max);
			System.out.println("The minimum of the random numbers is " + num);
			System.out.println("the average of the random numbers is " + average);


		
	}
}
