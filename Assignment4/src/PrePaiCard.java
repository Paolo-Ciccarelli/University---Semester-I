
public class PrePaiCard {

	int id;
	int day, month;
	String dietType;

	// The default constructor
	public PrePaiCard() {
		this.dietType = "Carnivore";
		this.id = 00000000;
		this.day = 00;
		this.month = 00;
	}

	// Constructor with four parameters
	public PrePaiCard(String type, int id, int day, int month) {
		this.dietType = type;
		this.id = id;
		this.day = day;
		this.month = month;
	}

	// The copy constructor
	public PrePaiCard(PrePaiCard other) {
		this.dietType = other.getDietType();
		this.id = other.getId();
		this.day = other.getDay();
		this.month = other.getMonth();
	}

	// Retrieves and returns the prepaid card's stored information in String format.
	// Note that the expiry date is printed in dd/mm format.
	public String toString() {

		String formatDay, formatMonth;
		if (day < 10) {
			formatDay = "0" + this.day;
		} else
			formatDay = String.valueOf(day);
		if (month < 10) {
			formatMonth = "0" + month;
		} else
			formatMonth = String.valueOf(month);

		String date = formatDay + "/" + formatMonth;
		String answer = dietType + " - " + id + " - " + date;
		return answer;
	}

	// Verifies whether two distinct PrePaiCard objects possess identical
	// attributes.
	public boolean equals(PrePaiCard other) {
		if (toString().equals(other.toString()))
			return true;
		else
			return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDay() {
		return day;
	}

	// Exception handling accounts for inputs that correspond to days that DNE
	public void setDay(int day) {
		if (day > 31 || day < 1) {
			this.day = 0;
		} else
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	// Exception handling accounts for inputs that correspond to months that DNE
	public void setMonth(int month) {
		if (month > 12 || month < 1) {
			this.month = 0;
		} else
			this.month = month;
	}

	public String getDietType() {
		return dietType;
	}

	public void setDietType(String dietType) {
		this.dietType = dietType;
	}

}
