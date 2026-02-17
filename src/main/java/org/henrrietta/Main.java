package org.henrrietta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your email address");
        String emailAd = sc.nextLine();


        Customer cust = new Customer();
        cust.setCustName(name);
        cust.setEmail(emailAd);

        System.out.println(cust.getCustName());
        System.out.println(cust.getEmail());
        System.out.println(cust.getDrinksPurchased());


        CoffeeItem item1 = new CoffeeItem(1,3.99);
        CoffeeItem item2 = new CoffeeItem(2,15.99);
        CoffeeItem item3 = new CoffeeItem(3,10);
        CoffeeItem item4 = new CoffeeItem(4,13.25);
        CoffeeItem item5 = new CoffeeItem(5,4.99);
        CoffeeItem item6 = new CoffeeItem(6,8.75);

        String answer;
        int num = 0;

        do{
            answer = "y";
            System.out.println("----- Welcome to Coffee Shop -----\n1. Coffee\n2. Matcha\n3.Hot Tea\n4.Breakfast sandwhich\n" +
                    "Crossiant\n6.Doughnuts ");
            System.out.println("How many drinks did you buy today?");
            switch(num)
            {
                case 1:
                    System.out.println("Coffee");
                case 2:
                    System.out.println("Matcha");
                case 3:
                    System.out.println("Hot Tea");
                case 4:
                    System.out.println("Breakfast sandwhich");
                case 5:
                    System.out.println("Crossiant");
                case 6:
                    System.out.println("Doughnuts");


            }
            while(true){
                System.out.println("Do you want to order again? (y/n)");
                answer = sc.next().toLowerCase();
                if (answer.equals("y") || answer.equals("n")){
                    break;
                }
                else {
                    System.out.println("Invalid input! Please enter your answer again!");
                }
            }

        }
        while(answer.equals("y"));



    }
}
