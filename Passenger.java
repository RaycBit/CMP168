public class Passenger {

	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	private double height;

	public Passenger() {

		name = "";
		birthYear = 1900;
		weight = 0.0;
		gender = 'u';
		numCarryOn = 0;

	}

	public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {

		this.name = name;

		this.birthYear = birthYear;

		if (height < 0) {
			this.height = -1.0;

		} else {
			this.height = height;

		}

		if (weight < 0) {
			this.weight = -1.0;

		} else {
			this.weight = weight;

		}

		if (gender != 'm' && gender != 'f' && gender != 'u') {
			this.gender = 'u';

		} else {
			this.gender = gender;

		}

		if (numCarryOn >= 0 && numCarryOn < 3) {
			this.numCarryOn = numCarryOn;

		}

		else if (numCarryOn < 0) {
			this.numCarryOn = 0;

		}

		else {
			this.numCarryOn = 2;

		}
	}

	public int calculateAge(int currentYear) {

		if (currentYear < birthYear) {
			return -1;
		} else {
			return currentYear - birthYear;
		}
	}

	public double calculateBMI() {
		return (this.weight * 703) / (this.height * this.height);
	}

	public void gainWeight() {
		weight++;
	}

	public void gainWeight(double weight) {
		if ((weight + this.weight) >= 0) {
			this.weight = this.weight + weight;
		}
		else {
			this.weight = 0.0;
		}
	}

	public int getBirthYear() {
		return birthYear;
	}

	public char getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public int getNumCarryOn() {
		return numCarryOn;
	}

	public boolean isFemale() {
		if (gender == 'f') {
			return true;
		} else {
			return false;
		}
	}

	public boolean isMale() {

		if (gender == 'm') {
			return true;
		} else {
			return false;
		}
	}

	public void loseWeight() {
		this.weight = this.weight - 1;
		if(Double.compare(this.weight, 0.0) < 0){
		this.weight = 0.0;
		}
	}

	public void loseWeight(double weight) {
		this.weight -= weight;
		if(Double.compare(this.weight, 0.0) < 0) {
			this.weight = 0.0;
		}
	}

	public void printDetails() {
		System.out.printf("Name: %s | ", name);
		System.out.printf("Year of Birth: %d | ", birthYear);
		System.out.printf("Weight: %.2f | ", weight);
		System.out.printf("Height: %.2f | ", height);
		System.out.printf("Gender: %c | ", gender);
		System.out.printf("NumCarryOn: %d \n ", numCarryOn);

	}

	public void setGender(char gender) {

		if (gender != 'm' && gender != 'f' && gender != 'u') {
			this.gender = 'u';
		} else {
			this.gender = gender;
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void setWeight(double weight) {
		if (weight < 0) {
			this.weight = -1.0;
		} else {
			this.weight = weight;
		}
	}

	public void setNumCarryOn(int numCarryon) {

		if (numCarryOn >= 0 && numCarryOn < 3) {
			this.numCarryOn = numCarryOn;
		}

		else if (numCarryOn < 0) {
			this.numCarryOn = 0;
		}
		else {
			this.numCarryOn = 2;
		}

	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			this.height = -1.0;
		} else {
			this.height = height;
		}
	}
	
	public String toString(){
		return String.format("\nName: %20s", this.name) + String.format(" | Year of Birth: %4d", this.birthYear) + String.format(" | Weight: %10.2f " , this.weight)
				+ String.format("| Height: %10.2f ", this.height) + String.format("| Gender: %c " , this.gender) + String.format("| NumCarryOn: %2d\n" , this.numCarryOn);
	}
	
	public boolean equals(Object obj){
		if (obj instanceof Passenger) {
			Passenger otherPassenger = (Passenger)obj;
			if( otherPassenger.getBirthYear() == this.birthYear && otherPassenger.getGender() == this.gender && otherPassenger.getName().equals(this.name)) {
				if(Math.abs(otherPassenger.getWeight() - this.weight) < 0.5 && Math.abs(otherPassenger.getHeight() - this.height) < 0.5 ) {
					return true;
				}
			}		
		}
			return false;
	}
}





