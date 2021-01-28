def sol():
    tc=int(input())
    for i in range(tc):
        string=input()
        if(len(string)%2==1 or string[0]==')' or string[len(string)-1]=='('):
            print("NO")
        else:
            print("YES")