package inheritance;


public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi");
		System.out.println(customer.customerNumber + " kaydedildi2");
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
			
		}
	}
}