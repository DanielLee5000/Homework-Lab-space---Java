public class BSTInt {
    
    private static class BSTNode {
        private int data;
        private BSTNode leftChild;
        private BSTNode rightChild;
        
        public BSTNode(int data) {
            this.data = data;
            leftChild = rightChild = null;
        }
        
        public String toString() {
            return Integer.toString(data);
        }
    }
    
    private BSTNode root;
    
    public boolean contains(int d) {
        return find(d)!=null;
    }
    
    private BSTNode find(int d) {
        return recursiveFind(root,d);
    }
    
    private BSTNode recursiveFind(BSTNode node, int d) {
        if(node == null || node.data == d) {
            return node;
        }
        else if(d < node.data) {
            return recursiveFind(node.leftChild,d);
        }
        else {
            return recursiveFind(node.rightChild,d);
        }
        
    }
    
    public void insert(int d) {
        root = recursiveInsert(root,d);
    }
    
    private BSTNode recursiveInsert(BSTNode node, int d) {
        if(node == null) {
            return new BSTNode(d);
        }
        else if(d < node.data) {
            node.leftChild = recursiveInsert(node.leftChild,d);
        }
        else {
            node.rightChild = recursiveInsert(node.rightChild,d);
        }
        return node;
    }
    
    public void delete(int data) {
        root = recursiveDelete(root,data);
    }
    
    private BSTNode recursiveDelete(BSTNode node,int data){
        return null;
    }
    
    //assumes node is not null
    //this might be useful later on...
    public BSTNode getMax(BSTNode node){
        while(node.rightChild!= null) {
            node = node.rightChild;
        }
        return node;
    }
    
    public String toString() {
        return recursiveToString(root,"");
    }
    
    public String recursiveToString(BSTNode node, String indent) {
        
        if(node == null) {return "";}
        else {
            return
            recursiveToString(node.rightChild,indent + "    ")+
            "\n" + indent  +node.data +
            recursiveToString(node.leftChild,indent + "    ");
        }
    }
    
    //This method creates a test tree that you can use as
    //you build out your find and insert methods
    //After you have created your insert method,
    //you should use that method to create test trees in the main method
    public static BSTInt testTree(){
        BSTInt bst = new BSTInt();
        bst.root = new BSTNode(9);
        bst.root.rightChild = new BSTNode(11);
        bst.root.leftChild = new BSTNode(5);
        bst.root.leftChild.leftChild = new BSTNode(2);
        bst.root.leftChild.rightChild = new BSTNode(8);
        bst.root.rightChild.rightChild = new BSTNode(15);
        return bst;
    }
    
    
    public static void main(String[] args) {
        BSTInt bst = testTree();
        bst.insert(0);
        bst.insert(6);
        bst.insert(12);
        bst.insert(16);
        System.out.println(bst);
    }
    
    
}



