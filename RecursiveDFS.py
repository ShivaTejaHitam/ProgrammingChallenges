# Using backtracking and without stack

def DFS(graph,vertex,visited):
    visited.append(vertex)
    print(vertex)
    for node in graph[vertex]:
        if node not in visited:
            DFS(graph,node,visited)




# Using stack and without backtracking
def DFS2(graph,visited,stack):
    if(len(stack)!=0):
        vertex=stack.pop()
        print(vertex)
        for node in graph[vertex]:
            if node not in visited:
                visited.append(node)
                stack.append(node)
        DFS2(graph,visited,stack)
    else:
        return
    

graph={'a':['b','c'],'b':['a','d'],'c':['a','d'],'d':['e'],'e':['a']}

print("using backtracking")
DFS(graph,'a',[])
print("Using stack")
DFS2(graph,['a'],['a'])