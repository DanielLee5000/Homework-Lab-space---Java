public class BSTInt2 {

    private BSTNode root;

    private static class BSTNode {
        int data;
        BSTNode leftChild;
        BSTNode rightChild;

        public BSTNode(int data) {
            this.data = data;
            this.leftChild = null;
            this.rightChild = null;
        }
    }

    // 1. Contains
    public boolean contains(int d) {
        return find(d) != null;
    }

    private BSTNode find(int d) {
        return recursiveFind(root, d);
    }

    private BSTNode recursiveFind(BSTNode node, int d) {
        if (node == null) {
            return null;
        }

        if (node.data == d) {
            return node;
        }

        if (d < node.data) {
            return recursiveFind(node.leftChild, d);
        } else {
            return recursiveFind(node.rightChild, d);
        }
    }

    // 2. Insert
    public void insert(int d) {
        root = recursiveInsert(root, d);
    }

    private BSTNode recursiveInsert(BSTNode node, int d) {
        if (node == null) {
            return new BSTNode(d);
        }

        if (d < node.data) {
            node.leftChild = recursiveInsert(node.leftChild, d);
        } else if (d > node.data) {
            node.rightChild = recursiveInsert(node.rightChild, d);
        }

        // Ignore duplicate values
        return node;
    }

    // 3. Delete
    public void delete(int data) {
        root = recursiveDelete(root, data);
    }

    private BSTNode recursiveDelete(BSTNode node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.leftChild = recursiveDelete(node.leftChild, data);
        } else if (data > node.data) {
            node.rightChild = recursiveDelete(node.rightChild, data);
        } else {

            // Case 1: Leaf node
            if (node.leftChild == null && node.rightChild == null) {
                return null;
            }

            // Case 2: Only right child
            if (node.leftChild == null) {
                return node.rightChild;
            }

            // Case 2: Only left child
            if (node.rightChild == null) {
                return node.leftChild;
            }

            // Case 3: Two children
            // Find predecessor (maximum in left subtree)
            BSTNode predecessor = getMax(node.leftChild);

            // Replace deleted node's data
            node.data = predecessor.data;

            // Delete original predecessor
            node.leftChild = recursiveDelete(
                node.leftChild, predecessor.data
            );
        }

        return node;
    }

    // Find maximum node in a subtree
    public BSTNode getMax(BSTNode node) {
        while (node.rightChild != null) {
            node = node.rightChild;
        }
        return node;
    }

    // Print the BST using inorder traversal
    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    private void printInOrder(BSTNode node) {
        if (node == null) {
            return;
        }

        printInOrder(node.leftChild);
        System.out.print(node.data + " ");
        printInOrder(node.rightChild);
    }

    // Create an initial test tree
    public static BSTInt2 testTree() {
        BSTInt2 tree = new BSTInt2();

        int[] values = {56, 26, 200, 18, 28, 190, 213, 12, 24, 27};

        for (int value : values) {
            tree.insert(value);
        }

        return tree;
    }

    public static void main(String[] args) {
        BSTInt2 tree = testTree();

        System.out.println("Original BST:");
        tree.printInOrder();

        // Test contains
        System.out.println("Contains 26: " + tree.contains(26));
        System.out.println("Contains 100: " + tree.contains(100));

        // Test insert
        tree.insert(30);
        System.out.println("After inserting 30:");
        tree.printInOrder();

        // Test delete (two children)
        tree.delete(26);
        System.out.println("After deleting 26:");
        tree.printInOrder();

        // Test delete (leaf)
        tree.delete(12);
        System.out.println("After deleting 12:");
        tree.printInOrder();

        // Test delete (nonexistent node)
        tree.delete(100);
        System.out.println("After deleting 100:");
        tree.printInOrder();
    }
}