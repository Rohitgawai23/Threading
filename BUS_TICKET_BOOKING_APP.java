package Threading;


import java.util.Scanner;

class REQUEST_TICKET
{
    int total_seats=20;

    synchronized public void bus_record(int seats)
    {

        if(total_seats>=seats)
        {
            System.out.println("Congratulation! your booking of "+seats+" is confirmed");
            total_seats=total_seats-seats;
            System.out.println("seats left:"+total_seats);
            System.out.println("-----------------------------------------------------------");
        }

        else
        {
            System.out.println("Sorry! your booking of "+seats+" is not available");
            System.out.println("seats left:"+total_seats);
            System.out.println("-----------------------------------------------------------");
        }

    }

}


public class BUS_TICKET_BOOKING_APP extends Thread {

    static  REQUEST_TICKET ob;
    int seats;

    public void run()
    {
        ob.bus_record(seats);
    }

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       ob=new REQUEST_TICKET();

        BUS_TICKET_BOOKING_APP p1=new BUS_TICKET_BOOKING_APP();
        BUS_TICKET_BOOKING_APP p2=new BUS_TICKET_BOOKING_APP();
        BUS_TICKET_BOOKING_APP p3=new BUS_TICKET_BOOKING_APP();

        System.out.println("Enter no of ticket for person 1:");
        p1.seats=sc.nextInt();

        System.out.println("Enter no of ticket for person 2:");
        p2.seats=sc.nextInt();

        System.out.println("Enter no of ticket for person 3:");
        p3.seats=sc.nextInt();

        p1.start();
        p2.start();
        p3.start();
    }
}

/*
Output :

        Enter no of ticket for person 1:
        12
        Enter no of ticket for person 2:
        7
        Enter no of ticket for person 3:
        3
        Congratulation! your booking of 12 is confirmed
        seats left:8
        -----------------------------------------------------------
        Congratulation! your booking of 3 is confirmed
        seats left:5
        -----------------------------------------------------------
        Sorry! your booking of 7 is not available
        seats left:5
        -----------------------------------------------------------


 */