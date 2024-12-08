// By: Karl Prinze Wendel F Valera
// To: Ma'am Anna Rhodora M Quitaleg
// Final Challenge No. 5: Exception Handling Laboratory Challenges
package activity.finalchall5bankingsystem;
import javax.swing.JOptionPane;
import java.util.Random;
    // Custom exception for pin errors
    class WrongPin extends Exception {
        public WrongPin(String message) {
            super(message);
        }
    }

    class PinService {
        public void processPin(int pinCheck, int pin) throws WrongPin {
            if (pinCheck != pin) {
                // gives this message if the pin inputted is wrong
                throw new WrongPin("WRONG PIN\nTRY AGAIN");
            }
        }
    }
    
    // Custom exception for insufficient funds errors
    class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    class InsufficientFunds {
        public void processWithdraw(double balance) throws InsufficientFundsException {
            if (0 > balance) {
                // gives this message if the balance is insufficient
                throw new InsufficientFundsException("INSUFFICIENT FUNDS: you dont have that much money");
            }
        }
    }

    // Custom exception for withdraw errors
    class WithdrawException extends Exception {
        public WithdrawException(String message) {
            super(message);
        }
    }

    class WithdrawService {
        public void processWithdraw(double withdrawMax, double withdrawAmount) throws WithdrawException {
            if (withdrawMax < withdrawAmount) {
                // gives this message if the amount exceeds withdraw limit
                throw new WithdrawException("INVALID WITHDRAWAL: reached withdrawal limit");
            }
        }
    }

    // Custom exception for deposit errors
    class DepositException extends Exception {
        public DepositException(String message) {
            super(message);
        }
    }

    class DepositService {
        public void processDeposit(double depositMax, double depositAmount) throws DepositException {
            if (depositMax < depositAmount) {
                // gives this message if the amount exceeds deposit limit
                throw new DepositException("INVALID DEPOSIT: reached deposit limit");
            }
        }
    }
public class FinalChall5BankingSystem {
    
    public static void main(String[] args) {
        Random randomPin = new Random(); // creates random class for random numbers  
        double inputAmount, balance = 42069, withdrawMax = 20000, depositMax = 50000; // declaration of doubles
        double max [] = new double[2]; // double array for max amounts
        max [0] = withdrawMax; 
        max [1] = depositMax; 
        boolean run, temp = true; // declaration of boolean variables, which are used to control while loops
        String enterPin, amount = ""; // declaration of strings
        int pin = randomPin.nextInt(1000,9999);
        JOptionPane.showMessageDialog(null, "Welcome To KPWFV's Bank System", "Bank System", JOptionPane.INFORMATION_MESSAGE);
        StringBuilder card = new StringBuilder(); // string builder used to store and display the pretend card
        card.append("\"Pretend\" card");
        card.append("\n-----------------------------------------------------------");
        card.append("\n|                                                                        |");
        card.append("\n|  ATM CARD                                                   |");
        card.append("\n|                                                                        |");
        card.append("\n|  PIN: ").append(pin).append("                                                      |");
        card.append("\n|                                                                        |");
        card.append("\n|  \"UserName\"                                                |");
        card.append("\n|                                                                        |");
        card.append("\n-----------------------------------------------------------");
        
        // creates objects for the exceptions
        PinService paymentService = new PinService();
        WithdrawService withdrawService = new WithdrawService();
        DepositService depositService = new DepositService();
        InsufficientFunds insufficientFunds = new InsufficientFunds();
        
        while (true){
            try {
                // dialog where the user enters the 4 digit pin
                enterPin = JOptionPane.showInputDialog(null, card + "\n\n\nPlease enter your PIN", "Log in", JOptionPane.QUESTION_MESSAGE);
                paymentService.processPin(Integer.parseInt(enterPin), pin); // checks if pin does not match
                if (Integer.parseInt(enterPin) == pin){
                    JOptionPane.showMessageDialog(null, "WELCOME USER", "LOG IN SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            } 
            // exception if the user inputs the wrong pin
            catch (WrongPin wp) {
                JOptionPane.showMessageDialog(null, wp.getMessage(), "LOG IN FAILED", JOptionPane.WARNING_MESSAGE);
            }
            // exception if user inputs characters that are not numbers
            catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "INVALID CHARACTERS DETECTED\nPLEASE TRY INPUTTING DIGITS", "LOG IN FAILED", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        String[] actionChoice = {"Withdraw", "Deposit", "Exit"}; // button options
        while (true){
            // transaction choice dialog 
            int choice1 = JOptionPane.showOptionDialog(null, "Would you like to withdraw or deposit? \nYour Balance:" + balance, "Transaction Selection", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null,actionChoice,actionChoice);
            // breaks out if user clicked "Exit"
            if (choice1==2){
                break;
            }
            run = true;
            while (run){
                try{
                    // input for amount to be withdrawn/deposited
                    amount = JOptionPane.showInputDialog(null, "Please enter the amount that you would like to " + actionChoice[choice1] + "\nYour Balance: " + balance + "\nMax " + actionChoice[choice1] + ": " + max[choice1], actionChoice[choice1], JOptionPane.QUESTION_MESSAGE);
                    if (amount == null){
                        break;
                    }
                    inputAmount = Double.parseDouble(amount);
                    if (choice1 == 0){
                        balance -= inputAmount; // to get new balance after transaction
                        withdrawService.processWithdraw(withdrawMax, inputAmount); // checks for errors
                        insufficientFunds.processWithdraw(balance); // checks for errors
                    }
                    else if (choice1 == 1){
                        balance += inputAmount; // to get new balance after transaction
                        depositService.processDeposit(depositMax, inputAmount); // checks for errors
                    }
                    
                    if (choice1==0){
                        // proceeds with the transaction if no errors
                        if (withdrawMax >= Double.parseDouble(amount) && balance >= Double.parseDouble(amount)){
                            JOptionPane.showMessageDialog(null, amount + " Has been withdrawn" + " \nNew Balance: " + balance, actionChoice[choice1], JOptionPane.INFORMATION_MESSAGE);
                            temp = false;
                        }
                    }
                    else if(choice1==1){
                        // proceeds with the transaction if no errors
                        if (depositMax >= Double.parseDouble(amount)){
                            JOptionPane.showMessageDialog(null, amount + " Has been deposited" + " \nNew Balance: " + balance, actionChoice[choice1], JOptionPane.INFORMATION_MESSAGE);
                            temp = false;
                        }
                    }
                }
                // exception if the user did not input digits
                catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "INVALID CHARACTERS DETECTED\nPLEASE TRY INPUTTING DIGITS", "Error", JOptionPane.WARNING_MESSAGE);
                }
                // exception for withdrawal that exceeds withdraw limit
                catch(WithdrawException we){
                    JOptionPane.showMessageDialog(null, we.getMessage(), "Max Withdraw Error", JOptionPane.WARNING_MESSAGE);
                    inputAmount = Double.parseDouble(amount);
                    balance += inputAmount; // adds back the attempted withdrawal
                }
                // exception for insufficient funds
                catch(InsufficientFundsException ife){
                    JOptionPane.showMessageDialog(null, ife.getMessage(), "Insufficient Funds Error", JOptionPane.WARNING_MESSAGE);
                    inputAmount = Double.parseDouble(amount);
                    balance += inputAmount; // adds back the attempted withdrawal
                }
                // exception for deposit that exceeds deposit limit
                catch(DepositException de){
                    JOptionPane.showMessageDialog(null, de.getMessage(), "Max Deposit Error", JOptionPane.WARNING_MESSAGE);
                    inputAmount = Double.parseDouble(amount);
                    balance -= inputAmount; // returns the attempted deposit
                }
                finally{
                run = temp; // loop control
                }
            }    
            // dialog that asks if there will be another transaction
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to do another transaction?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.NO_OPTION){
                break;
            }
        }
        // displays exit dialog
        JOptionPane.showMessageDialog(null, "Thank you for choosing our bank", "Exit", JOptionPane.INFORMATION_MESSAGE);
    }
}
