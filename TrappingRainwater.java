/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t_c=sc.nextInt();
		for(int i=0;i<t_c;i++)
		{
		    int N=sc.nextInt();
            sc.nextLine();
		    String[] arr1=new String[N];

		    String strs=sc.nextLine();
		    arr1=strs.split(" ");
            int[] arr=new int[N];
            for(int mp=0;mp<arr1.length;mp++)
            {
                arr[mp]=Integer.parseInt(arr1[mp]);
            }
            int area=0;



            for(int j=1;j<arr.length-1;j++)
            {
                int left=arr[j];
                for(int p=0;p<j;p++)
                {
                     left=Math.max(left,arr[p]);
                }
                int right=arr[j];
                for(int k=j+1;k<arr.length;k++)
                {
                    right=Math.max(right,arr[k]);
                }

                
                area=area+(Math.min(left,right)-arr[j]);

            }
            System.out.println(area);
            		    
		}
		
	}
}