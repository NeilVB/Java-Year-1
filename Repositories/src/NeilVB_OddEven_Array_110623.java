//Odd Even
import java.util.Scanner;
public class NeilVB_OddEven_Array_110623 
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);       
        int num[]= new int[10];
            for(int x=0;x<num.length;x++)
            {
            System.out.print("Enter Number: ["+x+"] = " );
            num[x]=in.nextInt();            
            }      
            String evenlist="",oddlist="";
            for (int ctr=0;ctr<num.length;ctr++)
            {
                if(num[ctr]%2==0)
                        evenlist+=num[ctr]+ " ";
                else
                    oddlist +=num[ctr]+ " ";       
            }           
            System.out.println("\nList of Even Numbers: " +evenlist);
            System.out.println("\nList of Odd Numbers: " +oddlist);
    }
}
