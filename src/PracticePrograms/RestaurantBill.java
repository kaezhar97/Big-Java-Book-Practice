/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PracticePrograms;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Octavio
 */
public class RestaurantBill
{
  public static void main (String args[])
  {
   int numberOfPeople;
   
   double totalPrice;
   double tip;
   double pricePerPerson;
   double tipPerPerson;
   double totalPerPerson;
   
   String input;
   
   
   
   input=JOptionPane.showInputDialog("What's the number of people?");
   Scanner scan = new Scanner(input);
   numberOfPeople=scan.nextInt();
   
   input=JOptionPane.showInputDialog("What's the total price in US dollars ($)?");
   scan = new Scanner(input);
   totalPrice=scan.nextDouble();
   
   tip=totalPrice*0.15;
   pricePerPerson=totalPrice/numberOfPeople;
   tipPerPerson=tip/numberOfPeople;
   totalPerPerson=pricePerPerson+tipPerPerson;
   
   System.out.printf("Number of people: %d\n",numberOfPeople);
   System.out.printf("Total price: $%.2f\n\n",totalPrice);
   System.out.printf("Amount each person has to pay (without tip): $%.2f\n",pricePerPerson);
   System.out.printf("Tip each person has to pay: $%.2f\n\n",tipPerPerson);
   System.out.printf("Total price each person has to pay: $%.2f\n",totalPerPerson);
   
   
  }
   
   
}
