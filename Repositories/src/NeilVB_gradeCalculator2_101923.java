import java.util.Scanner;
public class NeilVB_gradeCalculator2_101923 
{
    public static void main (String [] args) 
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Input Your Grade: ");
        double grade = in.nextDouble();   
        char rating = 0;    
        if(grade<=100.0)
        { 
            if(grade>= 96.1) 
                rating = 'A';
            else  if (grade >= 88.1) 
                rating = 'B';
            else  if (grade >= 75.1) 
                rating = 'C';
            else  if (grade >= 60.1) 
                rating = 'D';
            else  if (grade <= 60.0) 
                rating = 'F';       
        }
        else
        { 
            System.out.println("\nInvalid Input!! ");
        }   
          
        System.out.println("\n=======Rating=======");
        System.out.println("Grade: "+grade);
        System.out.println("Rating: " +rating);
    }
}
    




