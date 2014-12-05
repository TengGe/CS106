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
import java.util.Iterator;

import javax.sound.sampled.AudioFileFormat.Type;

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
		data.put(line[1],new Movie(line[1],Integer.parseInt(line[0]), Double.parseDouble(line[2]), line[3]));
		}
		System.out.println(data);
		userPerferType(console, data);
		/**
		Set keys=data.keySet();
		    for (Iterator i=keys.iterator(); i.hasNext();){
			String key=(String)i.next();
			Movie Value=(Movie) data.get(key);
			System.out.println(key+"="+Value);
	**/
			
		}
	
	public static void userPerferType(Scanner console, Map<String,Object> data){
		HashSet<Movie> matches=new HashSet<>();
		System.out.println("What type of movies do you perfer?");
		System.out.println("A. Drama");
		System.out.println("B. Action");
		System.out.println("C. Fantasy");
		System.out.println("D. Adventure");
		System.out.println("E. History ");
		
        String choice=console.nextLine();
        if (choice.equalsIgnoreCase("A")){
        	String genere="Drama";	
            for (Movie m: data){
            	if (m.type.equals(genere)){
            		matches.add(m);
        	}
        		System.out.print(matches);
        	}
        
 

	




}
	}}
	