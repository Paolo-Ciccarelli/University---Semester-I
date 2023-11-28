
public class Sales {

	static int juniorCost = 5;
	static int teenCost = 10;
	static int mediumCost = 12;
	static int bigCost = 15;
	static int familyCost = 20;
	int juniorSales, teenSales, mediumSales, bigSales, familySales;

	// The default constructor
	public Sales() {
		this.juniorSales = 0;
		this.teenSales = 0;
		this.mediumSales = 0;
		this.bigSales = 0;
		this.familySales = 0;
	}

	// Constructor with five parameters, each representing the sales volume of the
	// respective meal category.
	public Sales(int junSales, int tnSales, int medSales, int bgSales, int famSales) {
		this.juniorSales = junSales;
		this.teenSales = tnSales;
		this.mediumSales = medSales;
		this.bigSales = bgSales;
		this.familySales = famSales;
	}

	// The copy constructor
	public Sales(Sales other) {
		this.juniorSales = other.getJuniorSales();
		this.teenSales = other.getTeenSales();
		this.mediumSales = other.getMediumSales();
		this.bigSales = other.getBigSales();
		this.familySales = other.getFamilySales();
	}

	// Increases the sales volume for all meal categories by the specified value(s).
	public void addSales(int junSales, int tnSales, int medSales, int bgSales, int famSales) {
		this.juniorSales += junSales;
		this.teenSales += tnSales;
		this.mediumSales += medSales;
		this.bigSales += bgSales;
		this.familySales += famSales;
	}

	// Computes and returns the cumulative economic value of the sales volume stored
	// within the PoS.
	public int SalesTotal() {
		return ((juniorCost * juniorSales) + (teenCost * teenSales) + (mediumCost * mediumSales) + (bigCost * bigSales)
				+ (familyCost * familySales));
	}

	// Retrieves and returns the sales volume for each meal type in String format.
	public String toString() {
		String sales = " Junior Meal Count: " + juniorSales + "\n Teen Meal Count: " + teenSales
				+ "\n Medium Meal Count: " + mediumSales + "\n Big Meal Count: " + bigSales + "\n Family Meal Count: "
				+ familySales;
		return sales;
	}

	// Verifies whether two distinct Sales objects possess identical attributes.
	public boolean equals(Sales sales) {
		if (toString().equals(sales.toString()))
			return true;
		else
			return false;
	}

	public static int getJuniorCost() {
		return juniorCost;
	}

	public static void setJuniorCost(int juniorCost) {
		Sales.juniorCost = juniorCost;
	}

	public static int getTeenCost() {
		return teenCost;
	}

	public static void setTeenCost(int teenCost) {
		Sales.teenCost = teenCost;
	}

	public static int getMediumCost() {
		return mediumCost;
	}

	public static void setMediumCost(int mediumCost) {
		Sales.mediumCost = mediumCost;
	}

	public static int getBigCost() {
		return bigCost;
	}

	public static void setBigCost(int bigCost) {
		Sales.bigCost = bigCost;
	}

	public static int getFamilyCost() {
		return familyCost;
	}

	public static void setFamilyCost(int familyCost) {
		Sales.familyCost = familyCost;
	}

	public int getJuniorSales() {
		return juniorSales;
	}

	public void setJuniorSales(int juniorSales) {
		this.juniorSales = juniorSales;
	}

	public int getTeenSales() {
		return teenSales;
	}

	public void setTeenSales(int teenSales) {
		this.teenSales = teenSales;
	}

	public int getMediumSales() {
		return mediumSales;
	}

	public void setMediumSales(int mediumSales) {
		this.mediumSales = mediumSales;
	}

	public int getBigSales() {
		return bigSales;
	}

	public void setBigSales(int bigSales) {
		this.bigSales = bigSales;
	}

	public int getFamilySales() {
		return familySales;
	}

	public void setFamilySales(int familySales) {
		this.familySales = familySales;
	}

}
