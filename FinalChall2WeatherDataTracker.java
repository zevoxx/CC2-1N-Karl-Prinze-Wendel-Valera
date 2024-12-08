// By: Karl Prinze Wendel F Valera
// To: Ma'am Anna Rhodora M Quitaleg
// Final Challenge No. 2: Weather Data Tracker (2D array)
package activity.finalchall2weatherdatatracker;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;
public class FinalChall2WeatherDataTracker {

    public static void main(String[] args) {
        Random random = new Random(); // creates random class for random numbers
        HashMap<Integer, String> days = new HashMap<>(); // creates hashmap class for the days of the week
        days.put(0, "Sunday"); // converts "0" to "Sunday"
        days.put(1, "Monday"); // converts "1" to "Monday"
        days.put(2, "Tuesday"); // converts "2" to "Tuesday"
        days.put(3, "Wednesday"); // converts "3" to "Wednesday"
        days.put(4, "Thursday"); // converts "4" to "Thursday"
        days.put(5, "Friday"); // converts "5" to "Friday"
        days.put(6, "Saturday"); // converts "6" to "Saturday"
        
        
        StringBuilder listOfAll = new StringBuilder(); // declares string builder to be used in printing all data in one dialog
        StringBuilder city1 = new StringBuilder(); // declares string builder to be used in printing city 1 data in one dialog
        StringBuilder city2 = new StringBuilder(); // declares string builder to be used in printing city 2 data in one dialog
        StringBuilder city3 = new StringBuilder(); // declares string builder to be used in printing city 3 data in one dialog
        double [] totalPerCity = new double[3]; // declares array to be used in storing total temperatures
        double [] averagePerCity = new double[3]; // declares array to be used in storing average temperatures
        double [] highestPerCity = new double[3]; // declares array to be used in storing highest temperatures
        double [] lowestPerCity = new double[3]; // declares array to be used in storing lowest temperatures
        
        int row, col, i; // declares variables to be used in for loops
        
        
        double allTotal= 0, averageAll; // declares variables for average temperature of all
                
        
        int highestAll, lowestAll; // declares variables for highest and lowest of all
        
        
        // gives values to the 2D array
        int [][] temperatures = new int[3][7];
        for (row = 0; row < 3; row++){ // loops rows
            for (col = 0; col < 7;col++){ // loops columns
                temperatures[row][col] = random.nextInt(15, 26); // generates random numbers from 15 to 26 as temperatures
            }
        }
        
        
        // calculates for the total value of all 
        for (row = 0; row < 3; row++){ // loops rows
            for (col = 0; col < 7;col++){ // loops columns
                allTotal += temperatures[row][col];
                totalPerCity [row] += temperatures[row][col];
            }
        }
        
        
        // calculates for the average of all
        averageAll = allTotal / 21; // divides allTotal with the total number of days in all cities to get the average
        for(i = 0; i < 3; i++){
            averagePerCity [i] = totalPerCity [i] / 7;
        }

        highestAll = temperatures[0][0]; // initializes starting value
        lowestAll = temperatures[0][0]; // initializes starting value
        
        for (i = 0; i < 3; i++){
            highestPerCity[i] = temperatures[i][0]; // initializes values for highest per city
            lowestPerCity[i] = temperatures[i][0]; // initializes values for lowest per city
        }
        
        // checks for the highest values
        for (row = 0; row < 3; row++){ // loops rows
            for (col = 0; col < 7;col++){ // loops columns
                if (temperatures[row][col]>highestAll) {
                    highestAll = temperatures[row][col]; // gets the highest temperature from all cities
                }
                if (temperatures[row][col]>highestPerCity[row]){
                    highestPerCity[row] = temperatures[row][col]; // gets the highest temperature per city
                } 
            }
        }  
        
        
        // checks for the lowest values
        for (row = 0; row < 3; row++){ // loops rows
            for (col = 0; col < 7;col++){ // loops columns
                if (temperatures[row][col]<lowestAll) {
                    lowestAll = temperatures[row][col]; // gets the lowest temperature from all cities
                }
                if (temperatures[row][col]<lowestPerCity[row]){
                    lowestPerCity[row] = temperatures[row][col]; // gets the lowest temperature per city
                }
            }
        }
        
        
        // adds data to string builder for all
        for (row = 0; row < 3; row++){ // loops rows
            listOfAll.append("City ").append(row+1).append("\n");
            for (col = 0; col < 7;col++){ // loops columns
                // adds the days and their temperatures to string builder for all
                listOfAll.append(days.get(col)).append(" temperature: ").append(temperatures[row][col]).append("°C\n");
            }
            listOfAll.append("\n");
        }
        // adds the lowest, highest, and average temperature of all cities to string builder for all
        listOfAll.append("Lowest Temperature Recorded from All Cities: ").append(lowestAll).append("°C\n Highest Temperature Recorded from All Cities: ").append(highestAll).append("°C\n Average Temperature Recorded from All Cities: ").append(averageAll).append("°C");
        
        
        
        // adds data to string builder for city 1
        city1.append("City 1\n");
        for (i = 0; i < 7;i++){ // loops columns
            // adds the days and their temperatures to string builder for city 1
            city1.append(days.get(i)).append(" temperature: ").append(temperatures[0][i]).append("°C\n");
            }
        // adds the lowest, highest, and average temperature of all cities to string builder for city 1
        city1.append("\n").append("Lowest Temperature in City 1: ").append(lowestPerCity[0]).append("°C\n Highest Temperature in City 1: ").append(highestPerCity[0]).append("°C\n Average Temperature in City 1: ").append(averagePerCity[0]).append("°C\n\n");
        
        
        // adds data to string builder for city 2
        city2.append("City 2\n");
        for (i = 0; i < 7;i++){ // loops columns
            // adds the days and their temperatures to string builder for city 2
            city2.append(days.get(i)).append(" temperature: ").append(temperatures[1][i]).append("°C\n");
            }
        // adds the lowest, highest, and average temperature of all cities to string builder for city 2
        city2.append("\n").append("Lowest Temperature in City 2: ").append(lowestPerCity[1]).append("°C\n Highest Temperature in City 2: ").append(highestPerCity[1]).append("°C\n Average Temperature in City 2: ").append(averagePerCity[1]).append("°C\n\n");
        
        
        // adds data to string builder for city 3
        city3.append("City 3\n");
        for (i = 0; i < 7;i++){ // loops columns
            // adds the days and their temperatures to string builder for city 3
            city3.append(days.get(i)).append(" temperature: ").append(temperatures[2][i]).append("°C\n");
            }
        // adds the lowest, highest, and average temperature of all cities to string builder for city 3
        city3.append("\n").append("Lowest Temperature in City 3: ").append(lowestPerCity[2]).append("°C\n Highest Temperature in City 3: ").append(highestPerCity[2]).append("°C\n Average Temperature in City 3: ").append(averagePerCity[2]).append("°C\n\n");
        
        
        // displays the first dialog (welcoming dialog)
        JOptionPane.showMessageDialog(null, "Welcome To KPWFV's Weather Data Tracker", "Weather Data Tracker", JOptionPane.INFORMATION_MESSAGE);
        String[] cityOptions = {"All Cities", "City 1", "City 2", "City 3", "Exit"};
        String[] secondOptions = {"Back", "Exit"};
        while (true){
            // displays the second dialog
            int choice1 = JOptionPane.showOptionDialog(null, "Choose which city you would like to check", "City Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,cityOptions,cityOptions);
            
            if (cityOptions[choice1].equals("All Cities")){
                // displays dialog containing all city data
                int choice2 = JOptionPane.showOptionDialog(null, listOfAll, "All City Data", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,secondOptions,secondOptions);
                // breaks out of loop
                if (secondOptions[choice2].equals("Exit")){
                    break;
                }
            }
            
            else if (cityOptions[choice1].equals("City 1")){
                // displays dialog containing city 1 data
                int choice2 = JOptionPane.showOptionDialog(null, city1, "City 1 Data", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,secondOptions,secondOptions);
                // breaks out of loop
                if (secondOptions[choice2].equals("Exit")){
                    break;
                }
            }
            
            else if (cityOptions[choice1].equals("City 2")){
                // displays dialog containing city 2 data
                int choice2 = JOptionPane.showOptionDialog(null, city2, "City 2 Data", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,secondOptions,secondOptions); 
                // breaks out of loop
                if (secondOptions[choice2].equals("Exit")){
                    break;
                }
            }
            
            else if (cityOptions[choice1].equals("City 3")){
                // displays dialog containing city 3 data
                int choice2 = JOptionPane.showOptionDialog(null, city3, "City 3 Data", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,secondOptions,secondOptions);  
                // breaks out of loop
                if (secondOptions[choice2].equals("Exit")){
                    break;  
                }
            }
            
            // breaks out of loop
            else if (cityOptions[choice1].equals("Exit")){
                break;
            }
        }
        // displays exit dialog
        JOptionPane.showMessageDialog(null, "Closing Application", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }
}
