//By: Karl Prinze Wendel F Valera
//To: Ma'am Anna Rhodora M Quitaleg 
//September 12, 2024
//Lab Challenge: 3
package activity.cc2.n.valeraa;
import java.util.Scanner;
public class CC21NValeraa 
{
    public static void main(String[] args) 
        {
        Scanner Item = new Scanner(System.in);
        
        //declaration of all double variables
        float item1, quantity1, item2, quantity2, item3, quantity3, itemPrice1, itemPrice2, itemPrice3, subTotal, discount, discountedSubTotal, salesTax, finalTotal;
        //input for prices and quantity
        System.out.print("Enter the price of item 1\t: "); // item price 1
        item1 = Item.nextFloat();
        System.out.print("Enter the quantity of item 1\t: "); // item quantity 1
        quantity1 = Item.nextFloat();
        System.out.print("Enter the price of item 2\t: "); // item price 2
        item2 = Item.nextFloat();
        System.out.print("Enter the quantity of item 2\t: "); // item quantity 2
        quantity2 = Item.nextFloat();
        System.out.print("Enter the price of item 3\t: "); // item price 3
        item3 = Item.nextFloat();
        System.out.print("Enter the quantity of item 3\t: "); // item quantity 3
        quantity3 = Item.nextFloat();
    
        //computation of the input
        itemPrice1 = item1 * quantity1;
        itemPrice2 = item2 * quantity2;
        itemPrice3 = item3 * quantity3;
        subTotal = itemPrice1 + itemPrice2 + itemPrice3;
        discount = subTotal * 0.05f;
        discountedSubTotal = subTotal - discount;
        salesTax = discountedSubTotal * 0.12f;
        finalTotal = discountedSubTotal + salesTax;
    
        //output of the computation
        System.out.printf("Subtotal\t:PHP %.2f", subTotal); 
        System.out.printf("\nDiscount\t:PHP %.2f", discount); 
        System.out.printf("\nSales Tax\t:PHP %.2f", salesTax); 
        System.out.printf("\nFinal Total\t:PHP %.2f", finalTotal); 
    
        //end of code
        }  
}
