import java.util.ArrayList;
import java.util.TreeSet;

public class Tree {
	private static class TreeNode {
		
		int data;
		ArrayList<TreeNode> children;
		
		public TreeNode(int data) {
			this.data=data;
			children = new ArrayList<TreeNode>();
		}
		
		public String toString() {
			return Integer.toString(data);
		}
	}
	
	private TreeNode root;
	
	public Tree(int rootData) {
		root = new TreeNode(rootData);
	}
	
	//Returns true if the TreeNode is a leaf (i.e. has no children)
	//Returns false if the TreeNode is not a leaf (i.e. has children)
	private boolean isLeaf(TreeNode n) {
		return n.children.isEmpty();
	}
	
	//Returns the first tree node encountered that contains data 
	//equal to data value passed as an argument
	private TreeNode find(int d) {
		return recursiveFind(root, d);
	}
	
	//recursive helper method that performs a depth first search of the tree
	//looking for a TreeNode that contains data equals to the value of the data
	//passed as an argument.
	private TreeNode recursiveFind(TreeNode node, int d) {
		if (node.data == d) {
			return node;
		}
		for (TreeNode child : node.children) {
			TreeNode found = recursiveFind(child, d);
			if (found != null) {
				return found;
			}
		}
		return null;
	}
	
	//returns true if the tree contains a TreeNode that contains data equal to d
	//returns false otherwise
	//Uses the find helper method
	//Note that because TreeNode is a private class public facing methods in 
	//the Tree class should not return TreeNodes.
	public boolean contains(int d) {
		return find(d) != null;
	}
	
	//Adds a child TreeNode with data equal to childData
	//as a child TreeNode of the TreeNode with data equal to parentData
	//returns true if it successfully finds a TreeNode whose data equals parentData
	//returns false otherwise
	public boolean addChild(int parentData, int childData) {
		TreeNode parent = find(parentData);
		if (parent != null) {
			parent.children.add(new TreeNode(childData));
			return true;
		}
		return false;
	}

	//toString method for pretty printing the tree
	public String toString() {
		return "Tree:" + toStringRecurse(root, "");		
	}	

	private String toStringRecurse(TreeNode node, String indent) {
		String s = "\n" + indent + node.data;
		for (TreeNode child: node.children)
			s = s.concat(toStringRecurse(child, indent+"  "));
		return s;
	}
	
	//Returns the height of the tree
	//Note that the root has a height of 0
	//Note that if the root is null, we return -1 for the height
	public int height() {
		return recursiveHeight(root);
	}
	
	private int recursiveHeight(TreeNode node) {
		if (node == null) {
			return -1;
		}
		int maxHeight = -1;
		for (TreeNode child : node.children) {
			int childHeight = recursiveHeight(child);
			if (childHeight > maxHeight) {
				maxHeight = childHeight;
			}
		}
		return maxHeight + 1;
	}

	//main method for testing
	public static void main(String[] args) {
/*
		Tree testTree = new Tree(9);
		testTree.root.children.add(new TreeNode(7));
		testTree.root.children.add(new TreeNode(11));
		System.out.println(testTree);
*/
       Tree testTree = new Tree(9);
        testTree.addChild (9,7);
        testTree.addChild (9,11);
        testTree.addChild (7,2);  
        testTree.addChild (7,8);
        testTree.addChild (11,9);
        testTree.addChild (11,15); 
        testTree.addChild (15,10);
        testTree.addChild (15,20); 
            
        System.out.println(testTree);
        System.out.println("height = " + testTree.height());

		
		
	

	}
	

	
}
