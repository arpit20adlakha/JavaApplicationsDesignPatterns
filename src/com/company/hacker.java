package com.company;

public class hacker implements Runnable{
    public void run()
    {
        try
        {
            for(int i=0;i<2;i++)
            {
                Thread.sleep(100);
                System.out.print(" "+Thread.currentThread().getName());
            }
        }
        catch(InterruptedException e)
        {
            System.out.print("Exception Occured "+e);
        }
    }

}
