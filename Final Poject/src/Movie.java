/**
 * 
 */

/**
 * @author yuten_000
 *
 *
 */

public class Movie {
	String movies;
    int date;
    double rate;
    String type;
    
	public Movie(String initmovies,int initdata,double initrate,  String inittype) {
		this.movies=initmovies;
		this.date=initdata;
		this.rate=initrate;
		this.type=inittype;	
		}


	public String toString(){
		return movies+" "+date+" "+rate+" "+type;
	}
}
	
