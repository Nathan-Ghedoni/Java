/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 09/28/2023
 * Program #4
 * File Name: Mia.java
 */
import java.util.Random;
public class Mia {

    public static void main(String[] args) {
        //First Player Rolling Two Random Dice
        Random randGen = new Random();
        int player1dice1 = randGen.nextInt(6) + 1;
        int player1dice2 = randGen.nextInt(6) + 1;
        
        //Swapping so first die is the higher value
        if (player1dice2 > player1dice1) {
            int tempVal = player1dice1;
            player1dice1 = player1dice2;
            player1dice2 = tempVal;
            //System.out.println("First player's roll is " + player1dice1 + " " + player1dice2);
        }
        
        //Preparing to compare dice rolls
        int rank1 = (player1dice1 * 10) + player1dice2;
        if (player1dice1 == player1dice2) {
            rank1 = 200 - rank1;
        }
        else if ((player1dice1 == 2) && (player1dice2 == 1)) {
            rank1 = 200 + rank1;
        }
        
        //Second Player Rolling Two Random Dice
        int player2dice1 = randGen.nextInt(6) + 1;
        int player2dice2 = randGen.nextInt(6) + 1;
        
        //Swapping so first die is the higher value
        if (player2dice2 > player2dice1) {
            int tempVal2 = player2dice1;
            player2dice1 = player2dice2;
            player2dice2 = tempVal2;
        }
        
      //Preparing to compare dice rolls
        int rank2 = (player2dice1 * 10) + player2dice2;
        if (player2dice1 == player2dice2) {
            rank2 = 200 - rank2;
        }
        else if ((player2dice1 == 2) && (player2dice2 == 1)) {
            rank2 = 200 + rank2;
        }
        System.out.println("First player's roll is " + player1dice1 + " " + player1dice2 + "\t" + "rank1 = " + rank1);
        System.out.println("Second player's roll is " + player2dice1 + " " + player2dice2 + "\t" + "rank2 = " + rank2);
        
        //Advising the second player
        if (rank1 > rank2) {
           System.out.println("You should bluff");
        }
        else if (rank2 > rank1) {
            System.out.println("You can announce your actual roll");
        }
        }
    }


