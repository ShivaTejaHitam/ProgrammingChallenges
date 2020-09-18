
import java.lang.*;
class zigzag
{
    static char[][] convert(String sn,int numRows)
    {
        int gap=sn.length()%numRows;

        char[] s=sn.toCharArray();
        char[][] d=new char[numRo   ws][gap];
        

    int counter=0;
    int i=0;
    int j=0;

        while(counter<s.length)
        {
            while(i<numRows)
            {
                d[i][j]=s[counter];
                System.out.println(d[i][j]);
                counter++;
                i++;
            }
            i--;
            while(i>0)
            {
                i--;
                j++;
                d[i][j]=s[counter];
                System.out.println(d[i][j]);
                counter++;
            
            }
        

        }

        
        return d;
    }


   public static void main(String args[])
   {
       String s="PAYPALISHIRING";
       int numRows=4;
       System.out.println(convert(s,numRows));
   }

}

