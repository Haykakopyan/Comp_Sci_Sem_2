import pkg.*;
import java.util.Scanner;
import java.util.Random;
	
class starter {
	public static void main(String args[]) {
		Ascii a = new Ascii();
		a.printArt();
		a.setType("Human");
		a.setName("Jonh");
		a.setNumber(1);
		a.setAscii("");
		a.printArt();
		
		System.out.println(" ");
		Ascii b = new Ascii("dog");
		b.printArt();
		
		System.out.println(" ");
		Ascii c = new Ascii("cactus", "Josef");
		c.printArt();
		
		System.out.println(" ");
		Ascii d = new Ascii("other", "jon", 1);
		d.setAscii(";/");
		d.pritnArt();
		
		System.out.println(" ");
		Ascii e = new Ascii("new", "Larry");
		e.printArt();
		
		
				
		
		
		
		


		
	}
}
