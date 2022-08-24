package Threading;

public class pattern_sleep_method extends Thread {
    public void run()
    {
        try
        {
            int k = 1;
            for (int i = 1; i <= 5; i++)
            {
                k = i;
                for (int j = 1; j <= i; j++)
                {
                    Thread.sleep(1000);
                    System.out.print(k + " ");
                    k = k + 5 - j;
                }
                System.out.println();
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        pattern_sleep_method p=new pattern_sleep_method();
        p.start();
    }
}
