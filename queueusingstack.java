import java.util.*;

class qus
{
    static int CAPACITY=5;
    static int[] stack1=new int[CAPACITY];
    static int top1=-1;
    static int[] stack2=new int[CAPACITY];
    static int top2=-1;
    
    static void enqueue(int data)
    {
        if(top1==CAPACITY-1)
        {
            System.out.println("Queue is full");
        }
        else
        {
            top1++;
            stack1[top1]=data;
        }
    }
    
    static int dequeue()
    {
        int element=0;
        while(top1>=0)
        {
            top2++;
            stack2[top2]=stack1[top1];
            top1--;
        }
        element=stack2[top2];
        top2--;
        
        while(top2>=0)
        {
            top1++;
            stack1[top1]=stack2[top2];
            top2--;
        }
        
        return element;
        
    }
    
    
    
    
    public static void main(String args[])
    {
        enqueue(2);
        enqueue(1);
        enqueue(3);
        System.out.println(dequeue());
        System.out.println(dequeue());

        
        
    }
}
