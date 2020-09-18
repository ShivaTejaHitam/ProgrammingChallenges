import java.util.Scanner;


import java.util.*;
class hello {


    public static void main(String args[])
    {
        System.out.println("Enter a number");

        Scanner sc=new Scanner(System.in);

        int number=sc.nextInt();

        for(int i=1;i<number;i++)
        {
            if(i+(number-i)==number)
            {
                System.out.print("("+i+","+(number-i)+")"+" ");

            }
        }
    }
    
}