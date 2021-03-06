import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * A class that prompt user for input to determine their preference of movies.
 * 
 * @author yuten_000
 */
public class UserPreference {

	// Create a scanner object called input and console.
	Scanner console;
	Scanner input;

	/**
	 * Read the file called input and create a console that can prompt user for
	 * input.
	 * 
	 * @throws FileNotFoundException
	 */
	public UserPreference() throws FileNotFoundException {
		this.console = new Scanner(System.in);
		this.input = new Scanner(new File("src/movies.txt"));
	}

	/**
	 * A method that get movies that user want.
	 */
	public void getMovies() {
		inputMovie(console, input);
	}

	/**
	 * A method that read input file called movie and put it into a map list
	 * 
	 * @param console
	 *            Accept a console object as parameter.
	 * @param input
	 *            Accept a object name input that can import movies file as a
	 *            parameter
	 */
	public static void inputMovie(Scanner console, Scanner input) {
		// Create a map list name data that accept string as key and a object as
		// a value.
		Map<String, Movie> data = new HashMap<String, Movie>();
		// Use while loop to read the movies data and put it in a map list
		while (input.hasNextLine()) {
			String[] line = input.nextLine().split("\\t");
			data.put(line[1], new Movie(line[1], Integer.parseInt(line[0]),
					Double.parseDouble(line[2]), line[3]));
		}
		// called a method name userPreferType.
		userPreferType(console, data);

	}

	/**
	 * A method that find the type of movies that user prefer.
	 * 
	 * @param console
	 *            Accept a console object as parameter.
	 * @param data
	 *            Accept a map list name data as parameter.
	 */
	public static void userPreferType(Scanner console, Map<String, Movie> data) {
		// Create a set list name matches to contain the type of movies that
		// user want.
		Set<Movie> matches = new HashSet<Movie>();
		// Ask user which type of movies they prefer.
		System.out.println("What type of movies do you perfer?");
		System.out.println("A. Action      F. Crime     K. Sci-Fi ");
		System.out.println("B. Adventure   G. Drama     L. Sport");
		System.out.println("C. Animation   H. Fantasy   M. Romance");
		System.out.println("D. Biography   I. Horror    N. War");
		System.out.println("E. Comedy      J. Mystery   O. Western");
		// Declare a string variable named choice that store user's input
		String choice = console.nextLine();
		// Use while loop to ensure user to input correct information.
		while (!(choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B")
				|| choice.equalsIgnoreCase("C") || choice.equalsIgnoreCase("D")
				|| choice.equalsIgnoreCase("E") || choice.equalsIgnoreCase("F")
				|| choice.equalsIgnoreCase("G") || choice.equalsIgnoreCase("H")
				|| choice.equalsIgnoreCase("I") || choice.equalsIgnoreCase("J")
				|| choice.equalsIgnoreCase("K") || choice.equalsIgnoreCase("L")
				|| choice.equalsIgnoreCase("M") || choice.equalsIgnoreCase("N") || choice
					.equalsIgnoreCase("O"))) {
			System.out.println("Please select the type of movies you prefer:");
			choice = console.nextLine();

		}

		// Use if statement to find movies in the map list named data that
		// matches user's prefer type.
		if (choice.equalsIgnoreCase("A")) {
			String type = "Action";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("B")) {
			String type = "Adventure";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("C")) {
			String type = "Animation";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("D")) {
			String type = "Biography";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("E")) {
			String type = "Comedy";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);

				}
			}

		} else if (choice.equalsIgnoreCase("F")) {
			String type = "Crime";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("G")) {
			String type = "Drama";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("H")) {
			String type = "Fantasy";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("I")) {
			String type = "Horror";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("J")) {
			String type = "Mystery";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("K")) {
			String type = "Sci-Fi";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("L")) {
			String type = "Sport";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("M")) {
			String type = "Romance";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else if (choice.equalsIgnoreCase("N")) {
			String type = "War";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		} else {
			String type = "Western";
			for (Movie m : data.values()) {
				if (m.type.contains(type)) {
					matches.add(m);
				}
			}

		}
		// Call a method name UserPreferYears.
		UserPreferYears(console, matches);

	}

	/**
	 * A method that find out the years of movie that user prefer/
	 * 
	 * @param console
	 *            Accept a console object as parameter.
	 * @param matches
	 *            Accept a set list named matches as parameter
	 */
	public static void UserPreferYears(Scanner console, Set<Movie> matches) {
		// Create a array list that contains the years of movies that user want.
		List<Movie> matches2 = new ArrayList<Movie>();
		System.out.println("The time period of the movies you want:");
		// Use while loop to ensure user input a integer.
		while (!(console.hasNextInt())) {
			System.out.println("Please enter integer:");
			console.next();
		}
		int choice1 = console.nextInt();
		// Use while loop to ensure user input a correct years.
		while (choice1 >= 2015) {
			System.out.println("Please enter the correct years:");
			choice1 = console.nextInt();
		}
		System.out.println("to");
		// Use while loop to ensure user input a integer.
		while (!(console.hasNextInt())) {
			System.out.println("Please enter integer:");
			console.next();
		}
		int choice2 = console.nextInt();
		// Use while loop to ensure user input a correct years.
		while (choice2 < choice1 || choice2 >= 2015) {
			System.out.println("Please enter the correct years:");
			choice2 = console.nextInt();
		}

		// Use for loop to put the year of the movie that user prefer to a list
		// name matches2.
		for (Movie m : matches) {
			if (m.date == choice1) {
				matches2.add(m);

			}

		}
		// Use while loop to put the period of years of the movies that user
		// prefer to a list name matches2.
		while (choice1 < choice2) {
			choice1++;
			for (Movie m : matches) {
				if (m.date == choice1) {
					matches2.add(m);

				}

			}
		}

		System.out.println();
		// Call a method named sizeOfList.
		sizeOfList(console, matches2);

	}

	public static void sizeOfList(Scanner console, List<Movie> matches2) {
		// Use if loop to printout 5 movies from the list.
		if (matches2.size() >= 5) {
			List<Movie> sub = matches2.subList(0, 5);
			for (Movie movies : sub) {
				System.out.println(movies);

			}
			// Call a method name shuffle
			shuffle(console, matches2);
		}
		// Print out the movies if the list contains more than one movies and
		// less than 5 movies.
		else if (matches2.size() >= 1 && matches2.size() < 5) {
			System.out
					.println("These are the movies i recommended. if you want more, please enlarge your time period");
			for (Movie movies : matches2) {
				System.out.println(movies);

			}
		}
		// If the list does not contain any movies that user prefers, print out
		// instruction.
		else {
			System.out
					.println("Sorry, i cant find any movies that might interest you. Please try to englarge the time period.");
		}
	}

	/**
	 * A method that allow user to shuffle the movies
	 * 
	 * @param console
	 *            Accept a console object as parameter.
	 * @param matches2
	 *            Accept a list named matches2 as parameter.
	 */
	public static void shuffle(Scanner console, List<Movie> matches2) {
		System.out
				.println("These are the movies i recommended. If you want more, please Enter shuffle:");
		// Use while loop that allows user to shuffle the list.
		while (console.hasNext()) {
			String one = console.next();
			// Use while loop to make sure user input the correct information
			while (!(one.equalsIgnoreCase("shuffle"))) {
				System.out.println("Invalid. Please enter again:");
				one = console.next();
			}
			// Use if statement to determine user input want to shuffle the list
			// or
			// not
			if (one.equalsIgnoreCase("shuffle")) {
				Collections.shuffle(matches2);
				List<Movie> sub = matches2.subList(0, 5);
				for (Movie movies : sub) {
					System.out.println(movies);
				}
			}

		}

	}

}
