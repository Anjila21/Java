class PrintTable
{
   public int i;
  synchronized  void showTable(int x)
    {
        for(i=1;i<=10;i++)
        {
            System.out.println(x*i);
        }
        try
        {
            Thread.sleep(400);
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
   

class Thread1 extends Thread
{
    PrintTable t;
    Thread1(PrintTable t)
    {
        this.t=t;
    }
    @Override
           public void run()
            {
                t.showTable(3);
            }
}


class Thread2 extends Thread
{
    PrintTable t;
    Thread2(PrintTable t)
    {
        this.t=t;
    }
    @Override
    public void run()
    {
        t.showTable(5);
    }
}

public class ThreadSync
{
    public static void main(String[] args)
    {
        PrintTable obj = new PrintTable();
        Thread t1 = new Thread1(obj);
        Thread t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}