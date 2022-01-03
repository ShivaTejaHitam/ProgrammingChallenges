/*package whatever //do not write package name here */

import java.util.*;

public class Main {
    static int[] convert(String s)
    {
        String[] str=s.split(" ");
        int[] num=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            num[i]=Integer.parseInt(str[i]);
        }     
        return num;
    }


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int tc=Integer.parseInt(sc.nextLine());
        
        for(int t=0;t<tc;t++)
        {
            
            int[] nk=convert(sc.nextLine());
            int n=nk[0];
            int k=nk[1];
            
            if(k==1)
            {
                System.out.println("R");
            }
            
            else if(n<(2*k)-1)
            {
                System.out.println("-1");
            }
            
            else if(n>=(2*k)-1)
            {
                String[][] board=new String[n][n];
                
                for (String[] row : board)
                    Arrays.fill(row, ".");
                    
                for(int i=0;i<n;i=i+2)
                {
                    for(int j=0;j<n;j=j+2)
                    {
                        if(i==j)
                        board[i][j]="R";
                    }
                }
                
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
            
            }
            
            
        }
        
    }

}
