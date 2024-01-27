import java.util.Scanner;
public class EnterGrade {

    public static void main(String[] args) {
        //Collect User's Grade
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter your grade");
        char userGrade = scnr.next().charAt(0);
        if (userGrade == 'A') {
            System.out.println("Excellent");
        }
        else if (userGrade == 'B') {
            System.out.println("Good");
        }
        else if (userGrade == 'C') {
            System.out.println("Average");
        }
        else if (userGrade == 'D') {
            System.out.println("Deficient");
        }
        else if (userGrade == 'F') {
            System.out.println("Failing");
        }
        else {
            System.out.println("Invalid Grade");
        }
        
        //Same Program but as a switch
        System.out.println("Enter your grade");
        userGrade = scnr.next().charAt(0);
        switch (userGrade) {
        case 'A':
            System.out.println("Excellent");
            break;
        case 'B':
            System.out.println("Good");
            break;
        case 'C':
            System.out.println("Average");
            break;
        case 'D':
            System.out.println("Deficient");
            break;
        case 'F':
            System.out.println("Failing");
            break;
        default:
            System.out.println("Invalid Grade");
        }
    }
}
