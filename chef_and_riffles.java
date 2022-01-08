import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int tc=Integer.parseInt(sc.nextLine());
		for(int t=0;t<tc;t++)
		{
		    int N=sc.nextInt();
		    int K=sc.nextInt();
		    sc.nextLine();
		    
		    int[] permutation=new int[N];
		    int[] id_permutation=new int[N];
		    for(int i=0;i<N;i++)
		        permutation[i]=sc.nextInt();
		  
		    for(int i=0;i<N;i++)
		        id_permutation[i]=permutation[i];
		        
		    int weapon=0;
		    
		    while(weapon==0 || !Arrays.equals(permutation,id_permutation))
		    {
		        
		        
		        weapon++;
		    }
		        
		    
		    
		}
		
	}
}
