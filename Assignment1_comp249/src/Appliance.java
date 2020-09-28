//----------------------------------------------------
//Assignment 1
//Question 1
//Written by: Joshua-James Nantel-Ouimet (#40131733)
//			  Samaninder Singh (#40133493)	
//----------------------------------------------------

/**
 * This program allows the user to add and delete appliances, search their
 * inventory for specific types of appliances, brands, price, etc.
 * 
 * @author Joshua-James Nantel-Ouimet
 * @author Samaninder Singh
 * @version 1.0
 */

public class Appliance {
	/**
	 * String value representing the appliance type.
	 */
	private String type;
	/**
	 * String value representing the appliance brand.
	 */
	private String brand;
	/**
	 * Long value representing the appliance's serial number.
	 */
	private long serialNumber;
	/**
	 * Long value representing the number of appliances.
	 */
	static long numberOfItems = 1000000;
	/**
	 * Double value representing the appliance price.
	 */
	private double price;

	/**
	 * Mutator method to set appliance type.
	 * 
	 * @param type is String value representing the appliance type.
	 */
	// mutator methods
	public void setType(String type) {
		if (type == "Fridge") {
			this.type = "Fridge";
		} else if (type == "Air Conditioner") {
			this.type = "Air Conditioner";
		} else if (type == "Washer") {
			this.type = "Washer";
		} else if (type == "Dryer") {
			this.type = "Dryer";
		} else if (type == "Freezer") {
			this.type = "Freezer";
		} else if (type == "Stove") {
			this.type = "Stove";
		} else if (type == "Dishwasher") {
			this.type = "Dishwasher";
		} else if (type == "Water Heater") {
			this.type = "Water Heater";
		} else if (type == "Microwave") {
			this.type = "Microwave";
		} else {
			System.out.println("Invalid Type");
		}
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	// accessor methods
	/**
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @return
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * 
	 * @return
	 */
	public long getSerialNumber() {
		return serialNumber;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	// constructors

	// no default value, object must be created with valid attributes
	/**
	 * Method to prompt user to add valid attributes for the created object.
	 */
	public Appliance() {
		System.out.println("Cannot initialize this object, must enter valid values");
	}

	/**
	 * 
	 * @param type  is a String value representing the appliance type.
	 * @param brand is a long value representing the appliance's serial number.
	 * @param price is a double value representing the appliance price.
	 */
	public Appliance(String type, String brand, double price) {
		// ensure unique serial number
		this.serialNumber = ++numberOfItems;
		this.brand = brand;
		this.price = price;
		// set valid type, ask if can use setter method to clean up code instead
		if (type.equalsIgnoreCase("Fridge")) {
			this.type = "Fridge";
		} else if (type.equalsIgnoreCase("Air Conditioner")) {
			this.type = "Air Conditioner";
		} else if (type.equalsIgnoreCase("Washer")) {
			this.type = "Washer";
		} else if (type.equalsIgnoreCase("Dryer")) {
			this.type = "Dryer";
		} else if (type.equalsIgnoreCase("Freezer")) {
			this.type = "Freezer";
		} else if (type.equalsIgnoreCase("Stove")) {
			this.type = "Stove";
		} else if (type.equalsIgnoreCase("Dishwasher")) {
			this.type = "Dishwasher";
		} else if (type.equalsIgnoreCase("Water Heater")) {
			this.type = "Water Heater";
		} else if (type.equalsIgnoreCase("Microwave")) {
			this.type = "Microwave";
		} else {
			System.out.println("Invalid Type");
		}
	}

	/**
	 * copy constructor
	 * 
	 * @param object
	 */
	public Appliance(Appliance object) {
		this.type = object.type;
		this.brand = object.brand;
		this.serialNumber = ++numberOfItems;
		this.price = object.price;
	}

	/**
	 * toString method
	 */
	public String toString() {
		return "Appliance Serial # " + serialNumber + "\nBrand: " + brand + "\nType: " + type + "\nPrice: " + price
				+ "\n";
	}

	/**
	 * 
	 * @return the number of items
	 */
	public static long findNumberOfCreatedAppliances() {
		return (numberOfItems - 1000000);
	}

	/**
	 * 
	 * @param object
	 * @return a boolean value according to if the objects are the same or not.
	 */
	// equals method
	public boolean equals(Appliance object) {
		return this.type == object.type && this.brand == object.brand && this.price == object.price;
	}

	/**
	 * 
	 * @param brandName
	 * @return
	 */
	// findAppliancesBy method
	public boolean findAppliancesBy(String brandName) {
		if (this.brand.equalsIgnoreCase(brandName)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param itemPrice
	 * @return
	 */
	// findCheaperThan method
	public boolean findCheaperThan(double itemPrice) {
		if (this.price < itemPrice) {
			return true;
		} else {
			return false;
		}
	}

}
