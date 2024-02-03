/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 11/25/2023
 * Program #10
 * File Name: WeatherAnalysis.java
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;
public class WeatherAnalysis {
    
    //Finding the growing seasons
    //Number of days between last freezing day
    //in the spring and the first freezing day
    //in the fall. 
    //Freezing day is tmin of 32 or lower.
    public static int growingSeason(int[] tmin, int index) {
        int daysToLast = 0;
        int daysToFirst = 0;
        int totalDays = 0;
        //Count number of days since last freezing day
        //index - 1 ensures same day isn't counted twice
        for (int i = index - 1; i >= 0; --i ) {
            if(tmin[i] <= 32) {
                break;
            }
            else {
                daysToLast += 1;
            }
        }
        //Count number of days until first freezing day
        for (int i = index; i < tmin.length; ++i ) {
            if(tmin[i] <= 32) {
                break;
            }
            else {
                daysToFirst += 1;
            }
        }
        //return number of days in growing season
        totalDays = daysToLast + daysToFirst;
        return totalDays;
    }
    // return the maximum value in the array
    public static int arrayMax(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max; 
    }
    //return index of the first occurrence of a specified value
    public static int arrayIndexOf(int[] d, int key) {
        int index = -1; //index value to be returned
        
        for (int i = 0; i < d.length; ++i) {
            if (d[i] == key) {
                index = i;
                break;
            }
        }
        return index;
    }
    // return the minimum value in the array
    public static int arrayMin(int[] b) {
        int min = b[0];
        
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < min) {
                min = b[i];
            }
        }
        return min;
    }
    //return the average value of the array as a decimal
    public static double arrayAverage(int[] c) {
        double sum = 0;
        
        for (int i = 0; i < c.length; ++i) {
            sum += c[i];
        }
        double average = sum / c.length;
        return average;
    }

    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("G:/My Drive/COS 160 Java Programs/Homework/src/PortlandWeather1941to2018.txt");
        Scanner scnr = new Scanner(file);
        //Read the number of records in file
        int numRecords = scnr.nextInt();
        System.out.println("Total Number of Records");
        System.out.println(numRecords);
        //Integer Arrays for each column of data
        int[] month = new int[numRecords];
        int[] day = new int[numRecords];
        int[] year = new int[numRecords];
        int[] tmax = new int[numRecords];
        int[] tmin = new int[numRecords];
        
        //Discard remaining three header lines
        scnr.nextLine();
        scnr.nextLine();
        scnr.nextLine();
        
        //Include forward slashes in Scanner
        scnr.useDelimiter("[/ \t\n\r]+");
        //Store data in the five arrays
        for (int i = 0; i < numRecords; ++i) {
            month[i] = scnr.nextInt();
            day[i] = scnr.nextInt();
            year[i] = scnr.nextInt();
            tmax[i] = scnr.nextInt();
            tmin[i] = scnr.nextInt();
        }
        scnr.close();
        //Search for maximum temperature
        int maxTemp = arrayMax(tmax);
        int maxTempIndex = arrayIndexOf(tmax, maxTemp);
        System.out.println("Maximum Temperature of " + maxTemp + " Occured on");
        System.out.println(month[maxTempIndex] + "/" + day[maxTempIndex] + "/" + year[maxTempIndex]);
        
        //Search for minimum temperature
        int minTemp = arrayMin(tmin);
        int minTempIndex = arrayIndexOf(tmin, minTemp);
        System.out.println("Minimum Temperature of " + minTemp + " Occured on");
        System.out.println(month[minTempIndex] + "/" + day[minTempIndex] + "/" + year[minTempIndex]);
        
        //Find average maximum temperature
        double averageMax = arrayAverage(tmax);
        System.out.println("Average Maximum Temperature is");
        System.out.println(averageMax);
        
        //Find average minimum temperature
        double averageMin = arrayAverage(tmin);
        System.out.println("Average Minimum Temperature is");
        System.out.println(averageMin);
        //Finding the starting index of each year
        System.out.println("Year\tStarting Index");
        int yearStart = year[0];
        int yearEnd = year[numRecords - 1];
        int i = 0;
        int yearNum = 0;
        int startIndex = 0;
        while(yearNum < yearEnd) {
            yearNum = year[arrayIndexOf(year, yearStart + i)];
            startIndex = arrayIndexOf(year, yearStart + i);
            System.out.println(yearNum + "\t" + startIndex);
            ++i;
        }
        //Finding the growing seasons
        System.out.println("Year\tdays in growing season");
        yearStart = year[0];
        yearEnd = year[numRecords - 1];
        i = 0;
        yearNum = 0;
        startIndex = 0;
        int nextStartIndex = 0;
        int growingDays = 0;
        int[] totalGrowingDays = new int[yearEnd - yearStart + 1];
        while(yearNum < yearEnd) {
            yearNum = year[arrayIndexOf(year, yearStart + i)];
            startIndex = arrayIndexOf(year, yearStart + i);
            nextStartIndex = arrayIndexOf(year, yearStart + i + 1);
            growingDays = growingSeason(tmin, nextStartIndex - ((nextStartIndex - startIndex) / 2));
            totalGrowingDays[i] = growingDays;
            System.out.println(yearNum + "\t" + growingDays);
            ++i;
        }
        //Find average growing season days of first 10 years
        int[] firstGrowingDays = new int[10];
        for (int j = 0; j < firstGrowingDays.length; ++j) {
            firstGrowingDays[j] = totalGrowingDays[j];
        }
        System.out.println("Average Growing Season Days for the First 10 Years");
        System.out.println(arrayAverage(firstGrowingDays));
        
        //Find average growing season days for recent 10 years
        int[] lastGrowingDays = new int[10];
        for (int k = 0; k < lastGrowingDays.length; ++k) {
            lastGrowingDays[k] = totalGrowingDays[(totalGrowingDays.length - 10) + k];
        }
        System.out.println("Average Growing Season Days for the Last 10 Years");
        System.out.println(arrayAverage(lastGrowingDays));
    }

}
