package array_tutorials;

class DVD {

	public String name;
	public int releaseYear;
	public String director;
	
	DVD (String name, int releaseYear, String director){
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}
	
	public String toString() {
		return(this.name + ", directed by " + this.director + ", released in " + this.releaseYear + ".");
	}
}

public class DVDLibrary{

	public static void main(String args[]) {
//		The actual code for creating an Array to hold DVD's.
		DVD[] dvdCollection = new DVD[15];
		
		
//		Writing Items into an Array
		
//		Firstly, we need to actually create a DVD object for The Avengers.
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
		
//		Next, we'll put it into the 8th place of the Array. Remember, because we
//		started numbering from 0, the index we want is 7.
		dvdCollection[7] = avengersDVD;
		
		
	}
}


