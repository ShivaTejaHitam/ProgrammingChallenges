#include <iostream>
using namespace std;

int main() {
	
	int t,i,j,k;
	int days,initial;
	int stocks[1000];
	string stockstr;
	
	cin>>t;
	for(i=0;i<t;i++)
	{
	    cin>>days;

	    for(j=0;j<days;j++)
	    {
	        
	        cin>>stocks[j];
	    }
	    
	    initial=0;
	    k=1;
	    while(k<days)
	    {
	        if(stocks[k]>stocks[initial])
	        {
	            k++;
	        }
	        else if(stocks[k]<stocks[k-1] && stocks[k-1]-stocks[initial]>0)
	        {
	            cout<<"("<<initial<<" "<<k-1<<")"<<" ";
	            initial=k;
	            k++;
	            
	        }
	        else if(stocks[k]<stocks[k-1] && stocks[k]-stocks[initial]<0)
	        {
	            initial=k;
	            k++;
	        }
	        
	        
	        
	    }
	    
	    
	    
	    
	}
	
	
	
	return 0;
}