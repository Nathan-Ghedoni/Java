/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 09/09/2023
 * Program #2
 * File Name: AutomobileCosts.java
 */
import java.util.Scanner;
public class AutomobileCosts {

    public static void main(String[] args) {
        //Enable Input
        Scanner scnr = new Scanner(System.in);
  
        //Collect input values for gas car
        System.out.println("How many miles do you drive per year?"); 
        double milesDriven = scnr.nextDouble();
        System.out.println("What is the current price per gallon of gasoline?");
        double gasPrice = scnr.nextDouble();
        System.out.println("How many miles per gallon does your car get?");
        double mpg = scnr.nextDouble();
        
        //Gas car calculations
        final double LBS_CO2_PER_GALLON_E10 = 18.9; //pounds of CO2/gallon of E10 gasoline
        double gallonsPerYear = milesDriven / mpg;
        System.out.println("You use " + gallonsPerYear + " gallons of gas per year.");
        double totalGasPrice = gallonsPerYear * gasPrice;
        double gasCO2Produced = gallonsPerYear * LBS_CO2_PER_GALLON_E10;
        System.out.println("This costs $" + totalGasPrice + " and produces " + gasCO2Produced +  " lbs of CO2 pollution.");
        
        //Electric car values
        System.out.println("Now consider an electric car.");
        System.out.println("How many miles per kilowat hour (khw) does it get?");
        double kwh = scnr.nextDouble();
        System.out.println("What is the cost/kwh of your electricity (in cents)?");
        double kwhPrice = scnr.nextDouble();
        
        //Electric car calculations
        final double LBS_CO2_PER_KWH = 0.58815; //pounds of CO2/KWH
        double kwhPerYear = milesDriven / kwh;
        System.out.println("That electric car would use " + kwhPerYear + " kwh's of electricity per year.");
        double totalKwhPrice = (kwhPerYear * kwhPrice) / 100; //Divided by 100 to change cents to dollars
        double kwhCO2Produced = kwhPerYear * LBS_CO2_PER_KWH;
        System.out.println("This costs $" + totalKwhPrice + " and produces " + kwhCO2Produced + " lbs of CO2 pollution.");
        
        //Final calculations
        double moneySaved = totalGasPrice - totalKwhPrice;
        double co2Reduced = gasCO2Produced - kwhCO2Produced;
        System.out.println("This would save $" + moneySaved + " per year, and reduce carbon emissions by " + co2Reduced + " lbs.");
        
        //Lifetime calculations
        System.out.println("How many years do you expect to own the car?");
        double carLife = scnr.nextDouble();
        double lifeMoneySaved = moneySaved * carLife;
        double lifeCO2Reduced = co2Reduced * carLife;
        System.out.println("You are expected to save $" + lifeMoneySaved + " and reduce carbon emissions by " + lifeCO2Reduced + " lbs.");
        scnr.close();
    }

}
