package Threading;

class abc extends Thread{
    public void run()
    {
        int n=5;
        for(int i=1; i <= 10; i++)
        {
            System.out.print(i*n+" ");
        }
        System.out.print(" \npriority= "+Thread.currentThread().getPriority());
        System.out.println();
    }
}

class pqr extends Thread{
    public void run()
    {
        int n=6;
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i * n+" ");

        }
        System.out.print(" \npriority= "+Thread.currentThread().getPriority());
        System.out.println();
    }
}

class xyz extends  Thread{
    public void run()
    {
        int n=3;

            for (int i = 1; i <= 10; i++)
            {
                System.out.print(i * n+" ");
            }
        System.out.print(" \npriority= "+Thread.currentThread().getPriority());
        System.out.println();
    }
}
public class priority extends Thread{

    public static void main(String[] args) {
       abc ob1=new abc();
       pqr ob2=new pqr();
       xyz ob3=new xyz();

        ob1.setPriority(Thread.MAX_PRIORITY);
        ob2.setPriority(Thread.NORM_PRIORITY);
        ob3.setPriority(Thread.MIN_PRIORITY);

       ob1.start();

        try {
            Thread.sleep(500);

            ob2.start();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }


       try {
           Thread.sleep(500);

           ob3.start();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }


    }
}
