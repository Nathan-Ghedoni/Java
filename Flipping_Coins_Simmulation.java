/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 10/17/2023
 * Program #7
 * File Name: Flipping_Coins_Simmulation.java
 */
import java.util.Scanner;
import java.util.Random;
public class Flipping_Coins_Simmulation {

    public static void main(String[] args) {
        //Use Scanner and Random objects for program.
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        //Calculate a random sequence of coin flips
        System.out.println("Welcome to the coin flip analyzer.");
        System.out.println("How many flips?");
        int numFlips = scnr.nextInt();
        char array[] = new char[numFlips];
        for (int i = 0; i < numFlips; ++i) {
            int coin = rand.nextInt(2);
            if (coin == 0)
                array[i] = 'H';
            else
                array[i] = 'T';
        }
        //Calculate length of each run and the total number of runs
        int runLength = 1;
        int runCount = 0;
        int runs[] = new int[30];
        for (int i = 1; i < numFlips; ++i) {
            char prevCoin = array[i - 1];
            if (prevCoin == array[i])
                runLength += 1;
            else if (prevCoin != array[i]) {
                //Switch used to count the amount of times each run Length occurs
                if (i != array.length) {
                    for (int j = 1; j < runs.length; ++j) {
                        if (runLength == j) {
                            runs[j] += 1;
                        }
                    }
                }
               //Track number of runs
               runCount += 1;
               runLength = 1;
            }
        }
        //Print Coin Flip Results
        System.out.print(array[0]);
        for (int i = 1; i < 50; ++i) {
            char prevCoin = array[i - 1];
            if (prevCoin == array[i])
                System.out.print(array[i]);
            else if (prevCoin != array[i]) {
                System.out.print(" ");
                System.out.print(array[i]);
            }    
        }
        System.out.println("...");
        //Indicate last non zero index in runs[] array.
        int lastNum = 0;
        for (int i = 1; i < runs.length; ++i) {
            if (runs[i] > 0)
                lastNum = i;
        }
        //Print out indexes
        for (int i = 1; i <= lastNum; ++i) {
            System.out.print("[" + i + "]");
            System.out.print(" = " + runs[i]);
            double runPercent = (((double)runs[i]) / ((double)runCount) * 100);
            System.out.print(" (");
            System.out.printf("%.1f", runPercent);
            System.out.println("%)");
        }
    }
}
