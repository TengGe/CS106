
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Store {
	public int i=0;
	
	Scanner input;
	
	public Store() throws FileNotFoundException{
		
		 this.input = new Scanner(new File("src/input.txt"));
	}

	public Data[] getData() throws FileNotFoundException {
	 Lines x=new Lines();
     Data[] degrees=new Data[x.getLines()];
	 
	 while (input.hasNext()){
		 String date=input.next();
		 String dayOfWeek=input.next();
		 double degree=input.nextDouble();
		 
		 degrees[i]=new Data(date, dayOfWeek, degree);
		 i++;
	 }
	 return degrees;
	
	}

 }
