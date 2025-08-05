import java.util.*;

public class Student_Grade_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Students = ");
        int num_s = sc.nextInt();
        int[] T_marks = new int[num_s];
        double[] percentage = new double[num_s];
        

        for (int i = 0; i < num_s; i++) {
            System.out.println("\nEnter the student " + (i+1) + " student marks =\n");
            int marks = 0;
            int total=0;
            
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    System.out.println("Enter the DSA subject marks =");
                    marks = sc.nextInt();
                }
                if (j == 1) {
                    System.out.println("Enter the DBMS subject marks =");
                    marks = sc.nextInt();
                }
                if (j == 2) {
                    System.out.println("Enter the Python subject marks =");
                    marks = sc.nextInt();
                }
                if (j == 3) {
                    System.out.println("Enter the Java subject marks =");
                    marks = sc.nextInt();
                }
                if (j == 4) {
                    System.out.println("Enter the Operating System subject marks =");
                    marks = sc.nextInt();
                }
                
                total += marks;
            }
            T_marks[i] = total;
            percentage[i] = (double)T_marks[i]/5;
        }

        System.out.println("\nPrint the student result  =");
        for(int i=0;i<num_s;i++)
        {
            System.out.println("\nStudent "+(i+1)+" Info =");
            System.out.println("Total marks ="+T_marks[i]);
    
            System.out.println("Persentage of student ="+percentage[i]);

            double percent = percentage[i];

            if (percent >= 97 && percent <= 100) 
            {
                System.out.println("Grade: A+");
            } 
            else if (percent >= 90) 
            {
                System.out.println("Grade: A");
            } 
            else if (percent >= 80) 
            {
                System.out.println("Grade: B");
            } 
            else if (percent >= 70) 
            {
                System.out.println("Grade: C");
            } 
            else if (percent >= 60) 
            {
                System.out.println("Grade: D");
            } 
            else 
            {
                System.out.println("Grade: F");
            }
        }
    }
}
