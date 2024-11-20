import java.util.Scanner;
public class NeilVB_percentageOfValue_090423 
{
    public static void main (String [] args) 
    {    
       Scanner sc = new Scanner (System.in);
       System.out.print("Input Desired Percentage: ");
       double percentageamount = sc.nextDouble();
       double percentagevalue = percentageamount / 100;
       System.out.print("Input your total Value Amount: ");
       double value = sc.nextDouble();
       double percentage = percentagevalue * value;
       System.out.printf("%.0f%% of %.1f is %.1f\n", percentageamount, value, percentage);
     }    
}
    