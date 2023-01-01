 public class Main {	

public static void main(String[] args) {		
    Customer customer;		
    RegularCustomer;
 
regularCustomer = new RegularCustomer("Julius", 400);		
SeniorCustomer seniorCustomer = new SeniorCustomer("Marabe", 600);
 		
   customer = regularCustomer;		
System.out.println(customer.getName()+" " +customer.calculateBill()); 
		
   customer = seniorCustomer;		
System.out.println(customer.getName()+" "+customer.calculateBill());	
   }
   }
