/*
Programmer: Sakanksh Jha
Date: September 26, 2023
Lab: Lab 2.5 Kohl's
File Name: KohlsProject
Description: This program inputs a users age, Kohl's discount card color, and their purchase price,
             and using this information, it returns the best discount to use as well as your discounted
             price.
 */


package org.example;
import java.util.*;
import java.text.DecimalFormat;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
        int discAmt;
        DecimalFormat money = new DecimalFormat("$0.00");
        System.out.println("Welcome to the Kohl's discount Calculator!");
       /*
        double redPrice;
        double bluePrice;
        double greenPrice;
        double seniorPrice;
        */
        double discountPrice = 10.0;

        int redCard = 30;

        double finalRed = 0.7;

        int blueCard = 25;

        double finalBlue = 0.75;

        int greenCard = 15;

        double finalGreen = 0.85;

        int seniorDiscount = 20;

        double finalSenior = 0.8;

        System.out.print("Please enter the color of your Kohl's discount card to begin: ");
        String cardColor = keyboard.nextLine();

        System.out.print("Great! Please enter your age to continue: ");
        int age = keyboard.nextInt();

        System.out.print("Finally, enter the amount of your original purchase: ");
        double purchasePrice = keyboard.nextInt();


        if ("red".equals(cardColor)){

            discountPrice = purchasePrice * finalRed;

            System.out.println("The best discount code to use here is the " + redCard + "%.");

                    } else if ("Red".equals(cardColor)) {

                        discountPrice = purchasePrice * finalRed;

                        System.out.println("The best discount code to use here is the " + redCard + "%.");

                                }  else if ("blue".equals(cardColor)){

                                            discountPrice = purchasePrice * finalBlue;

                                            System.out.println("The best discount code to use here is the " + blueCard + "%.");

                                            } else if ("Blue".equals(cardColor)){

                                                        discountPrice = purchasePrice * finalBlue;

                                                        System.out.println("The best discount code to use here is the " + blueCard + "%.");

                                                            }  else if (age > 62 && "green".equalsIgnoreCase(cardColor)){

                                                                        discountPrice = purchasePrice * finalSenior;

                                                                        System.out.println("The best discount code to use here is the " + seniorDiscount + "%.");

                                                                                    } else if (age < 62 && "green".equals(cardColor)){

                                                                                            discountPrice = purchasePrice * finalGreen;

                                                                                            System.out.println("The best discount code to use here is the " + greenCard + "%.");

                                                                                    }


            System.out.println("Your final cost after the discount is  " + money.format(discountPrice) + ".");



        /*
        input:
              Original Price - Last
              Customer Age - Second
              Discount Card Color - First (String after number messes it up)
       output:
              The better discount/what the discount is.
              Sale Price AFTER discount.
        */


    }
}
