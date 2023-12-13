//// Implementing Thread Class
//class Test extends Thread
//{
//    public void run()
//    {
//        System.out.print("Threads");
//    }
//    
//    public static void main(String[] args)
//    {
//        Test t = new Test();
//        t.start();
//    }
//}
//
//Implementing interface runnable

class Test implements Runnable
{
    public void run()
    {
        System.out.print("This is interface runnable");
    }
    
    public static void main(String[] args)
    {
        Test t = new Test();
        Thread th = new Thread(t);
        th.start();
    }
}