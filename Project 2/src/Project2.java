/**
 * 
 */

/**
 * @author ymei

 * 
 */
import java.util.*;

public class Project2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int typeOne = 0;
		int typeTwo = 0;

		Scanner console = new Scanner(System.in);
		questionOne(console, typeOne, typeTwo);
	}

	public static void questionOne(Scanner console, int typeOne, int typeTwo) {
		System.out.println("Do You like to play games? Yes or No");

		String one = console.nextLine();
		if (one.equals("Yes")) {
			typeOne+=10;
		} else {
			typeOne--;
		}
		questionTwo(console, typeOne, typeTwo);
	}

	public static void questionTwo(Scanner console,int typeOne, int typeTwo){
		System.out.println("Which sport you like? ");
		System.out.println("A:Basketball");	
		System.out.println("B:Football");
		System.out.println("C:Tennis");
		System.out.println("D.i dont like sport");
		String two=console.nextLine();
		if(two.equals("A")){
			typeOne--;
			typeTwo+=2;
		}
		else if(two.equals("B")){
			typeOne-=2;
			typeTwo+=2;
		}
		else if(two.equals("C")){
			typeOne++;
		}
		else {
			typeOne+=3;
		}
        
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void comparison(int typeOne, int typeTwo) {
     if(typeOne>typeTwo){
    	 System.out.println("You are genius");}
    	 else {
    		 System.out.println("You are not a genius");
    	 }
     }
	}


