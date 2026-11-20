public class TreeBST<T extends Comparable<? super T>> {

    private Node root;

    private class Node {

        T item;

        Node n_left, n_right;

        Node(T data) { this.item = data; }

    }

    public TreeBST() { this.root = null; }

 

    public void insertNode(T value) { 
        if (root == null) {
            root = new Node(value);
        }  
        int cmp = value.compareTo(root.item);

        if (cmp < 0) {
                root.n_left = new Node(value);
        } else if (cmp > 0) {
                root.n_right = new Node(value);
        }
    }

    /** Public delete one node */

    public void delete(T value) {

    }

public boolean contains(T value) {
        Node current = root;

        while (current != null) {

            int cmp = value.compareTo(current.item);

            if (cmp < 0) {
                current = current.n_left;
            } else if (cmp > 0) {
                current = current.n_right;
            } else {
                return true; // Found the value
            }
        }

        return false; // Value not found
    }    

    public static void main(String[] args){

        TreeBST<Integer> bst = new TreeBST<>();

        int[] values = {5, 2, 7, 3, 8, 1, 6, 4};

        for (int v : values) bst.insertNode(v);

        bst.delete(1);

        System.out.println(bst.contains(5)); // should printout true

        System.out.println(bst.contains(100)); // should printout false

 

    }

}