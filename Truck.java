
public class Truck extends Vehicle {

	protected String Truck_model = null;
	
	//  non parametric constructor
	public Truck() {
		
	}

	
	// parametric constructor
	public  Truck (String Truck_model , String Plate) {
		this.Truck_model= Truck_model;
		this.setLicenseplate(Plate);
	}
	
	public void setTruckModel(String Truck_model) {
		this.Truck_model= Truck_model;
	}
	
	public String getTruckModel() {
		 return this.Truck_model;
	}
	
	
	
	// overriding the license plate method written in Vehicle class
	 public void setLicenseplate(String plate ) {
		 this.Lisenceplate = plate;
	 }
	 
	

	
}
