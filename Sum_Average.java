import java.util.Scanner;
public class Sum_Average {

    public static void main(String[] args) {
       //Collect two integers from user input
       Scanner scnr = new Scanner(System.in);
       System.out.println("Enter the first integer:");
       int num1 = scnr.nextInt();
       System.out.println("Enter the second integer:");
       int num2 = scnr.nextInt();
       //Calculate the sum of both integers
       int sum = num1 + num2;
       //Calculate the average of both integers
       double average = sum / 2.0; //Converts output into decimal value
       //Print results
       System.out.println("The Sum of the two integers are: " + sum);
       System.out.println("The Average of the two integers are: " + average);
       //Close scanner
       scnr.close();
    }

}
