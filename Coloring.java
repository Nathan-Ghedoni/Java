/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 10/24/2023
 * Program #6
 * File Name: Coloring.java
 */
import java.awt.*;
public class Coloring {

    public static void main(String[] args) {
        //Create drawing panel
        DrawingPanel panel = new DrawingPanel(800, 800);
        Graphics g = panel.getGraphics();
        
        //Create variable for adjusting y position
        int y = 0;
        for (int i = 0; i < 4; ++i) {
          //Create first row of circles
            for (int x = -50; x < 850; x += 25) {
                g.setColor(Color.black);
                g.drawOval(x, y, 100, 100);
                g.setColor(Color.white);
                g.fillOval(x, y, 100, 100);
            }
          //Second row of circles going opposite direction
            y += 100;
            for (int x = 850; x > -100; x -= 25) {
                g.setColor(Color.black);
                g.drawOval(x, y, 100, 100);
                g.setColor(Color.white);
                g.fillOval(x, y, 100, 100);
            }
            y += 100;
        }
        //Create a final border around the drawing
        g.setColor(Color.black);
        g.drawLine(0, 0, 0, 800);
        g.drawLine(0, 0, 800, 0);
        g.drawLine(798, 0, 798, 800);
        g.drawLine(0, 798, 800, 798);
}
}
  