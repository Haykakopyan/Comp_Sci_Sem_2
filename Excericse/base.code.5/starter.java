import java.util.Scanner;
class cat{
	String name;
	
	public cat(){
		name = new String("Garfeild"); 
		
		
		
	}
	public cat(String a){
		name = a;
	}
	
	
	
	public void meow(){
		System.out.println("The cat's name is " +name+ " and he meows");
		return;
	}
	
}

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
		cat tom = new cat();
		tom.meow();
		cat one = new cat("Jerry");
		one.meow();
		}
}


