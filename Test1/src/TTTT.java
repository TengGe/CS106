import java.util.*;
public class TTTT {

	public static void main(String[] args) {
		Scanner console=new Scanner (System.in);
        int age =getInt(console, "How old are you?");
	}
public static int getInt(Scanner console, String prompt){
	System.out.println(prompt);
	while (!console.hasNextInt()){
		console.next();
		System.out.println("Not an integer;try again.");
		System.out.println(prompt);
	}
	return console.nextInt();
}
}
