/**
 * 
 */

/**
 * @author yuten_000
 *
 *
 */

public class Movie {
    int date;
    double rate;
    String type;
    
	public Movie(int initdata,double initrate,  String inittype) {
		this.date=initdata;
		this.rate=initrate;
		this.type=inittype;	
		}
	
	public String toString(){
		return date+" "+rate+" "+type;
	}
}
	
