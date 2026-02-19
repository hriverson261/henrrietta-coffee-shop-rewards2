package org.henrrietta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name: ");
        String name = sc.next();
        System.out.println("Please enter your email address");
        String emailAd = sc.next();


        Customer cust = new Customer(name,emailAd);

        CoffeeItem item1 = new CoffeeItem("Coffee",3.99);
        CoffeeItem item2 = new CoffeeItem("Matcha",7.99);
        CoffeeItem item3 = new CoffeeItem("Hot Tea",11.00);

        double itemPriceOne = item1.getPrice();
        double itemPriceTwo = item2.getPrice();
        double itemPriceThree = item3.getPrice();
        String answer;

        int num = 0;
        double total = 0;
        int drinkTotal = 0;
        int drinkSum = 0;

        do{
            answer = "y";
            System.out.println("----- Welcome to Coffee Shop -----\n1. Coffee     $" + itemPriceOne +"\n2. Matcha     $" + itemPriceTwo+
                    "\n3.Hot Tea     $" + itemPriceThree);
            switch(num)
            {
                case 1:
                    System.out.println(item1);

                case 2:
                    System.out.println(item2.getItemName());
                case 3:
                    System.out.println(item3.getItemName());

            }
            System.out.println("What would you like to order: ");
            int order = sc.nextInt();
            if(order == 1){
                total += item1.getPrice();
                drinkTotal++;
            }
            else if (order == 2){
                total += item2.getPrice();
                drinkTotal++;

            }
            else if (order == 3){
                total += item3.getPrice();
                drinkTotal++;
            }
            else{
                System.out.println("Please try again");
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


        System.out.println("Thank you for ordering at Code Coffee!");
        System.out.println("Customer: " + cust.getCustName()+ " | " + " Drinks toward reward: " + drinkTotal
        + "\n" + cust.getCustName()+ " purchased a total of " + drinkTotal + " for " + "$"+ total + "!");

        cust.setDrinksPurchased(drinkTotal);
        drinkSum = cust.getDrinksPurchased();
        CoffeeItem.freeOrder(drinkSum,total);
    }
}
