import java.text.DecimalFormat;
import java.util.Scanner;

public class NeilVB_TermGrade_092023 {
    
    public static void main (String [] args) {
        
        Scanner in = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat(".00");

        String name,studentcourse;
   
        Double assestment1, assestment2, assestment3; 
        Double classStanding;
        Double interim1grade, mmeGrade;

        Double Finassestment1, Finassestment2, Finassestment3; 
        Double classStandingF;
        Double interim2grade, mmeGrade2;
        
            System.out.println("==============STUDENT INFORMATION==============");
            System.out.print("Enter Student Name: ");
                name = in.nextLine();
            System.out.print("Enter Student Course: ");    
                studentcourse = in.nextLine();
                        System.out.println("");  
                        
            System.out.println("===============GRADE COMPUTATION===============");
                        System.out.println("");                   
            System.out.println("===Midterm====");
            System.out.print("Enter Assestment 1: ");
                assestment1 = in.nextDouble();
            System.out.print("Enter Assestment 2: ");    
                assestment2 = in.nextDouble();
            System.out.print("Enter Assestment 3: ");    
                assestment3 = in.nextDouble();                
            System.out.print("Enter Class Standing: ");
                classStanding = in.nextDouble();
            System.out.print("Enter Interim1 Grade: ");    
                interim1grade = in.nextDouble();
            System.out.print("Enter Midterm Major Exam Grade: ");    
                mmeGrade = in.nextDouble();       
                        System.out.println(""); 
                
                  System.out.println("===Final Term====");                
            System.out.print("Enter Assestment 1: ");
                Finassestment1 = in.nextDouble();
            System.out.print("Enter Assestment 2: ");    
                Finassestment2 = in.nextDouble();
            System.out.print("Enter Assestment 3: ");    
                Finassestment3 = in.nextDouble();                
            System.out.print("Enter Class Standing: ");
                classStandingF = in.nextDouble();
            System.out.print("Enter Interim2 Grade: ");    
                interim2grade = in.nextDouble();
            System.out.print("Enter Midterm Major Exam Grade: ");    
                mmeGrade2 = in.nextDouble();      
                           
        //Midterm Period Grade
        double midtermperiodgrade,midsum,midave,cstanding1,interim1val,midexam1;       
                midsum = ((assestment1 + assestment2 + assestment3));
                midave = ((midsum / 3)*.20);
                cstanding1 = (classStanding * .10);
                interim1val = (interim1grade *.30);
                midexam1 = (mmeGrade * .40);                      
                midtermperiodgrade = ( midave + cstanding1 + interim1val + midexam1);
                                  
        //Final Period Grade
        double finalperiodgrade,finalsum,finalave,cstanding2,interim2val,midexam2;               
                finalsum = ((Finassestment1 + Finassestment2 + Finassestment3));
                finalave = ((finalsum / 3)*.20);
                cstanding2 = (classStandingF * .10);
                interim2val = (interim2grade *.30);  
                midexam2 = (mmeGrade2 * .40);
                finalperiodgrade = ( finalave + cstanding2 + interim2val + midexam2);                   
        
        //Term Grade  
        double termgrade = ((midtermperiodgrade*.40)+(finalperiodgrade*.60));
                 
        //Display
                        System.out.println(""); //spacing 
            System.out.println("====FINAL COURSE====");  
            System.out.print("Student Name:" +name); System.out.print("\tCourse Enrolled:" +studentcourse);
                        System.out.println(""); //spacing
            System.out.print("Miderm Period Grade: " +df.format(midtermperiodgrade)); System.out.print("\tFinal Period Grade:  " + df.format(finalperiodgrade));
                        System.out.println(""); //spacing
            System.out.print("Term Grade: "+df.format(termgrade)); 
                        System.out.println(""); //spacing       
    }
}