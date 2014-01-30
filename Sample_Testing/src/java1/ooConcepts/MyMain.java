package java1.ooConcepts;

public class MyMain {

	public static void main(String[] args) {
		Car c = new Car("Alto", "12345");
		Car c1 = new Car("Santro", "45678");
		Car c2 = new Car("Santro", "45678");
		
		/*c.setCarName("Alto");
		c.setCarModel("12345"); */
		
		c.printValues();
		System.out.println(Car.calssName);
		System.out.println(c.calssName);
	}
}
