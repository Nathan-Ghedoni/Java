/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 09/22/2023
 * Program #3
 * File Name: SoupCan.java
 */
import java.awt.*; 
public class SoupCan {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(257, 423);
        Graphics g = panel.getGraphics();
        panel.setBackground(new Color(230, 209, 194));
        //Draw Bottom of Can (Grey Circle)
        g.setColor(new Color(156, 156, 156));
        g.fillOval(35, 357, 189, 42);
        
        //Draw White Rectangle
        g.setColor(Color.WHITE);
        g.fillRect(35, 230, 189, 144);
        
        //Draw White Circle
        g.setColor(Color.WHITE);
        g.fillOval(35, 330, 189, 65);
        
        //Draw Red Rectangle
        g.setColor(new Color(181, 39, 28));
        g.fillRect(35, 72, 189, 144);
        
        //Draw Red Circle
        g.setColor(new Color(181, 39, 28));
        g.fillOval(35, 178, 189, 78);
        
        //Draw Top of Can (Grey Circle)
        g.setColor(new Color(156, 156, 156));
        g.fillOval(35, 48, 189, 42);
        
        //Draw Gold Circle
        g.setColor(new Color(161, 159, 91));
        g.fillOval(98, 218, 65, 60);
        
        //Text on Can
        //Campbell's
        g.setColor(Color.WHITE);
        g.setFont(new Font("Serif", Font.ITALIC, 35));
        g.drawString("Campbell's", 45, 120);
        //Condensed
        g.setFont(new Font("Arial", Font.BOLD, 15));
        g.drawString("CONDENSED", 75, 180);
        //Tomato
        g.setColor(new Color(181, 39, 28));
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.drawString("TOMATO", 55, 324);
        //Soup
        g.setColor(new Color(161, 159, 91));
        g.setFont(new Font("Times New Roman", Font.BOLD, 35));
        g.drawString("SOUP", 80, 364);
    }

}
