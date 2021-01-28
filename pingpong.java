import java.util.Scanner;

class pingpong
{
    static void ping_pong(int[] stamina)
    {
        int results[]={0,0};
        while(stamina[0]!=0 || stamina[1]!=0)
        {
            if(stamina[0]>1)
            {
                if(stamina[1]==0)
                {
                    results[0]=results[0]+1;
                }
                stamina[0]=stamina[0]-1;
            }

            if(stamina[1]>1)
            {
                if(stamina[0]==0)
                {
                    results[1]=results[1]+1;
                }
                stamina[1]=stamina[1]-1;
            }
        }

        System.out.println(results[0]+" "+results[1]);
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int tc;
        tc=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<tc;i++)
        {
            int[] stamina=new int[2];
            String st[]=sc.nextLine().split(" ");
            stamina[0]=Integer.parseInt(st[0]);
            stamina[1]=Integer.parseInt(st[1]);
            ping_pong(stamina);
        }
    }
}

