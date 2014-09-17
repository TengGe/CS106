/**
 * 
 */

/**
 * @author ymei
 *
 */


import java.util.*;
public class WagePay {

	/**
	 * @param args
	 */
	//Declare constants
	public static final int WEEKS=4;
	public static final int MONTHS=12;
	
	//Main method
	public static void main(String[] args) {
	
	// User input:wages,hours,days
     Scanner console=new Scanner (System.in);
     System.out.println("Enter Your wages:");
	 double wages=console.nextDouble ();
	 System.out.println("Enter number of hours you works per day:");
	 double hours=console.nextDouble ();
     System.out.println("Enter number of days you works per week:");
     int days=console.nextInt();
     System.out.println("Income Tax rate (percent):");
     double tax=console.nextDouble();
     //print results
	 double dayPay= pay(wages,hours);
	 double weekPay= pay(wages,hours)*days;
	 double monthPay=weekPay*WEEKS;
	 double salary=monthPay*MONTHS-monthPay*MONTHS*(tax/100);
	 System.out.println("Your daily payment is "+"$"+dayPay);
	 System.out.println("Your weekly payment is "+"$"+weekPay);
	 System.out.println("Your monthly payment is "+"$"+monthPay);
	 System.out.println("Your salary is "+"$"+salary+" Per year");
	 
	 }
   
   // Calculate daily earn
   public static double pay(double hours,double wages){
        return hours*wages; 
   }

}
