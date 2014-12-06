/**
 * 
 */

/**
 * @author yuten_000
 *
 */
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class Final {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws FileNotFoundException {

		Scanner console = new Scanner(System.in);

		Scanner input = new Scanner(new File("src/movies.txt"));
		Map<String, Movie> data = new HashMap<String, Movie>();
		while (input.hasNextLine()) {
			String[] line = input.nextLine().split("\\t");
			data.put(line[1], new Movie(line[1], Integer.parseInt(line[0]),
					Double.parseDouble(line[2]), line[3]));
		}
		// System.out.println(data);
		userPerferType(console, data);
		/**
		 * Set keys=data.keySet(); for (Iterator i=keys.iterator();
		 * i.hasNext();){ String key=(String)i.next(); Movie Value=(Movie)
		 * data.get(key); System.out.println(key+"="+Value);
		 **/

	}

	public static void userPerferType(Scanner console, Map<String, Movie> data) {
		Set<Movie> matches = new HashSet<Movie>();
		System.out.println("What type of movies do you perfer?");
		System.out.println("A. Drama");
		System.out.println("B. Action");
		System.out.println("C. Fantasy");
		System.out.println("D. Adventure");
		System.out.println("E. History ");
		String choice = console.nextLine();
		if (choice.equalsIgnoreCase("A")) {
			String type = "Drama";
			for (Movie m : data.values()) {
				if (m.type.equals(type)) {
					matches.add(m);
				}
			}
			System.out.print(matches);
		}
		
	}

}