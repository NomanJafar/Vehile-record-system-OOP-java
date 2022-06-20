
public class MainClient_task_1 {

	public static void main(String[] args) {
	
		Vehicle C = new Vehicle();
		C.Lisenceplate= " 12345 ";
		
		System.out.println("The Number of the car is " + C.Lisenceplate);
		

		// passing child object to parent reference 
		// for Car object
		Vehicle v1 = new Car();
		v1.setLicenseplate("9945");
		System.out.println("\n vehicle reference pointing to Car object has License plate No : "+ v1.Lisenceplate);
		
		
		
		// For Truck Object
		Vehicle v2 = new Truck();
		v2.setLicenseplate(" 9999");
		System.out.println("\n vehicle reference pointing to Truck object has License Plate No : "+ v1.Lisenceplate);
	
		
		// Car object

		Car c1 =  new Car();
		c1.setCarModel("VoxWagen");
		c1.setLicenseplate("9848");
		
		System.out.println("\n Model Name: "+ c1.getCarModel()+"\n" + " License No : "+ c1.Lisenceplate);
		
		
		
		
		
		// Truck object
		Truck T1 =  new Truck();
		T1.setTruckModel(" Ford Ranger");
		T1.setLicenseplate(" VSS 2343");

		
		System.out.println("\n Model Name: "+ T1.getTruckModel()+"\n" + " License No : "+ T1.Lisenceplate);
		
		
	}
	

}
