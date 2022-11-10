package lesson3.car;


// Create an Car class
public class Car{

//	declare class level variables year,make,model and price
	private int year;
	private String make;
	private String model;
	private double price;

//	main() method  
	public static void main(String[] args) {

//		// Create an object e1 of class Employee (This will call the constructor 
//		initialized the object myCar and stored on the memory with 2010, "Toyota", "Camry", 15000 )
		Car myCar = new Car(2010, "Toyota", "Camry", 15000);
		
		//Assignment operator to assign an myCar reference to 
		//myOtherCar reference variable then it will point to the same address location
		Car myOtherCar = myCar;
		
//		//invokes the updatePrice() method with parameter 12000 to update mycar.price and myOtherCar.price with new price 12000 
		myCar.updatePrice(12000);
		
//		print the value of mycar.price and myOtherCar.price which is 12000
//		they have the same value because they point to the same reference
		System.out.println(myCar.price);
		System.out.println(myOtherCar.price);
		
	}

	// Create a class constructor for the Car class with empty parameter we can call it default constructor
//	The constructor is called when an object of a class is created(instantiated) . 
	public Car(){
	}
	// Create a class constructor for the Car class with int carYear, carMake,carModel and carPrice parameter
	public Car(int carYear, String carMake, String carModel, double carPrice) {
//	 the value of local variables  going to be assigned to class level variables
 		year = carYear;
		make = carMake;
		model = carModel;
		price = carPrice;
	}
//	
	//update the price for the car
	public void updatePrice(double newPrice){
//		this line return updated price to myCar.updatePrice and change the value of caller object.price on the memory
		price = newPrice;
	
	}
	  //declaring a method named staticMethod()
	public static int staticMethod(){
//		this line return 5 to the caller object.price
		return 5;
	}
	  //declaring a method named getYear()
	public int getYear() {
//		this line return updated year to the caller object.year
		return year;
	}
	  //declaring a method named setYear((int carYear)) which has one parameter carYear
	public void setYear(int carYear) {
//		assign the value of local variable carYear to year
		year = carYear;
	}

//	public String getMake() {
//		return make;
//	}
//
//	public void setMake(String make) {
//		make = make;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		model = model;
//	}

}
