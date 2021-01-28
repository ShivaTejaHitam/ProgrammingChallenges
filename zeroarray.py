def zeroarray():
    n=int(input())
    arr=list(map(int,input().split()))
    sum=0
    count=0
    summer=[]
    for i in range(n):
        sum=sum+arr[i]
        summer.append(sum)

    

        
    
    if(count>0):
        print(count)
    else:
        print(0)

zeroarray()