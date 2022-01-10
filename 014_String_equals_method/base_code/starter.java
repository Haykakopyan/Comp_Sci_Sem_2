import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Wizard, Warrior, or a Rouge");
		String w = sc.nextLine(); 
		String a = new String("Wizard");
		String b = new String("Warrior");
		String c = new String("Rouge");
		boolean wi;
		wi =(w.equals (a));
		boolean wa;
		wa =(w.equals (b));
		boolean ro;
		ro =(w.equals (c));
		if(wi){
			System.out.println("Youre a Wizard");
		}
		else if(wa){
			System.out.println("Youre a Warrior");
		}
		else if(ro){
			System.out.println("Youre a Rouge");
		}
		else{
			System.out.print("Choose one of the three");
		}
	}
}
