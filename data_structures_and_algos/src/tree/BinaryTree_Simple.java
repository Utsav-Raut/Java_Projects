package tree;

import java.util.Scanner;

public class BinaryTree_Simple {

	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		BinaryTreeSimple_Node node = createTree();

		inOrder(node);
		System.out.println();
		preOrder(node);
		System.out.println();
		postOrder(node);
	}
	
	static BinaryTreeSimple_Node createTree(){
		BinaryTreeSimple_Node root = null;
		
		System.out.println("Enter data : ");
		int data = sc.nextInt();
		
		if (data == -1) return null;
		
		root = new BinaryTreeSimple_Node(data);
		
		System.out.println("Enter left child of " + data);
		root.lchild = createTree();
		
		System.out.println("Enter right child of " + data);
		root.rchild = createTree();
		
		return root;
	}
	
	static void inOrder(BinaryTreeSimple_Node root) {
		
		// L N R
		if (root == null) return;
		
		inOrder(root.lchild);
		System.out.print(root.data + " ");
		inOrder(root.rchild);
	}
	
	static void preOrder(BinaryTreeSimple_Node root) {
		
		// N L R
		
		if (root == null) return;
		
		System.out.print(root.data + " ");
		preOrder(root.lchild);
		preOrder(root.rchild);
	}
	
	static void postOrder(BinaryTreeSimple_Node root) {
		
		// L R N
		
		if (root == null) return;
		
		postOrder(root.lchild);
		postOrder(root.rchild);
		System.out.print(root.data + " ");
	}

}

class BinaryTreeSimple_Node{
	BinaryTreeSimple_Node lchild, rchild;
	int data;
	
	public BinaryTreeSimple_Node(int data) {
		this.data = data;
		this.lchild = null;
		this.rchild = null;
	}
}



/*

			2
	      /   \
	     4     1
		/ \	  /
	   7  10 4	
	  /
	 6
	   

*/