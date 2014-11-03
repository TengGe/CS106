/**
 * 
 */

/**
 * @author yuten_000

 *
 */

import java.io.*;
import java.util.*;

public class Project5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		// Declare Calculate object.
		Calculate c = new Calculate();
		// Call the methods of the object Calculate to analyze the average,
		// lowest, and highest temperature of the input file, then print them in
		// the console
		System.out.println("The average temperature of October is "
				+ c.getAverage() + " degree.");
		System.out.println("The lowest temperature of October is " + c.getMin()
				+ " degree");
		System.out.println("The highest temperature of October is "
				+ c.getMax() + " degree");

	}

}
