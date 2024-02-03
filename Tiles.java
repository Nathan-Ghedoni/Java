/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 11/09/2023
 * Program #8
 * File Name: Tiles.java
 */
import java.awt.*;
public class Tiles {
    //Draw a tile with n squares
    //with upper left corner at (x, y) and with size (width X height) pixels
    public static void squaresTile(Graphics2D g, int x, int y, 
                                 int width, int height, int n) {
        for (int i = 0; i < n * 5; i += 5) {
            g.drawRect(x + i, y + i, width - (i * 2), height - (i * 2));
        }
    }
    //Draw a tile with n circles
    //with upper left corner of circle at (x, y) and with size (width X height) pixels
    public static void ringsTile(Graphics2D g, int x, int y,
                                int width, int height, int n) {
        g.drawRect(x, y, width, height);
        for (int i = 0; i < n * 5; i += 5) {
            g.drawOval(x + i, y + i, width - (i * 2), height - (i * 2));
        }
    }
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400,400);
        Graphics2D g = panel.getGraphics();
        for (int i = 0; i < 400; i+=50) {
            for (int j = 0; j < 400; j+=50) {
                int quotient = j / 50; //Return either an odd or even integer
                if (quotient % 2 == 0) {
                    squaresTile(g, 0 + j, 0 + i, 50, 50, 5);
                    continue;
                }
                ringsTile(g, 0 + j, 0 + i, 50, 50, 5);
            }   
        }
    }

}
