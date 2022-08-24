package Threading;

public class FirstThread_class extends Thread{

    public void run()
    {
        System.out.println("first thread is executing");

    }

    public static void main(String[] args) {
        FirstThread_class ob=new FirstThread_class();
        ob.start();    //thread is created .
        ob.run();      //  Thread is not created .
    }
}
