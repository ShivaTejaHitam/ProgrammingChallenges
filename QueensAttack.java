class QueensAttack
{
    
    static int queensAttack(int n,int k,int r_q,int c_q,int[][] obstacles)
    
    {
        int points=0;

        for(int i=r_q+1;i<=n;i++)
        {
            for(int j=0;j<k;j++)
            {

            }
        }

        for(int i=r_q-1;i>=1;i--)
        {
            for(int j=0;j<k;j++)
            {
                
            }
        }

        for(int i=c_q+1;i<=n;i++)
        {
            for(int j=0;j<k;j++)
            {
                
            }
        }

        for(int i=c_q-1;i>=1;i--)
        {
            for(int j=0;j<k;j++)
            {
                
            }
        }

        
    }
    public static void main(String args[])
    {
        int[][] positions={{5,5},
                            {4,2},
                            {2,3}};
        
        System.out.println(queensAttack(5,3,4,3,positions));

    }
}

