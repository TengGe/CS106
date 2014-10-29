/**
 * 
 */

/**
 * @author yuten_000
 *
 */
import java.io.*;
import java.util.*;


public class Lines {
	
	Scanner input;
	
	public Lines() throws FileNotFoundException{
		
		 this.input = new Scanner(new File("src/input.txt"));
	}
	
	public int getLines(){
		int numLines = 0;
	
		while (input.hasNextLine()) {
			input.nextLine();
			numLines++;
	}
		
	return numLines;
	}
	
}