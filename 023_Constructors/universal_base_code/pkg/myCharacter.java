package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int b;

	public myCharacter() {
		role = "no role";
		
	}
	public myCharacter(String a) {
		b = 5;
		role = a;
			if(a.equals("wizard")){
		System.out.println("wizard");
System.out.println("Strength: "+ b);
System.out.println("Dexterity: "+ b);
System.out.println("Vitality: "+ b);
System.out.println("Charisma: "+ b);
	}
else if(a.equals("warrior")){
		System.out.println("warrior");
System.out.println("Strength: "+ b);
System.out.println("Dexterity: "+ b);
System.out.println("Vitality: "+ b);
System.out.println("Charisma: "+ b);
}
else if(a.equals("Rogue")){
		System.out.println("Rogue");
System.out.println("Strength: "+ b);
System.out.println("Dexterity: "+ b);
System.out.println("Vitality: "+ b);
System.out.println("Charisma: "+ b);
}
else {
	System.out.println("Choose one of the 3");
}
		
	}

}

