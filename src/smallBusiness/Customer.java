package smallBusiness;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private int numerOfSession;
	private  int feePaid;
	private  int totalFees;
	
		
	public Customer(int id, String names, int numerOfSessions) {
		this.id = id;
		this.name = name;
		this.numerOfSession = numerOfSession;
		this.totalFees=1000;
		this.feePaid=0;
		
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
	public int getNumerOfSession() {
		return numerOfSession;
	}
	public void setNumerOfSession(int numerOfSession) {
		numerOfSession += numerOfSession;
	}
	public int getFeePaid() {
		return feePaid;
	}
	public void PayFees(int fee) {
		feePaid =feePaid+fee;
		Instructor.updateTotalMoneyEarned(feePaid);
		
	}
	public int getTotalFees() {
		return totalFees;
	}
	public static void updateTotalFees(int totalFees) {
		totalFees+= totalFees;
		
	}
	
	public int RemaningFees(int fees) {
		return totalFees-feePaid;
	}
	
	@Override
    public String toString() {
        return "customer's name :"+name+
                " Total fees paid so far $"+ feePaid;
    }
	
	

}
