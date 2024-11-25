import java.util.Scanner;
import java.text.DecimalFormat;

public class NeilVB_productAverage_102624 
{
    public static void main(String[] args)
    {
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat(".00"); 
    DecimalFormat df2 = new DecimalFormat(".0"); 

        int numOfInputs = 0;
        int sum = 0; 
        int product = 1;
        char choice = 'Y';
        double number;
        
        System.out.println("==Keep Inputting Numbers==");
        do 
        {
        System.out.print("Please Input a number: ");
            if (in.hasNextDouble()) 
            {        
                number = in.nextDouble();              
                    sum += number; 
                    product *= number;  
                    numOfInputs++;             
                System.out.print("Y to Continue, Q to Quit(y/q): "); 
                choice = in.next().charAt(0); 
            }
            else 
            {
                System.out.println("Invalid input. Please enter a number.");   
                return;
            }             
        }
        while(choice == 'Y' || choice == 'y'); 
        
            if (choice == 'Q' || choice == 'q' ) 
            {
                double average = (double)sum / numOfInputs; 
                System.out.println("\n===================================================");
                System.out.println("The Product of the numbers is: "  +df2.format(product));
                System.out.println("The Average of the numbers is: " +df.format(average));
                System.out.println("===================================================");
            }
            else 
            {
                System.out.println("Invalid Option! Choose Y to continue or Q to quit.");   
            }                            
    }
}