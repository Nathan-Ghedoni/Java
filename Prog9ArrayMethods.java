/*
 * NAME: Nathan Ghedoni
 * COS 160, Fall 2023, Prof. Song, 11/17/2023
 * Program #9
 * File Name: Prog9ArrayMethods.java
 */
public class Prog9ArrayMethods {

    public static void main(String[] args) {
        // daily low temperatures for Portland Maine Jan 1 - Dec 31 2018
        int[] tmin = {-17, -16, 7, 4, 0, -5, -12, 11, 20, 10, 32, 39, 16, 9, 
                3, 14, 25, 13, 11, 29, 28, 21, 22, 18, 12, 8, 13, 31, 
                23, 18, 10, 26, 3, 2, 21, 19, 17, 16, 13, 8, 24, 33, 
                24, 17, 27, 25, 27, 20, 21, 16, 37, 35, 28, 24, 31, 30, 
                30, 25, 34, 34, 32, 35, 32, 31, 31, 31, 29, 20, 22, 29, 
                23, 28, 32, 32, 24, 14, 8, 10, 18, 26, 30, 27, 33, 27, 
                24, 21, 32, 29, 41, 35, 31, 27, 28, 37, 26, 23, 30, 26, 
                26, 27, 25, 28, 42, 32, 27, 33, 37, 34, 38, 35, 31, 32, 
                32, 36, 47, 47, 40, 45, 43, 37, 33, 49, 50, 50, 51, 49, 
                43, 40, 45, 43, 45, 35, 37, 49, 50, 48, 47, 43, 37, 49, 
                44, 50, 52, 49, 50, 57, 48, 48, 54, 53, 52, 62, 55, 48, 
                46, 46, 50, 50, 52, 46, 47, 51, 47, 62, 54, 52, 51, 54, 
                55, 57, 51, 56, 51, 53, 54, 53, 50, 54, 61, 64, 65, 69, 
                64, 64, 68, 67, 60, 51, 52, 58, 59, 59, 58, 60, 56, 63, 
                62, 64, 63, 53, 54, 54, 58, 70, 68, 68, 67, 61, 67, 63, 
                59, 63, 64, 71, 70, 67, 66, 66, 71, 71, 70, 62, 58, 64, 
                65, 65, 69, 63, 58, 64, 58, 58, 56, 64, 57, 54, 58, 61, 
                65, 70, 71, 59, 53, 51, 58, 66, 68, 65, 66, 57, 52, 46, 
                46, 57, 65, 59, 57, 54, 59, 63, 63, 57, 52, 53, 47, 41, 
                42, 41, 63, 56, 50, 45, 46, 50, 49, 50, 56, 44, 42, 53, 
                47, 50, 55, 50, 41, 37, 33, 33, 39, 39, 30, 33, 38, 31, 
                29, 37, 37, 28, 25, 35, 37, 38, 35, 29, 42, 48, 45, 33, 
                31, 40, 43, 34, 27, 36, 26, 21, 35, 18, 15, 27, 30, 29, 
                31, 25, 16, 6, 4, 15, 34, 34, 33, 31, 29, 24, 30, 34, 
                33, 19, 15, 17, 18, 11, 12, 16, 10, 14, 7, 23, 25, 25, 
                32, 19, 17, 17, 31, 30, 21, 20, 18, 14, 20, 26, 24, 20, 
                27};

        int max = arrayMax(tmin);
        int min = arrayMin(tmin);
        double average = arrayAverage(tmin);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average temperature: " + average);
        //Search for index of values {0, 10, 20, ... 90}
        for (int i = 0; i <= 90; i+=10) {
            int index = arrayIndexOf(tmin, i);
            System.out.println("Index of " + i + ": " + index);
        }
    }
 
    // return the maximum value in the array
    public static int arrayMax(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max; 
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
}
