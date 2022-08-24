package Threading;


public class Sleep_method_name extends Thread{
    public void run()
    {
        String name = "Rohit Gawai";
        System.out.println("Default String :\n"+name);
        System.out.println("Using Threading sleep method :");
            try {
                for (int i = 0; i < name.length(); i++)
                {
                    Thread.sleep(1000);
                    System.out.print(name.charAt(i));
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
    }



    public static void main(String[] args) {
        Sleep_method_name ob=new Sleep_method_name();
        ob.start();
    }
}
