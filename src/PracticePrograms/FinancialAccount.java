/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PracticePrograms;

/**
 *
 * @author Octavio
 */
public class FinancialAccount
{
    public static void main (String args[])
    {
        
        double interestRate= 0.05;
        double currentBalance=1000;
      
        
        for (int year=0;year<3;year++)
        {
            currentBalance +=(currentBalance*interestRate);
        }
        
        System.out.println(currentBalance);
        
    }
}
