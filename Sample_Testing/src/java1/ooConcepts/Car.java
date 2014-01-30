package java1.ooConcepts;

public class Car {
	/* Member (Class level) variables */
	private String carName;
	private String carModel;

	public static String calssName = "Car";
	
	public Car() {
		
	}

	public Car(String carName, String carMmodel) {
		this.carName = carName;
		this.carModel = carMmodel;
	}
	
	public void setCarName(String name) {
		this.carName = name;
	}
	
	public void setCarModel(String model) {
		this.carModel = model;
	}
	
	public void printValues() {
		System.out.println("CarName : "+carName);
		System.out.println("CarModel : "+carModel);
	}
}
