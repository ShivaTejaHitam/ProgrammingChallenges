import java.util.*;

class EnergyDrink
{
    
    static boolean isDescendingorequal(ArrayList<Integer> arr)
    {
        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)<arr.get(i+1))
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int count=0;
        ArrayList<Integer> energies=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            energies.add(sc.nextInt());
        }
        
        while(energies.size()>1 && !isDescendingorequal(energies))
        {
            for(int i=energies.size()-1;i>=1 && energies.size()>1;i--)
            {
                if(energies.get(i)>energies.get(i-1))
                {
                    energies.remove(i);
                }
            }
            
            
            count++;
        }
        
        System.out.println(count);
        
        
    }
}




