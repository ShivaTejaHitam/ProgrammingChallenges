

class Shiva implements Runnable
{
    String msg;
    Thread t;

   public Shiva(String s)
    {
        msg=s;
        t=new Thread(this);
        System.out.println("New thread: " + t);
        t.start();
    }


  
    public void run()
    {
        
        this.incr();
        

    }

    synchronized void incr()
    {
        for(int i = 5; i > 0; i--) {
        System.out.println(msg + ": " + i);
        }
    }
}


class MultiThreading
{
    public static void main(String args[])
    {
        Shiva s1=new Shiva("One");
        Shiva s2=new Shiva("Two");
        Shiva s3=new Shiva("Three");

        try
        {
            s1.t.join();
            s2.t.join();
            s3.t.join();
        }
        catch(Exception e)
        {
            System.out.println("Hey Its an error");
        }



    }
}



