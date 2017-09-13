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
        System.out.println("Hello "+name);
    }
}
