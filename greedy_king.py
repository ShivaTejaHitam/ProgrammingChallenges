def greedy_king():
    t=int(input())
    for i in range(t):
        n=int(input())
        my_score=0
        his_score=0
        while(n>0):
            if(n%2==0):
                my_score=my_score+(n/2)
                n=n/2
            elif(n%2==1):
                my_score=my_score+1
                n=n-1
                
            if(n%2==0):
                n=n/2
            elif(n%2==1):
                n=n-1
        print(int(my_score))
                
                
greedy_king()