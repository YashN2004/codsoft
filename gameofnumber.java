import java.util.Scanner;
 
public class gameofnumber{
    public static void numberguessinggame()
    {
        
        Scanner sc=new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());

        System.out.println("Enter the number of the trail you want in game");
        System.out.print("Number must be less then 10 ==> ");
        int t = sc.nextInt();

        if(t<=10)
        {
            int i, guess;
            System.out.println("Choose th enumber between 1 to 100 in " +t+  " trys");
        
        for (i = 0; i < t; i++) {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Guess the number :- ");
            guess = sc.nextInt();
            
            if (number == guess) 
            {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                break;
            }
            else if (number > guess && i !=t-1) 
            {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i !=t-1) 
            {
                System.out.println("The number is less than " + guess);
            }
        }
 
        if (i==t)
         {
            System.out.println("You used all "+t+" trials.");
            System.out.println();
            System.out.println("The number was " + number);

        }
    }
    else
    {
        System.out.println(" Sorry! you have enter to many chances for guessing the number ");
    }
}
 
    
    public static void main(String arg[])
    {
        numberguessinggame();
    }
}