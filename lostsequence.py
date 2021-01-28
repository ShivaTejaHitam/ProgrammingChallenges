def redandblue():
    tc=int(input())
    for i in range(tc):
        n=int(input())
        r=list(map(int,input().split()))
        m=int(input())
        b=list(map(int,input().split()))
        r_sum=sum(r)
        b_sum=sum(b)
        i=0
        k=0
        summation=0
        maximum=0
        while(i<n and k<m):
            if(r_sum>b_sum):
                summation=summation+r[i]
                if(summation>maximum):
                    maximum=summation
                r_sum=r_sum-r[i]
                i=i+1
            
            elif(b_sum>r_sum):
                summation=summation+b[k]
                if(summation>maximum):
                    maximum=summation
                
                b_sum=b_sum-b[k]
                k=k+1
                
            elif(b_sum==r_sum):
                summation=summation+r[i]+b[k]
                if(summation>maximum):
                    maximum=summation
                r_sum=r_sum-r[i]
                b_sum=b_sum-b[k]
                i=i+1
                k=k+1
        while(i<n):
            summation=summation+r[i]
            if(summation>maximum):
                maximum=summation
            i=i+1
        while(k<m):
            summation=summation+b[k]
            if(summation>maximum):
                maximum=summation
            k=k+1
        print(maximum)
                
        
                
            

    
    
    
    
    
redandblue()