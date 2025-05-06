package com.codedifferently.labs.partA;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Tariq";
        String itemDesc = " Cars";
        String message = custName+" wants to purchase a "+itemDesc;

        // Declare and initialize numeric fields: price, tax, quantity.
        double price = 32000;
        double tax = 1000;
        int quantity = 2;


        // Declare and assign a calculated totalPrice
        double totalTax;
        double totalPrice;
        double totalCost;

        totalTax = tax * quantity;
        totalPrice = price * quantity;
        totalCost = totalTax + totalPrice;

        // Modify message to include quantity

        System.out.println(custName + " wants to purchase " + quantity+itemDesc);

        // Print another message with the total cost
        System.out.println("Total cost with tax is " + totalCost);

        boolean USD = true;
        boolean euro = true;
        boolean pounds = true;
        boolean rupee = true;
        boolean yen = true;
        boolean CYN = true;

        double USD1;
        double euro1;
        double pounds1;
        double rupee1;
        double yen1;
        double CYN1;

        USD1 = 1.00 * totalCost;
        euro1 = 0.94 * totalCost;
        pounds1 = 0.82 * totalCost;
        rupee1 = 68.32 * totalCost;
        yen1 = 115.84 * totalCost;
        CYN1 = 6.92 * totalCost;




        if(USD == true){
            System.out.println("in US Dollar this is: " + USD1);
        }
        if(euro == true){
            System.out.println("in Euros this is: " + euro1);
        }
        if(pounds == true){
            System.out.println("in British Pounds this is: " + pounds1);
        }
        if(rupee == true){
            System.out.println("in Indian Rupee this is: " + rupee1);
        }
        if(yen == true){
            System.out.println("in Japanese Yen this is: " + yen1);
        }
        if(CYN == true){
            System.out.println("in Chinese Yuan Renminbi this is: " + CYN1);
        }
    }
}
