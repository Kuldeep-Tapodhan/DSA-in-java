/***
 Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

 A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate.
 Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms
 from the restaurant to the delivery point. The delivery charges are as mentioned below:

 first 3 km->$0
 next 3 km->$1;
 remaining km->$2

 Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point,
 implement a program to calculate the final bill amount to be paid by a customer.

 The below information must be used to check the validity of the data provided by the customer:

 Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

 Distance in kms must be greater than 0.

 Quantity ordered should be minimum 1.

 If any of the input is invalid, the bill amount should be displayed as -1.   code donde


 sample output:
 Food Type	Quantity Ordered	Distance (kms)	Expected Output
 N	          2                 	3           	30
 V	          1                    	7	            17

 */

import java.util.Scanner;


public class FoodCornerHomeDelivery {

    static int Bill(char ftype,int q,int d){
        if((ftype!='N' && ftype!='V') &&q<0 || d<0)return -1;
        int foodcost=0;
        int delivelrycharges=0;
        if (ftype=='V'){
            foodcost=12*q;
            if (d<=3){
                delivelrycharges=0;
            } else if (d>3 && d<=6) {
                delivelrycharges=1;
            }
            else {
                delivelrycharges=d*2-1;
            }
        }
        else {
            foodcost=15*q;
            if (d<=3){
                delivelrycharges=0;
            } else if (d>3 && d<=6) {
                delivelrycharges=1;
            }
            else {
                delivelrycharges=d*2-1;
            }
        }
        return foodcost+delivelrycharges;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Food Type:");
        char ftype=sc.next().charAt(0);
        System.out.println("Enter Quantity:");
        int quantity=sc.nextInt();
        System.out.println("Enter Distance:");
        int distance=sc.nextInt();

        int result= Bill(ftype,quantity,distance);
        System.out.println("Total payable amount is:"+result);


    }
}
