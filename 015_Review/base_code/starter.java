import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is yout name?");
		String n = sc.nextLine();
		System.out.println("What is your title? i.e Slayer of Dragons");
		String t = sc.nextLine();
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
			System.out.println("Choose one of the three");
		}
		System.out.println("you have 25 skill points to use on Strength, Dexterity, Intelligence, Constitution, and Charisma. use them wisely");
		System.out.println("Strength(1-10):");
		int s = sc.nextInt();
		if(s > 10){
			System.out.println("value was too large system machine broke rerun program");
		
		}
		else if(s < 1){
			System.out.println("value too small system machine broke rerun program");
	
			
		}
			else{
		int st = (25 - s);
		System.out.println("You have  "+ st +"  points to spend");
		System.out.println("Dexterity(1-10):");
		int d =  sc.nextInt();
		if(d > 10){
			System.out.println("value was too large system machine broke rerun program");
		}
		else if(d < 1){
				System.out.println("value was too small system machine broke rerun program");
		}
		else{
			st =st - d;
		System.out.println("You have "+ st + " points to spend");
		System.out.println("Intelligence(1-10):");
		int q = sc.nextInt();
		if(q > 10){
				System.out.println("value was too large system machine broke rerun program");
		}
		else if(q < 1){
			System.out.println("value was too large system machine broke rerun program");
		}
		else if(q > st){
			System.out.println("value was too large system machine broke rerun program");
		}
		else{
			st =st - q;
		System.out.println("You have "+ st +" points to spend");
		System.out.println("Constitution(1-10):");
		int qw = sc.nextInt();
		if( qw > st){
			System.out.println("value was too large system machine broke rerun program");
		}
		else if(qw > 10){
			System.out.println("value was too large system machine broke rerun program");
		}
		else if(qw < q){
				System.out.println("value was too small system machine broke rerun program");
		}
		else{
			st = st - qw;
		System.out.println("You have "+ st +" points to spend");
		System.out.println("Charisma(1-10):");
		int re = sc.nextInt();
		if(re > 10){
				System.out.println("value was too large system machine broke rerun program");
		}
		else if(re > st){
				System.out.println("value was too large system machine broke rerun program");
		}
		else if(re < 1){
				System.out.println("value was too small system machine broke rerun program");
		}
		else{
			st = st - re; 
			System.out.println("You have chosen your stats with "+ st +" points to spare");
				System.out.println("You are "+ n +" the "+ t);
		System.out.println("You are a "+ w);
		System.out.println("Your stats are");
		System.out.println("Strength(1-10): "+ s);
		System.out.println("Dexterity(1-10): "+ d);
		System.out.println("Intelligence(1-10): "+ q);
		System.out.println("Constitution(1-10): "+ qw);
		System.out.println("Charisma(1-10): "+ re);
		}
		}
		}
		}
		}
	
	
	
	}
}
