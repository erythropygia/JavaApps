public class sahipler {
	private String marka;
	private String model;

	sahipler(String marka, String model) 
	{
		this.marka=marka;
		this.model=model;
		
	
	}
	
	public String MarkaModel() {
		
		return marka + " " + model;
	}
	

}
