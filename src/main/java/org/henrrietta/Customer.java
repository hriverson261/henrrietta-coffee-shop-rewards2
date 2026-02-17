package org.henrrietta;

public class Customer {
    private String name;
    private String email;
    private int drinksPurchased;

    public Customer(){
        this.name = name;
        this.email = email;
        this.drinksPurchased = drinksPurchased;
    }

    // Get the customer name, phone number, # of points
    public String getCustName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getDrinksPurchased(){
        return drinksPurchased;
    }

    // Using the set method to pass the customer name, phone number, and points
    public void setCustName(String name) {
        this.name = name;
    }

    public void setEmail(String phoneNumber){
        this.email = phoneNumber;
    }

    public void setDrinksPurchased(int drinksPurchased){
        this.drinksPurchased = drinksPurchased;
    }

    public static int pointsEarned(int drinksPurchased){
        if

        return 1;
    }
}
