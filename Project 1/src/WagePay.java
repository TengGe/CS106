/**
 * 
 */

/**
 * @author ymei
 *
 */
public class WagePay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	 // Declare the variables and store the values.
	 double hours=2.5;
	 double wages=8.0;
	 int days=2;
	 int weeks=4;
	 int months=4;
	 
	 daypay(hours,wages,days,weeks,months);
	 weekpay(hours,wages,days,weeks,months);
	 monthpay(hours,wages,days,weeks,months);
	 semesterpay(hours,wages,days,weeks,months);
	 }
	// Calculate the money earns in a day.   
   public static void daypay(double hours,double wages,int days,int weeks,int months){

	  
		double daypay=wages*hours;
		System.out.println ("Daily payment:"+"$"+daypay);
   }
   // Calculate the money earns in a week.
   public static void weekpay(double hours,double wages,int days,int weeks,int months){
		double weekpay=wages*hours*days;
		System.out.println("Weekly payment:"+"$"+weekpay);
   }
   // Calculate the money earns in a month.
   public static void monthpay(double hours,double wages,int days,int weeks,int months){
		double monthpay=weeks*wages*hours*days;
		System.out.println("Monthly payment:"+"$"+monthpay);
}
   // Calculate the money earns in a semester.
   public static void semesterpay(double hours,double wages,int days,int weeks,int months){
		double semester=months*weeks*wages*hours*days;
		System.out.println("I can earn "+"$"+semester+" per semester!");
		}		
}


