package com.collectorandcollectors;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;


public class Ex1 {

	public static void main(String[] args) {
		List<Customer> customerList = new ArrayList<>();
		 
        customerList.add(new Customer("Alee","M","djgifg@gmail.com",new Location("Delhi","D")));
        customerList.add(new Customer("Bob","N","djghfg@gmail.com",new Location("Mumbai","M")));
        customerList.add(new Customer("Ann","A","djgkfg@gmail.com",new Location("Bangalore","B")));
        customerList.add(new Customer("Jitt","T","djgimg@gmail.com",new Location("Mysore","M")));
        customerList.add(new Customer("Pong","S","djaifg@gmail.com",new Location("Hassan","H")));
  
    List<String> customerInfoList = customerList.stream().map(customer -> customer.getFirstName() + " " + customer.getLastName() + " " +customer.getLocation().getLocationName() + ", " 
    + customer.getLocation().getState()).collect(Collectors.toList());

    
    System.out.println(customerInfoList);

	}

}
