package Threading;

import java.util.Scanner;

class Cash_Withdrawl {
    int fix_amount = 10000;

        synchronized public void Withdrawl_record ( int amount)
        {
            try
            {
                if (fix_amount >= amount)
                {
                    Thread.sleep(1000);
                    System.out.println("Congratulation!  your request of " + amount + " is confirmed : ");
                    fix_amount = fix_amount - amount;
                    System.out.println("Amount left : " + fix_amount + " Ru ");
                    System.out.println("-----------------------------------------------------------");
                }
                else
                {
                    System.out.println("insufficient balance!.. your request of " + amount + " is not available : ");
                    System.out.println("Amount left : " + fix_amount + " Ru ");
                    System.out.println("-----------------------------------------------------------");

                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }


        }
}


public class BANK_ACCOUNT  extends Thread
{
   static Cash_Withdrawl ob;
    int amount;

    public void run()
    {
        ob.Withdrawl_record(amount);
    }
    public static void main(String[] args) throws InterruptedException {

        Scanner sc=new Scanner(System.in);
        ob=new Cash_Withdrawl();

        BANK_ACCOUNT p1=new BANK_ACCOUNT();
        BANK_ACCOUNT p2=new BANK_ACCOUNT();
        BANK_ACCOUNT p3=new BANK_ACCOUNT();

        System.out.println("Enter the Withdrawal amount for person 1 :");
        p1.amount= sc.nextInt();

        System.out.println("Enter the Withdrawal amount for person 2 :");
        p2.amount= sc.nextInt();

        System.out.println("Enter the Withdrawal amount for person 3 :");
        p3.amount= sc.nextInt();


            p1.start();
            p2.start();
            p3.start();




    }
}

/*
Output :

        Enter the Withdrawal amount for person 1 :
        5000
        Enter the Withdrawal amount for person 2 :
        4000
        Enter the Withdrawal amount for person 3 :
        3000
        Congratulation!  your request of 5000 is confirmed :
        Amount left : 5000 Ru
        -----------------------------------------------------------
        Congratulation!  your request of 3000 is confirmed :
        Amount left : 2000 Ru
        -----------------------------------------------------------
        insufficient balance!.. your request of 4000 is not available :
        Amount left : 2000 Ru
        -----------------------------------------------------------

 */
