def isSubtreeBST(root,mini,maxi):
    if(root==None):
        return True
    
    if(root.data<mini or root.data>=maxi):
        return False
    
    return (isSubtreeBST(root.left,mini,root.data) and isSubtreeBST(root.right,root.data,maxi))
    
    
def check_binary_search_tree_(root):
    isSubtreeBST(root,-1,10001)