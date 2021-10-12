import java.util.*;

public class groups
{
    static int union(ArrayList<Integer> a,ArrayList<Integer> b)
    {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<a.size();i++)
        {
            if(!hm.containsKey(a.get(i)))
            {
                hm.put(a.get(i),1);
            }
        }
        for(int i=0;i<b.size();i++)
        {
            if(!hm.containsKey(b.get(i)))
            {
                hm.put(b.get(i),1);
            }
        }
        
        return hm.size();
        
    }
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
            int flag=0;
            int n=Integer.parseInt(sc.nextLine());
            int[][] matrix=new int[n][5];

            for(int i=0;i<n;i++)
            {
                matrix[i]=convert(sc.nextLine());
            }

            ArrayList<ArrayList<Integer>> li=new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<5;i++)
            {
                ArrayList<Integer> al=new ArrayList<Integer>();
                for(int j=0;j<n;j++)
                {
                    if(matrix[j][i]==1)
                        al.add(j);
                }
                if(al.size()>=1)
                    li.add(al);
            }

            if(li.size()>1)
            {
            for(int i=0;i<li.size()-1;i++)
            {
                for(int j=i+1;j<li.size();j++)
                {
                    if(union(li.get(i),li.get(j))==n)
                    {
                        System.out.println("YES");
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    break;
            }}
            
            if(flag==0)
                System.out.println("NO");

        }

    }
  

}

