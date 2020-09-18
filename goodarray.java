
class goodarray
{
    public static void main(String args[])
    {
        int size=7;
            int[] arr={1,2,3,4};

        int mid=arr.length/2;
        int i=0;
        int count=0;

        while(i<=mid)
        {
            if(arr[i]>arr[i+1])
            {
                count=i+1;
            }
            
            i++;
        }

        System.out.println(count);

    }
} 
