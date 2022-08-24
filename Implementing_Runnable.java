package Threading;

public class Implementing_Runnable implements Runnable{

    public void disp()
    {
        System.out.println("I am java developer");
    }
    @Override
    public void run() {

    }
    public static void main(String[] args) {
        Implementing_Runnable   rr= new Implementing_Runnable ();
        Thread  th = new Thread(rr);
        th.start();
        Thread  th1 = new Thread(rr);
        th1.start();
        Thread  th2 = new Thread(rr);
        th2.start();
        th2.start();
    }


}
