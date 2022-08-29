package Threading;

// Daemon Thread
public class daemon extends Thread{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("IT IS RUNNING ....");
        }
        else
            System.out.println("IT IS NOT RUNNING ....");
    }
    public static void main(String[] args) {
        daemon ob=new daemon();
        daemon ob2=new daemon();
        daemon ob3=new daemon();

        ob.start();
        ob2.start();

        ob3.setDaemon(true);
        ob3.start();


    }
}

/*
Output :

        IT IS NOT RUNNING ....
        IT IS RUNNING ....
        IT IS NOT RUNNING ....

 */
