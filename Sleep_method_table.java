package Threading;

public class Sleep_method_table extends Thread{

    public void run()
    {
        int n=9;
        System.out.println("Table of 9 is :");
        try
        {
            for (int i = 1; i <= 10; i++)
            {
                Thread.sleep(500);
                System.out.println(i * n);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Sleep_method_table s=new Sleep_method_table();
        s.start();

    }
}
