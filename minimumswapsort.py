

arr=[1,5,4,3,2]

gl={1:0,5:1,4:2,3:3,2:4}

ol={1:0,2:1,3:2,4:3,5:4}

swaps=0
temp=0
for i in arr:
    loc_i=ol[i]
    loc_f=gl[i]
    if(loc_i==loc_f):
        continue
    elif(gl[i]!="v" and gl[arr[loc_f]]!="v"):
        swaps=swaps+1
        temp=arr[loc_i]
        arr[loc_i]=arr[loc_f]
        arr[loc_f]=temp
        gl[i]="v"
        gl[arr[loc_f]]="v"
print(arr," with swaps ",swaps)

