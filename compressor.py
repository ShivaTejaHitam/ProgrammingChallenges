def tokenize():
    n=int(input())
    for i in range(n):
        word=input()
        length=len(word)
        if length<=10:
            print(word)
        else:
            res=word[0]+str(length-2)+word[length-1]
            print(res)
            
            
        
        

    
    
tokenize()