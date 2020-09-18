class Solution {
    
    static int get_number(ListNode l)
    {
        int sum=0;
        while(l!=null)
        {
            sum=sum+l.val;
            sum*=10; 
            l=l.next;
        }

        int number=sum/10;
        int fro=0;
        sum=0;
        while(number>0)
        {
            sum=number%10;
            
            fro=fro*10+sum;
            number=number/10;
        }
        
        return fro;
        
    }
    
    static void insert(ListNode l,int n)
    {
       ListNode temp=new ListNode(n);
        if(l==null)
        {
            l=temp;
        }
        else
        {
            ListNode t=l;
            
            while(t.next!=null)
            {
                t=t.next;
            }
            
            t.next=temp;
            
        }
        
    }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int number1=get_number(l1);
        int number2=get_number(l2);
        
        
        int answer=number1+number2;
        ListNode l3=new ListNode(answer%10);
        answer/=10;
        int sum=0;
        int fro=0;
        while(answer>0)
        {
            sum=answer%10;
            insert(l3,sum);
            answer=answer/10;
        }
        
        return l3;
    }
}