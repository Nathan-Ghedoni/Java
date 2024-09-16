package flightpack;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
/**
 * This class executes methods from the MyAnalyzer class, using a array of Flight objects derived from a csv list of flights.
 * @author Nathan Ghedoni
 */
public class MyDataReader {
		
		public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd:HH");
		
		/**
		 * Reformats the LocalDateTime collected into yyyy-MM-dd:HH format.
		 * @param dateTimeString
		 * @return The local date and time in the yyyy-MM-dd:HH format.
		 */
		public static LocalDateTime dateConvert(String dateTimeString) {
			return LocalDateTime.parse(dateTimeString, formatter);
		}
		
		/**
		 * This method writes the contents read from a specified csv file onto a Flight object.
		 * @param inputLine The specified csv file.
		 * @return A flight object that contains the information from the specified csv file.
		 */
		private static Flight lineToReport(String inputLine) {
			String[] items = inputLine.split(",");
			String originName = items[0];
			String originCity = items[1];
			String originState = items[2];
			
			Airport origin = new Airport(originName, originCity, originState);
			Airport destination = new Airport(items[3], items[4], items[5]);
			
			int passenger = Integer.parseInt(items[6]);
			int seats = Integer.parseInt(items[7]);
			int distance = Integer.parseInt(items[8]);
			
			LocalDateTime flightDate = dateConvert(items[9]);
			
			return new Flight(origin, destination, seats, distance, passenger, flightDate);
		}
		
		/**
		 * This method reads a csv file into an array of flights.
		 * @param filePath The file path of the csv file.
		 * @return An array of flight objects that contains the information from the csv file.
		 */
		public static Flight[] readDataFile(String filePath) {
			Flight[] flights = new Flight[3000000];
			//Try block to check for exceptions
			try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
				//Declaring a new string
				br.readLine();
				String str;
				int currentIndex = 0;
				//It holds true until there is content in file
				while((str = br.readLine()) != null) {
					
					//Printing the file data
					flights[currentIndex] = lineToReport(str);
					currentIndex += 1;
				}
			}
				
				//Catch block to handle the exceptions
				catch(IOException e) {
					//Display pop up message if exception occurs.
					System.out.println("Error while reading a file");
				}
					
			return flights;				
		}

		public static void main(String[] args) {
			new MyAnalyzer();
			
			long start1 = System.currentTimeMillis();
			Flight[] flights = readDataFile(args[0]);
			long end1 = System.currentTimeMillis();
			long time1 = end1 - start1;
			System.out.println(time1 + " milliseconds to read the file.");
			
			long start2 = System.currentTimeMillis();
			ArrayList<String> maineAirports = MyAnalyzer.getAirports(flights, "ME");
			long end2 = System.currentTimeMillis();
			long time2 = end2 - start2;
			System.out.println("All airports located in Maine.");
			for (int i = 0; i < maineAirports.size(); i++) {
				System.out.println(maineAirports.get(i));
			}
			System.out.println(time2 + " milliseconds to locate all airports in Maine.");
			
			
			System.out.println("Max number of passengers traveling to PMW");
			long start3 = System.currentTimeMillis();
			System.out.println(MyAnalyzer.maxPassengers(flights, "PWM"));
			long end3 = System.currentTimeMillis();
			long time3 = end3 - start3;
			System.out.println(time3 + " milliseconds to calculate max number of passengers.");
			
			System.out.println("Percentage of flights with no empty seats");
			long start4 = System.currentTimeMillis();
			System.out.println(MyAnalyzer.percentageNoEmptySeats(flights));
			long end4 = System.currentTimeMillis();
			long time4 = end4 - start4;
			System.out.println(time4 + " milliseconds to calculate percentage of no empty seats.");
			
			System.out.println("Average number of passenger on flights from Portland Maine to Florida in 2009");
			long start5 = System.currentTimeMillis();
			System.out.println((int)MyAnalyzer.avgPassengerFromToState(flights, "PWM", "FL", 2009));
			long end5 = System.currentTimeMillis();
			long time5 = end5 - start5;
			System.out.println(time5 + " milliseconds to calculate average number of passengers on flights.");
			
		}
}
		
		
		
		
		
			
			


