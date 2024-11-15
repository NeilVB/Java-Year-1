import java.util.Scanner;
public class NeilVB_gradeCalculator_101623 {

    public static void main (String [] args) 
    {
        Scanner sc = new Scanner(System.in);
            int grade;
        System.out.print("Enter Student Grade: ");
            grade = sc.nextInt();
            String rating = (grade>100)?"Invalid Output!":(grade>=90)?"A":(grade>=80)?"B":(grade>=70)?"C":(grade>=60)?"D":"F";
        System.out.println("\n=====Output=====");    
        System.out.println("Student Score: "+grade +"\nGrade: "+rating);       
    }
}
