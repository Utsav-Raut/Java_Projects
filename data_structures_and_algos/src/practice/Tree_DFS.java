package practice;

import java.util.Stack;

class Node{
	int data;
	Node right, left;
	
	Node(int data){
		this.data = data;
		this.right = this.left = null;
	}
}

public class Tree_DFS {
	Node root;
	
	public void dfsTraversal(Node node) {
		if(node != null) {
			dfsTraversal(node.left);
			System.out.print(" "+node.data);
			dfsTraversal(node.right);
		}

	}
	
	public void dfsTraversal_iterative(Node node) {
		if(node == null)
			return;
		
		Stack<Node> stck = new Stack<>();
		while(true) {
			if(node != null) {
				stck.push(node);
				node = node.left;
			}else {
				if(stck.isEmpty()) break;
				node = stck.pop();
				System.out.print(" "+node.data);
				node = node.right;
			}
		}
		
	}
	
	public static void main(String args[]) {
		Tree_DFS tree = new Tree_DFS();
		tree.root = new Node(25);
		tree.root.left = new Node(10);
		tree.root.right = new Node(35);
		tree.root.left.left = new Node(5);
		tree.root.left.right = new  Node(8);
		tree.root.right.right = new Node(45);
		
		System.out.println("Binary Tree");
		tree.dfsTraversal(tree.root);
		System.out.println();
		tree.dfsTraversal_iterative(tree.root);
	}

}
