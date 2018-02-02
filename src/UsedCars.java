/*
 * Emily Blanford, Lab 10, 2/2/2018
 * UsedCar Class, Child of Car Class
 * Called in CarApp
 */

public class UsedCars extends Car {
	private double mileage;

	public UsedCars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedCars(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
	}

	public String toString() {
		return String.format("%-15s %-15s %-10d $%,-10.2f (Used) %,-10.1f miles", super.getMake(), super.getModel(),
				super.getYear(), super.getPrice(), mileage);
	}

}
