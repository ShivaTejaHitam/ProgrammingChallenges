import java.util.*;

class Treasure
{
    public static void main(String args[])
    {
        int tc;
        Scanner sc=new Scanner(System.in);
        tc=sc.nextInt();
        for(int i=0;i<tc;i++)
        {
            int n_seg=sc.nextInt();
            sc.nextLine();

            int[][] segs=new int[n_seg][2];
            String[] temp=new String[2];
            for(int j=0;j<n_seg;j++)
            {

                String su=sc.nextLine();
                temp=su.split(" ");
                for(int ku=0;ku<2;ku++)
                {
                    segs[j][ku]=Integer.parseInt(temp[ku]);
                }
                
            }

            int count[]=new int[n_seg];
            for(int p=0;p<n_seg;p++)
            {   
                for(int l=0;l<n_seg;l++)
                {
                    if(p<l)
                    {
                        if(segs[l][1]>segs[p][1])
                        {
                            
                            count[p]=count[p]+1;
                        }
                    }   
                    else if(p>l)
                    {
                        if(segs[l][1]<segs[p][1])
                        {
                            count[p]=count[p]+1;
                        }
                    }
                }
            }
            int mini=200;
            for(int li=0;li<count.length;li++)
            {
                if(count[li]<mini)
                {
                    mini=count[li];
                }
            }

            System.out.println(mini);

        }   

    }
}