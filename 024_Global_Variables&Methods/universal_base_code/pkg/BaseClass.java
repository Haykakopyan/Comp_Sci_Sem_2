package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass() {
		role = "no role"
		
	}
	public BaseClass(String a){
		role = a;
			if(a.equals("wizard")){
		System.out.println("wizard");
System.out.println("Strength: 5");
System.out.println("Dexterity: 2");
System.out.println("Vitality: 1");
System.out.println("Charisma: 6");
	}
else if(a.equals("warrior")){
		System.out.println("warrior");
System.out.println("Strength: 7");
System.out.println("Dexterity: 3");
System.out.println("Vitality: 2");
System.out.println("Charisma: 1");
}
else if(a.equals("Rogue")){
		System.out.println("Rogue");
System.out.println("Strength: 6");
System.out.println("Dexterity: 8");
System.out.println("Vitality: 9");
System.out.println("Charisma: 6");
}
else {
	System.out.println("Choose one of the 3");
}
	}

}

