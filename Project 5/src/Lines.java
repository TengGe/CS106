/**
 * 
 */

/**
 * @author yuten_000
 *
 */
import java.io.*;
import java.util.*;

// A class that computes the total lines of the input file.
public class Lines {

	// Create a scanner object called input
	Scanner input;

	/**
	 * Read the file called input
	 * 
	 * @throws FileNotFoundException
	 */
	public Lines() throws FileNotFoundException {

		this.input = new Scanner(new File("src/input.txt"));
	}

	/**
	 * A method that calculate the total lines of input file and return the
	 * value.
	 * 
	 * @return the numbers of lines of input file.
	 */
	public int getLines() {
		int numLines = 0;

		while (input.hasNextLine()) {
			input.nextLine();
			numLines++;
		}

		return numLines;
	}

}