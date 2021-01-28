
class Changemaking
{

    public static void main(String args[])
    {
        int[] coin_values={25,10,5,1};
        
        int sum=0;
        int i=0;
        int count=0;
        while(sum<67)
        {
            if((sum+coin_values[i])<=67 && (i<4))
            {
                sum=sum+coin_values[i];
                count=count+1;
            }

            else
            {
                i=i+1;
            }

        }

        System.out.println(count);

    }

}