import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



/**
 * 
 */

/**
 * @author yuten_000
 *
 */
public class Calculate {
	
	public double allDegree=0.0;
	public double maxValue=0.0;
    public double minValue=1000.0;
	
	
	Scanner input;
	
	public Calculate() throws FileNotFoundException{
		
		 this.input = new Scanner(new File("src/input.txt"));
	}





	public double getAverage() throws FileNotFoundException{
		Lines l=new Lines();
		Store x=new Store();
		for (Data d: x.getData()){
		 this.allDegree+=d.getDegree();
		}
		return this.allDegree/l.getLines();
	}
	
	public double getMax() throws FileNotFoundException{
		
		 while (input.hasNext()){
			 String date=input.next();
			 String dayOfWeek=input.next();
			 double degree=input.nextDouble();
			 
			 if (degree>maxValue){
				 maxValue=degree;
			 }
			 
			
		
	}
		 return maxValue;
	}
	
	public double getMin() throws FileNotFoundException{
		
		 while (input.hasNext()){
			 String date=input.next();
			 String dayOfWeek=input.next();
			 double degree=input.nextDouble();
			
			 if (degree<minValue){
				 minValue=degree;
			 }
			 
			
		
	}
		 return minValue;
	}
	

}


