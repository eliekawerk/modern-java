package com.dparreira.model;

public class Tester {

  public static void main(String[] args) {
    Customer customer = new Customer("first", "second", "daniel@gmail.com");
    System.out.println(customer);

    Customer customer2 = new Customer("first", "second", "daniel");
    System.out.println(customer2);
  }
}
