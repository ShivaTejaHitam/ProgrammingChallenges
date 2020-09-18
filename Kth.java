
/* finding Kth smallest element */
class Node
{
    int data;
    Node left;
    Node right;

    public Node(int item)
    {
        this.data=item;
        left=right=null;
    }
}


class Kth
{
    Node root;

    Kth()
    {
        root=null;
    }

    static void inorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        
        inorder(node.left); 
        System.out.println(node.data);
        inorder(node.right);
        
    }

    static Node insert(Node node,int item)
    {
        if(node==null)
        {
            node =new Node(item);
            return node;
        }
        
        if(item<node.data)
        {
            node.left=insert(node.left,item);
        }
        else
        {
            node.right=insert(node.right,item);
        }
        return node;
    }

    public static void main(String args[])
    {
        Node node=null;
        int[] arr={7,10,4,3,20,15};

        for(int i=0;i<arr.length;i++)
        {
            node=insert(node,arr[i]);
        }

        inorder(node);    
        
    }
}

