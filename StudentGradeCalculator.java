import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main (String args[])
    {
        System.out.println("**********************  WELOCME TO GRADE CALCUTOR *************************");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subjects under 100.");
        System.out.print("Enter the marks of physics ==>  ");
        float physics =sc.nextFloat();
        System.out.print("Enter the marks of the mahts ==>  ");
        float maths =sc.nextFloat();
        System.out.print("Enter the marks of the english =>  ");
        float english =sc.nextFloat();
        System.out.print("Enter the marks of the oop ==>  ");
        float oop =sc.nextFloat();
        System.out.print("Enter the marks of the python ==>  ");
        float python =sc.nextFloat();

        System.out.println();
         System.out.println("*******************************************************");

        float Total=physics+maths+english+oop+python;
        float ave=Total/5;
        System.out.println("Total marks gain in 5 subjects is ==>  "+Total);
        System.out.println("Average of total marks is ==>  "+ave);
        
        System.out.println("*******************************************************");

        if (ave>=90){
            System.out.println("Congratulations! You get O grade");
        }
        else if (ave>=80){
            System.out.println("Congratulations! You get A+ grade");
        }
        else if (ave>=70){
            System.out.println("Congratulations! You get A grade");
        }
        else if (ave>=60){
            System.out.println("Congratulations! You get B+ garde");
        }
        else if (ave>=50){
            System.out.println("Congratulations! You get B grade");
        }
        else if (ave>=45){
            System.out.println("Congratulations! You get C+ garde");
        }
        else if(ave>=40){
            System.out.println("Congratulations! You get C grade");
        }
        else{
            System.out.println("Sorry ! your failed");
        }
        System.out.println("*******************************************************");
    }
    
}
