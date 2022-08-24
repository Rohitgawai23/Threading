package Threading;
// create 5 thread and print default and change name of thread .
public class First_thread extends Thread        // Thread is a class
{
    public void run()                            // Thread in action
    {
        System.out.println("Runnig thread....");
    }
    public static void main(String[] args)
    {
        First_thread ob=new First_thread();
        First_thread ob2=new First_thread();
        First_thread ob3=new First_thread();
        First_thread ob4=new First_thread();
        First_thread ob5=new First_thread();

        ob.start();                            // it is used to start method
        ob2.start();
        ob3.start();
        ob4.start();
        ob5.start();
        System.out.println("before changing :"+ob.getName());            // get the name
        System.out.println("before changing :"+ob2.getName());
        System.out.println("before changing :"+ob3.getName());
        System.out.println("before changing :"+ob4.getName());
        System.out.println("before changing :"+ob5.getName());

        ob.setName("Rohit");
        ob2.setName("Prashant");
        ob3.setName("Atul");
        ob4.setName("Roshan");
        ob5.setName("Dhiraj");
        System.out.println("After changing :"+ob.getName());
        System.out.println("After changing :"+ob2.getName());
        System.out.println("After changing :"+ob3.getName());
        System.out.println("After changing :"+ob4.getName());
        System.out.println("After changing :"+ob5.getName());


    }
}
