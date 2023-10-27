
public class Person extends Passenger {

	private int numOffspring;

	public Person() {
		numOffspring = 0;
	}

	public Person(int person) {
		this.numOffspring = person;
	}

	public Person(String name, int birthYear, double weight, double height, char gender, int numCarryOn, int numOffspring) {
		super(name, birthYear, weight, height, gender, numCarryOn);
		
		if(numOffspring < 0) {
			this.numOffspring = 0;
		}
		else {
		 this.numOffspring = numOffspring;
		}
	}

	public void setNumOffspring(int numOffspring) {
		if(numOffspring < 0) {
			this.numOffspring = 0;
		}
		else {
		this.numOffspring = numOffspring;
		}
	}

	public int getNumOffspring() {
		return numOffspring;
	}

	public void printDetails() {
		super.printDetails();
		System.out.printf("Number of Offspring: %4d\n ", numOffspring);
	}


	public String toString() {
		super.toString();
		return String.format("Person: Number of Offspring: %4d\n", this.numOffspring);
	}

	public boolean equals(Object obj) {
			
	}

}