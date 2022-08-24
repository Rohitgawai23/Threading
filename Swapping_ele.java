package Threading;
// INPUT :-{2,1,3,4,1,2,3,1,1,1,5,1,1,1,9,9,0,0,0}
//OUTPUT :-{2,3,4,2,3,5,9,9,0,0,0,1,1,1,1,1,1,1,1 };
public class Swapping_ele extends Thread{

    public void run()
    {
        int a[]={2,1,3,4,1,2,3,1,1,1,5,1,1,1,9,9,0,0,0};
        int b[]=new int[19];


            for (int i = 0; i < a.length; i++)
            {
                int temp = 0;
                for (int j = i + 1; j < a.length; j++)
                {

                    if (a[i] == 1)
                    {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        try
        {
            for (int i = 0; i < b.length; i++)
            {
                Thread.sleep(1000);
                System.out.print(a[i] + " ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        Swapping_ele s=new Swapping_ele();
        s.start();




    }
}
