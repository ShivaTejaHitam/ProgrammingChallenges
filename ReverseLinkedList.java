 
     class Node
    {

    int data;
    Node next;

    public Node(int d)
    {
        this.data=d;
        this.next=null;
    }
    

    }

class ReverseLinkedList{
    Node head;

     static ReverseLinkedList insert(ReverseLinkedList l1,int item)
    {
        Node newone=new Node(item);
        if(l1.head==null)
        {
            

            System.out.println("Hello ");
            l1.head=newone;
        }
        else
        {
            Node temp=l1.head;

            while(temp.next!=null)
            {
                temp=temp.next;

            }

            temp.next=newone;

            System.out.println("Hello ");


        }

        return l1;
        
    }

   static void show(ReverseLinkedList k)
    {
        Node n=k.head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

    void reverse(Node n)
    {

    }


    public static void main(String args[])
    {
            ReverseLinkedList l1=new ReverseLinkedList();
            l1=insert(l1,9);
            l1=insert(l1,99);
            show(l1);
    }
}