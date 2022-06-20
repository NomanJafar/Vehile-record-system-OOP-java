
public class Car extends  Vehicle {
	
	private String CarModel = null;
	
	
	public Car () {
		
	}
	
	
	public Car (String CarModel , String Plate) {
		this.CarModel= CarModel;
		this.setLicenseplate(Plate);
	}
	
	public void setCarModel(String CarModel) {
		this.CarModel= CarModel;
	}
	
	public String getCarModel() {
		 return this.CarModel;
	}
	
	
	
	// overriding the license plate method written in Vehicle class
	 public void setLicenseplate(String plate ) {
		 this.Lisenceplate = plate;
	 }
	 
	

	 
}
