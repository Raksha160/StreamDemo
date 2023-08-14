package com.mystream;
import java.util.*;
import java.util.stream.*;


public class Qns1 {

	public static void main(String[] args) { 
		List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alexa", "Mumbai", "Type1", 4,  600));
        customers.add(new Customer("Anam", "Delhi","Type2", 2,  700));
        customers.add(new Customer("Bru", "Mumbai","Type1", 5,  450));
        customers.add(new Customer("Eni", "Mumbai","Type2", 6,  300));
        
        List<Customer> filteredByPlanRange = customers.stream().filter(customer -> customer.getPlanRange() > 3).collect(Collectors.toList());
        System.out.println("Customers with planRange above 3 months: " + filteredByPlanRange);
        
        List<Customer> filteredByAmount = customers.stream().filter(customer -> customer.getAmount() > 500).collect(Collectors.toList());
        System.out.println("Customers with amount above 500: " + filteredByAmount);
        
        customers.stream().filter(customer -> "Mumbai".equals(customer.getLocation())).forEach(customer -> {
            float discountedAmount = customer.getAmount() * 0.8f;
            customer.setAmount(discountedAmount);
            System.out.println("Customer: " + customer.getCustomerName() + ", Discounted Amount: " + discountedAmount);
        });
        
        boolean allPlanRangeAbove300 = customers.stream().allMatch(customer -> customer.getPlanRange() > 300);
        System.out.println("All customers' planRange above 300: " + allPlanRangeAbove300);
        
        boolean anyPlanRangeAbove600 = customers.stream().anyMatch(customer -> customer.getPlanRange() > 600);
        System.out.println("Any customer's planRange above 600: " + anyPlanRangeAbove600);
	}

}
