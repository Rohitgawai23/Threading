package Threading;

public class isAlive_method extends Thread{
    public void run()
    {
        System.out.println("are you ok my friend : " +Thread.currentThread().isAlive());
    }
    public static void main(String[] args) {
        isAlive_method ob=new isAlive_method();
        System.out.println("Condition of thread before starting....." +ob.isAlive());
        ob.start();
        System.out.println("Condition of thread After starting....." +ob.isAlive());
       // ob.stop();          // stop the thread
        ob.suspend();     // suspend the thread  temporary
        ob.resume();       // resume the thread
    }
}

/*
Output :

        Condition of thread before starting.....false
        Condition of thread After starting.....true
        are you ok my friend : true

 */