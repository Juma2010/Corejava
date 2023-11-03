package smallBusiness;

import java.util.List;

public class Instructor {
	private List<Customer> customers;
	private List<drivingRange> ranges;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	public Instructor(List<Customer> customers, List<drivingRange> ranges) {
		totalMoneyEarned=0;
		totalMoneySpent=0;
		this.customers = customers;
		this.ranges = ranges;
		
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void addCustomers(Customer customer) {
		customers.add(customer);
	}
	public List<drivingRange> getRange() {
		return ranges;
	}
	public void addRange(drivingRange range) {
		ranges.add(range);
	}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned +=moneyEarned;
	}
	public int getTotalmoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned-=moneySpent;
	}
	
	
	
	
	

}
