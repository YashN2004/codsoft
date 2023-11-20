import java.util.Scanner;

public class ATMinterface {
    public static void main (String args[])
    {
       Scanner sc = new Scanner(System.in);
       float balance=10000, deposit, withdrawal;

       while(true){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("choose 1 for depostie");
        System.out.println("choose 2 for withdrawal");
        System.out.println("choose 3 for balance inquire");
        System.out.println("choose 4 for exit");
        System.out.print("choose what operation you want to do ==> ");
        int choice= sc.nextInt();
        System.out.println();
        System.out.println("*****************************************************");
       
        switch(choice){
            case 1://case for the deposite opretion
                System.out.print("Enter the amount you want to deposite  ==> ");
                deposit=sc.nextInt();
                balance = balance+deposit;
                System.out.println("your updated balance is  : "+balance);
                System.out.println("*****************************************************");
                System.out.println();
                break;

            case 2://case for the withdrawal opretion
                System.out.print("enetr the amount you wan to withdrwal   ==> ");
                withdrawal=sc.nextInt();
                //balance=balance-withdrawal;

                if(balance>=withdrawal){
                    balance=balance-withdrawal;
                    System.out.println("your current balance  : "+balance);
                    System.out.println("*****************************************************");

                }
                else{
                    System.out.println("sorry  you dont have sufficent balance");
                }
                break;

            case 3://case for the balance inquire
                System.out.println("your account balance is   : "+balance);
                System.out.println("*****************************************************");
                System.out.println();
                break;

            case 4://case if user want to end the opretion 
                
                System.out.println("Thank you for using our ATM !");
                System.out.println("Vist Again");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.exit(choice);
                
        }

       }
        
        
    }
    
}
