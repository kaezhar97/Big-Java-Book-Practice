/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PracticePrograms;
import javax.swing.JOptionPane;

/**
 *
 * @author Octavio
 */
public class HelloName
{
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name?");
        
        String input = JOptionPane.showInputDialog("Hello " + name + "!\n\nMy name is Hal, what would you like me to do?");
        
        System.out.println("I'm sorry, "+name+". I'm afraid I can't do that.");
    }
}
