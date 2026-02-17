package org.henrrietta;

public class CoffeeItem {
    private int itemNum;
    private double price;

    public CoffeeItem(int itemNum, double price){
        this.itemNum = itemNum;
        this.price = price;
    }

    //Getters
    public int getItemName(){
        return itemNum;
    }

    public double getPrice(){
        return price;
    }

    //Setters
    public void setItemNum(int itemNum){
        this.itemNum = itemNum;
    }

    public void setPrice(double price){
        this.price = price;}

    public static void buyMore(String answer){
        while(answer.equals("y")){

        }
    }

}
