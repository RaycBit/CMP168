
public class Infant extends Passenger {
	
	class InfantToy{
		private String infantToyName;
		private int infantToyRating;
		
	void infantToy(String infantToyName, int infantToyRating) {
		this.infantToyName =  infantToyName;
		this.infantToyRating = infantToyRating;
	}
	public String toString() {
		return String.format("InfantToyName %s infantToyRating %d",this.infantToyName,this.infantToyRating);
	}
	}

	public Infant() {

	}

	public Infant(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {

	}

	public void addInfantToy(String name, int rating) {

	}
	
	public int getNumInfantToys() {
		
	}

	public String getInfantToyName(int index) {
		
	}
	
	public String getInfantToyAsString(int index) {
		
	}
	
	public int getHighestInfantToyRating() {
		
	}
	
	public String toString(){
		
	}
	
	public void printDetails() {
		
		
	}
	
	
}

/*
Infant
InfantToy //an inner class (non-static)
- infantToyName: String
- infantToyRating: int
+ InfantToy(String, int)
+ toString() : String


Infant (continued):
- toys : BabyToy [ ]
- numBabyToys : int
+ Infant()//an Infant with zero InfantToys but array capacity of 10
+ Infant(String, int, double, double, char, int) //pass values to parent class’s overloaded constructor
Infant cannot have offSpring therefore pass a zero to the parent constructor

+ addInfantToy(String,int) //uses the InfantToy constructor, do not resize array
+ getInfantToyAsString(int) : String
+ getNumInfantToys() : int
+ getInfantToyName(int) : String
+ getInfantToyRating(int) : int
+ getHighestInfantToyRating(): int //should return the highest rating, or 0 if the array is empty
+ printDetails() : void @Override //see NOTE below for formatting
+ toString() : String @Override //see NOTE below for formatting

NOTE1:
For both the printDetails() and toString() methods include the data from the Passenger class, as well as
Person attributes.
Format the Infant data as “Infant: Number of Toys: %4d | Infant Toys:\n” followed by the
formatted InfantToy String for each toy on its own line as “InfantToy: Toy Name: %20s | Rating %4d\n”

NOTE2:
In the Infant class do not override the equals method inherited from the Person class

NOTE3:
In the Infant class do not resize the toys array. The max capacity should remain 10

Hint1: Use super.printDetails() and super.toString()
Hint2: InfantToy is immutable (i.e. no setter methods, it’s values cannot be changed)
Hint3 : InfantToy belongs to Infant only, which is why it is a nested class
Hint4: toString() inside the InfantToy should be formatted as “InfantToy: Toy Name: %20s | Rating %4d\n”
Hint5: toString() inside the Infant should iterate through toys and append the String returned from each
InfantToy*/