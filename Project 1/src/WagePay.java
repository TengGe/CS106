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
	 // Methods
	 dayPay(hours,wages,days,weeks,months);
	 weekPay(hours,wages,days,weeks,months);
	 monthPay(hours,wages,days,weeks,months);
	 semesterPay(hours,wages,days,weeks,months);
	 }
	// Calculate the money earns in a day.   
   public static void dayPay(double hours,double wages,int days,int weeks,int months){

                double dayPay=wages*hours;
		System.out.println ("Daily payment:"+"$"+dayPay);
   }
   // Calculate the money earns in a week.
   public static void weekPay(double hours,double wages,int days,int weeks,int months){
		double weekPay=wages*hours*days;
		System.out.println("Weekly payment:"+"$"+weekPay);
   }
   // Calculate the money earns in a month.
   public static void monthPay(double hours,double wages,int days,int weeks,int months){
		double monthPay=weeks*wages*hours*days;
		System.out.println("Monthly payment:"+"$"+monthPay);
}
   // Calculate the money earns in a semester.
   public static void semesterPay(double hours,double wages,int days,int weeks,int months){
		double semester=months*weeks*wages*hours*days;
		System.out.println("I can earn "+"$"+semester+" per semester!");
		}		
}


