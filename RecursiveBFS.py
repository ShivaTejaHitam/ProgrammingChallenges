
def BFS(graph,visited,queue):
    if(len(queue)!=0):
        vertex=queue.pop(0)
        print(vertex)
        for node in graph[vertex]:
            if(node not in visited):
                visited.append(node)
                queue.append(node)
        BFS(graph,visited,queue)
    else:
        return
    

graph={'a':['b','c'],'b':['a','d'],'c':['a','d'],'d':['e'],'e':['a']}

BFS(graph,['a'],['a'])













