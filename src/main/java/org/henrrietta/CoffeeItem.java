package org.henrrietta;

public class CoffeeItem {
    private String itemName;
    private double price;

    public CoffeeItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    //Getters

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }


 //Setters

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void freeOrder(int drinkCount, double total){
        if (drinkCount >= 5){
            System.out.println("Reward reached! Your order is free!\n Total: $" + 0);
        }

        else{
            int drinkRemain = 5 - drinkCount;
            System.out.println("Your rewards were not reached. You need a purchase of " + drinkRemain + " more drinks to receive your order for free. " +
                    "Your total is: $" + total);
        }


    }



}
