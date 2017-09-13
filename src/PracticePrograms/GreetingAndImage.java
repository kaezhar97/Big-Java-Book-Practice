
package PracticePrograms;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class GreetingAndImage
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
        "http://fugagaming.com/uploads/images/main_site/pict/linux.png");
        JOptionPane.showMessageDialog(null, "Bow to your Linux overlords", "Linux takeover",
        JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}