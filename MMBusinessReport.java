//Matthew Manuel
// 1/16/21
// CS 140
// Lab #1
/// This program will do the following: Add weekly sales together to give a total number of WidgetX sold, then give an average of weekly Sales.
//I watched a video on methods to help clean up the code https://www.youtube.com/watch?v=cCgOESMQe44
public class MMBusinessReport {
   
   public static void main(String [] args){//This is the main method where I store Weekly_Sales method informatin
   /*Below enter the weekly sales numbers. Week 1 input the numbers followed by a <,>.  At the end of the month enter the three letter abbreviation
   for the month, example "Jan". */
   
      Weekly_Sales(9, 10, 11, 22, "Jan");
      Weekly_Sales(11, 8, 9, 13, "Feb");
      Weekly_Sales(9, 15, 18, 5, "Mar");
      
     } 
   public static void Weekly_Sales(int w1, int w2, int w3, int w4, String mon) {//I created a new method Weekly_Sales in order to compute sales information
      int monthlysales = w1 + w2 + w3 + w4;//monthly sales will hold the total number of widgetx sold
      String month = mon;//will hold the month stored weekly sales method 
      
      System.out.print("Your monthly Sales for " + month + " of WidgetX are:\n");
      System.out.println(monthlysales + " Sold ");
      double averagesales = monthlysales / 4.0;//Casting averagesales into a double to get accurate average
      System.out.printf("Your average weekly sales of WidgetX were: \n%.2f \n\n", averagesales);//%.2f to print only to two decimal places
      }//This ends the main method
    
}//This ends the program
 
