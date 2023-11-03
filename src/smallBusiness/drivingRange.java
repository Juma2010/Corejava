package smallBusiness;

public class drivingRange {
	private int id;
	private String name;
	private int commesion;
	private int commesionEarned;
	public drivingRange(int id, String name, int commesion) {
		super();
		this.id = id;
		this.name = name;
		this.commesion=commesion;
		this.commesionEarned=0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCommesion() {
		return commesion;
	}
	public  void setCommesion(int commesion) {
		this.commesion = commesion;
	}
	
	public void receiveCommision(int commesion) {
		commesionEarned+=commesion;
		Instructor.updateTotalMoneySpent(commesion);
		
		
	}
	
	

}
