/**
 * 
 */

/**
 * @author yuten_000
 *
 */
import java.util.*;
import java.io.*;

public class Final {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner console = new Scanner(System.in);
		
		Scanner input = new Scanner(new File("src/movies.txt"));
		Map<String,Object>data=new HashMap<String,Object>();
		while (input.hasNextLine()){
		String[] line= input.nextLine().split("\\t");
		data.put(line[1],new Movie(Integer.parseInt(line[0]), Double.parseDouble(line[2]), line[3]));
		}

		Set keys=data.keySet();
		    for (Iterator i=keys.iterator(); i.hasNext();){
			String key=(String)i.next();
			Movie Value=(Movie) data.get(key);
			System.out.println(key+"="+Value);
	
			
		}
	}
	public static void userPerferType(Scanner console){
		System.out.println("What type of movies do you perfer?");
		System.out.println("A. Drama");
		System.out.println("B. Action");
		System.out.println("C. Fantasy");
		System.out.println("D. Adventure");
		System.out.println("E. History ");
		String A="Dramma";
		String B="Action";
		String C="Fantasy";
		String D="Adventure";
		String E="History";
		while(console.hasNext()){
			
			
		}
	
	
}}