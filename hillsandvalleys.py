def compute(a):
    intimidations=[]
    q=len(a)-1
    for i in range(1,q):
        if(a[i-1]<a[i] and a[i+1]<a[i]):
            intimidations.append('H')
        elif(a[i-1]>a[i] and a[i+1]>a[i]):
            intimidations.append('V')
    return len(intimidations)
        

def compute1(a,start,end):
    if(start<=end):
        mid=(start+end)//2
        if(a[mid]<a[mid-1] and a[mid]<a[mid+1]):
            a[mid]=a[mid-1]
            return 
        elif(a[mid]>a[mid-1] and a[mid]>a[mid+1]):
            a[mid]=a[mid+1]
            return
        compute(a,start,mid-1)
        compute(a,mid+1,end)
    return
        
        


def hillsnvalleys():
    tc=int(input())
    for i in range(tc):
        l=int(input())
        a=list(map(int,input().split()))
        fs=compute1(a,0,len(a)-1)
        print(compute(a))
        
        

hillsnvalleys()