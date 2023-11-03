package smallBusiness;

import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Income {
	
	
	
	public static void main(String[] args) {
	
	drivingRange parkridge=new drivingRange(1,"parkridge", 15);
	drivingRange mtprospect=new drivingRange(2,"mtprospect", 8);
	drivingRange honoverpark=new drivingRange(3,"honoverpark", 10);
	
	
	List<drivingRange> rangeadd=new ArrayList<>();
	rangeadd.add(parkridge);
	rangeadd.add(mtprospect);
	rangeadd.add(honoverpark);
	
	
	
	
	

	
		Customer paul=new Customer(1,"paul", 10);
		Customer mark=new Customer(1,"mark", 5);
		Customer cary=new Customer(1,"cary", 4);
		List<Customer> custeadd=new ArrayList<>();
		custeadd.add(paul);
		custeadd.add(mark);
		custeadd.add(cary);
		
		
		Instructor coach=new Instructor(custeadd,rangeadd);
		
		
		paul.PayFees(700);
		mark.PayFees(300);
		cary.PayFees(400);
		
		System.out.println("total money earned from customers for golf lessons is $ "+coach.getTotalMoneyEarned());
		//System.out.println("paul paid"+paul.getFeePaid());
		//System.out.println("mark paid"+mark.getFeePaid());
		
		parkridge.receiveCommision(parkridge.getCommesion());
		mtprospect.receiveCommision(mtprospect.getCommesion());
		honoverpark.receiveCommision(honoverpark.getCommesion());
		
		System.out.println("\n Parkridge Range has earned so far  $ "+parkridge.getCommesion());
		
		System.out.println("\n Mtprospect Range has earned so far $ "+mtprospect.getCommesion());
		
		System.out.println("\n Honoverpark Range has earned so far $ "+honoverpark.getCommesion());
		
		System.out.println("\n Total money after paying commision $ "+coach.getTotalMoneyEarned());
		
		
		
		
		

	}

}
