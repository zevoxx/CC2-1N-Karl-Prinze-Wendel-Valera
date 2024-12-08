//by: Karl Prinze Wendel F Valera       
//to: Ma'am Anna Rhodora M Quitaleg
//Lab Challenge 4: Grovery Discount Calculator
package activity.labchall4discountcalculator;
import java.util.Scanner;
public class LabChall4DiscountCalculator 
{
    // function for the calculation
    public static void discountCalculator(double totalPrice)
        {
        //declaration of double variables in this function
        double discount, totalDiscount, finalPrice;
        // 15% discount
        if (totalPrice > 10000) 
            {
            discount = 0.15;
            System.out.println("Discount applied: 15%");
            // calculation and printing for final price after discount
            totalDiscount = totalPrice * discount;
            finalPrice = totalPrice - totalDiscount;
            System.out.println("Final Prince After Discount: PHP " + finalPrice);
            }
            
        // 10% discount
        else if (totalPrice >= 5001 && totalPrice <= 10000) 
            { 
            discount = 0.10;
            System.out.println("Discount applied: 10%");
            // calculation and printing for final price after discount
            totalDiscount = totalPrice * discount;
            finalPrice = totalPrice - totalDiscount;
            System.out.println("Final Prince After Discount: PHP " + finalPrice);
            }
            
        // 5% discount
        else if (totalPrice >= 1000 && totalPrice <= 5000) 
            {
            discount = 0.05;
            System.out.println("Discount applied: 5%");
            // calculation and printing for final price after discount
            totalDiscount = totalPrice * discount;
            finalPrice = totalPrice - totalDiscount;
            System.out.println("Final Prince After Discount: PHP " + finalPrice);
            }
            
        // no discount
        else if (totalPrice >= 0 && totalPrice < 1000) 
            {
            System.out.println("Discount applied: none");
            System.out.println("Final Prince After Discount: PHP " + totalPrice);
            }

        // other invalid prices
        else
            {
            System.out.println(totalPrice + " is not a valid price");
            }        
        }       
    
    // function for price input and printing
    public static void run() 
        {  
        Scanner Obj = new Scanner(System.in); 
            
        // Userinput for price 
        System.out.print("\nEnter the total purchase amount: PHP ");
        double totalPrice = Obj.nextDouble(); 
            
        // calls out discountCalculator for the calculation
        discountCalculator(totalPrice);           
        }
    
    // main driving function
    public static void main(String[] args) 
        {
        Scanner Obj = new Scanner(System.in);
        System.out.println("KPWFV's Grocery Store \"Discount Promo\"!");
        while (true)
            {
            // calls out run function for price input and printing
            run();
            
            // to ask if user would like to shop again or not
            System.out.print("Would you like to shop again?(YES/NO): ");
            String reply = Obj.nextLine();
            if (reply.equalsIgnoreCase("no"))
                {
                System.out.print("Thank you for shopping with us!");
                break;
                }
            }
        }
}
//end of code