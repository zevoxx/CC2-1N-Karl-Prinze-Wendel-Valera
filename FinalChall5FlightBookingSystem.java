// By: Karl Prinze Wendel F Valera
// To: Ma'am Anna Rhodora M Quitaleg
// Final Challenge No. 5: Exception Handling Laboratory Challenges
/* 
note: Tye flight status is random for every program test, 
which means each program test has different flight status.
There is a chance that there are no available flights,
ahd there is a chance that all the flights are available
*/
package activity.finalchall5flightbookingsystem;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;
    // Custom exception for invalid date errors
    class InvalidDateException extends Exception {
        public InvalidDateException(String message) {
            super(message);
        }
    }
    
    class InvalidDate {
        public void processBook(int date) throws InvalidDateException {
            if (date < 1 || date > 31) {
                // gives this message if the date entered is invalid
                throw new InvalidDateException("Invalid Date: There are only 31 days in January 2025");
            }
        }
    }

    // Custom exception for cancelled flights
    class FlightCancelledException extends Exception {
        public FlightCancelledException(String message) {
            super(message);
        }
    }

    class FlightCancelled {
        public void processBook(String availability) throws FlightCancelledException {
            if (availability.equalsIgnoreCase("Flight Cancelled")) {
                // gives this message if the flight selected is cancelled
                throw new FlightCancelledException("THIS FLIGHT IS CANCELLED");
            }
        }
    }
    
    // Custom exception for no seats available errors
    class NoSeatsAvailableException extends Exception {
        public NoSeatsAvailableException(String message) {
            super(message);
        }
    }

    class NoSeatsAvailable {
        public void processBook(String availability) throws NoSeatsAvailableException {
            if (availability.equalsIgnoreCase("Flight Fully Booked")) {
                // gives this message if the flight selected has no more seats available
                throw new NoSeatsAvailableException("THIS FLIGHT IS FULLY BOOKED/NO SEATS AVAILABLE");
            }
        }
    }
public class FinalChall5FlightBookingSystem{
   
    public static void main(String[] args) {
        // creates objects for the exceptions
        NoSeatsAvailable noSeatsAvailable = new NoSeatsAvailable();
        FlightCancelled flightCancelled = new FlightCancelled();
        InvalidDate invalidDate = new InvalidDate();
        
        // declares and initializes hashmap to be used for conversion of the random numbers that will be made
        HashMap<Integer, String> situations = new HashMap<>();
        situations.put(0, "Flight Cancelled");
        situations.put(1, "Flight Fully Booked");
        situations.put(2, "Flight Available");
        situations.put(3, "Flight Cancelled");
        situations.put(4, "Flight Fully Booked");
        situations.put(5, "Flight Available");
        
        // details of the flights initialized 
        String [] flightDetails = new String[5];
        flightDetails[0] = "Flight 1 = 12:00 AM -> 4:00 AM"; 
        flightDetails[1] = "Flight 2 = 4:00 AM -> 8:00 AM";
        flightDetails[2] = "Flight 3 = 08:00 AM -> 12:00 PM";
        flightDetails[3] = "Flight 4 = 2:00 PM -> 4:00 PM";
        flightDetails[4] = "Flight 5 = 08:00 PM -> 12:00 AM";
                
        // creates 5 random mumbers for the flight status - "Cancelled", "Fully Booked", and "Available"
        Random random6SidedDice = new Random();
        int [] randNumSituations = new int [5];
        for (int i = 0; i < 5; i++){
            int diceRoll = random6SidedDice.nextInt(5);
            randNumSituations[i] = diceRoll;
        }
        
        String[] destination = {"Tokyo", "Seoul", "Beijing", "Exit"}; // button options for destinations
        String[] flight = {"Flight 1", "Flight 2", "Flight 3", "Flight 4", "Flight 5", "Back", "Exit"}; // button options for flight selection
        StringBuilder flightTicket = new StringBuilder(); // stringbuilder used to store and display the ticket
        StringBuilder flightList = new StringBuilder(); // string builder used to store and display the list of flights
        
        // appends the flight details to the flightList StringBuilder
        for (int i = 0; i < 5; i++){
            flightList.append("\n").append(flightDetails[i]).append(" - ").append(situations.get(randNumSituations[i]));
        }
        
        String enterName, dayOfTravel; // declaration of string variables for user input
        int flightChoice; // declaration of int variable for user input
        boolean run = true; // declaration of boolean variable for loop control
        

        // first dialog - welcoming dialog
        JOptionPane.showMessageDialog(null, "Welcome To KPWFV's Plane System", "Plane Ticket", JOptionPane.INFORMATION_MESSAGE);
        while (run){
            try{
                // user input dialog for date
                dayOfTravel = JOptionPane.showInputDialog(null, "Please enter the date of travel\nJanuary __, 2025\n<1-31>", "Date", JOptionPane.QUESTION_MESSAGE);
                
                // ends program if user clicks "cancel"
                if (dayOfTravel == null){
                    break;
                }
                // checks for errors in date input of the user
                invalidDate.processBook(Integer.parseInt(dayOfTravel));
            }
            catch (NumberFormatException nfe){ 
                JOptionPane.showMessageDialog(null, "INVALID CHARACTERS DETECTED\nPLEASE TRY INPUTTING DIGITS", "Date Input ERROR", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            // custom exception if user entered a number that is not a day of the month january
            catch (InvalidDateException ide){
                JOptionPane.showMessageDialog(null, ide.getMessage(), "Date Input ERROR", JOptionPane.WARNING_MESSAGE);
                continue;
            }
            // user input dialog for flight destination
            int destinationChoice = JOptionPane.showOptionDialog(null, "Where do you plan to fly to?\nManila->Tokyo\nManila->Seoul\nManila->Beijing", "Flight Destination", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,destination,destination);
            
            // exits program if user selected "Exit"
            if (destinationChoice == 3){
                break;
            }
            
            while (true){
                try{
                    // user input dialog for flight selection
                    flightChoice = JOptionPane.showOptionDialog(null, "Manila to " + destination[destinationChoice] + " Flight Schedules:\nPlane Departure -> Plane Arrival" + flightList + "\n\nCHOOSE FLIGHT", "Flight Options", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,flight,flight);
                    
                    // goes back to date input if user selected "Back"
                    if (flightChoice == 5){
                        break;
                    }
                    
                    // exits program if user selected "Exit"
                    if (flightChoice == 6){
                        run = false;
                        break;
                    }
                    noSeatsAvailable.processBook(situations.get(randNumSituations[flightChoice])); // checks if user selected a fully booked flight
                    flightCancelled.processBook(situations.get(randNumSituations[flightChoice])); // checks if user selected a cancelled flight
                }
                // custom exception for cancelled flights
                catch (FlightCancelledException fce){
                    JOptionPane.showMessageDialog(null, fce.getMessage(), "Flight Selection ERROR ", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                // custom exception for fully booked flights
                catch (NoSeatsAvailableException nsae){
                    JOptionPane.showMessageDialog(null, nsae.getMessage(), "Flight Selection ERROR", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                
                // checks if user selected an available flight then proceeds to the next step 
                if (situations.get(randNumSituations[flightChoice]).equalsIgnoreCase("Flight Available")){
                    // name input for the passenger
                    enterName = JOptionPane.showInputDialog(null, "Please enter the name of the passenger for this ticket", "Passenger Name", JOptionPane.QUESTION_MESSAGE);
                    
                    // ends program if user clicks "Cancel"
                    if(enterName == null){
                        run = false;
                        break;
                    }
                    // plane ticket details appended in the StringBuilder for display
                    flightTicket.append("----------------------------------------------------------------------------------").append("\n");
                    flightTicket.append("January ").append(dayOfTravel).append(", 2025").append("\n\n");
                    flightTicket.append("Manila -> ").append(destination[destinationChoice]).append("\n\n");
                    flightTicket.append(flightDetails[flightChoice]).append("\n\n");
                    flightTicket.append("Passenger: ").append(enterName).append("\n");
                    flightTicket.append("----------------------------------------------------------------------------------").append("\n");
                    
                    // dialog that displays the ticket
                    JOptionPane.showMessageDialog(null, "Flight Successfully Booked\nYour Ticket:\n" + flightTicket, "Booking Success", JOptionPane.INFORMATION_MESSAGE);
                    
                    // dialog that asks if there will be another transaction
                    int confirm = JOptionPane.showConfirmDialog(null, "Do you want to book another flight?","Confirmation",JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.NO_OPTION){
                        run = false;
                        break;
                    }
                    else {
                        break;
                    }
                }
            }
        }
        // displays exit dialog
        JOptionPane.showMessageDialog(null, "Thank you for choosing our airline", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }
}
