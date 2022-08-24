package Threading;

import java.util.Scanner;

public class Sleep_Method_p extends Thread{
    Scanner sc=new Scanner(System.in);
    int i,j,n;
    public void run()
    {
        System.out.println("Enter the number of rows :");
        n=sc.nextInt();

        try {
            for (i = 1; i <= n; i++)
            {
                for (j = i; j <= n; j++)
                {
                    System.out.print(" ");
                }
                for (j = 1; j <= i; j++)
                {
                    Thread.sleep(800);
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Sleep_Method_p ob=new Sleep_Method_p();
        ob.start();

    }
}
