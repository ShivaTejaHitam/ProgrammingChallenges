tc=int(input())
for i in range(tc):
    n=int(input())
    if(n%2==1):
        print("YES")
    else:
        j=2
        for j in range(2,10):
            if(j%2==0 and j<n):
                if((n%j)==0 and ((n//j)%2==1)):
                    print("YES")
                    break
            elif(j%2==1 and n%j==0):
                print("YES")
                break
        if(j==9 or n==2):
            print("NO")
                