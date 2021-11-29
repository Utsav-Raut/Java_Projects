package tree;


public class Binary_Search_Tree {	
	
	class Node{
		int key;
		Node left, right;
		
		Node(int key){
			this.key = key;
			left = right = null;
		}
	}
	
	Node root;
	
	Binary_Search_Tree(){
		root = null;
	}
	
	public void insert(int key) {
		root = insertKey(root, key);
	}
	
	public Node insertKey(Node node, int key) {
		if(node == null) {	//if root node is null, i.e. empty tree
			node = new Node(key);
			return node;
		}
		
		if(key < node.key)
			node.left = insertKey(node.left, key);
		else if(key > node.key)
			node.right = insertKey(node.right, key);
		
		return node;
	}
	
	public void inorder() {
		System.out.print("Inorder traversal : ");
		inorderRec(root);
		System.out.println();
	}
	
	public void inorderRec(Node node) {
		if(node != null) {
			inorderRec(node.left);
			System.out.print(node.key + " ");
			inorderRec(node.right);
		}
	}
	
	public void preorder() {
		System.out.print("Preorder traversal : ");
		preorderRec(root);
		System.out.println();
	}
	
	public void preorderRec(Node node) {
		if(node != null) {
			System.out.print(node.key + " ");
			preorderRec(node.left);
			preorderRec(node.right);
		}
	}
	
	public void postorder() {
		System.out.print("Postorder traversal : ");
		postorderRec(root);
		System.out.println();
	}
	
	public void postorderRec(Node node) {
		if(node != null) {
			postorderRec(node.left);
			postorderRec(node.right);
			System.out.print(node.key + " ");
		}
	}
	
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	
	public Node deleteRec(Node node, int key) {
		if(node == null)
			return node;
		if(key < node.key)
			node.left = deleteRec(node.left, key);
		else if(key > node.key)
			node.right = deleteRec(node.right, key);
		else {
		
//			Both children are present
			if(node.left != null && node.right != null) {
				node.key = minValue(node.right); // or we can find the maxvalue of node.left
				node.right = deleteRec(node.right, node.key);  //delete the key that replaced the deleted node.
			}
//			Either of the children are present
			else if(node.right != null)
				return node.right;
			else if(node.left != null)
				return node.left;
//			None of the children is present
			else
				return null;
			
		}
		return node;
		
	}
	public int minValue(Node node) {
		int minv = node.key;
		
		while(node.left != null) {
			minv = node.left.key;
			node = node.left;
		}
		return minv;
	}
	public int maxValue(Node node) {
		if(node.right != null)
			return maxValue(node.right);
		else
			return node.key;
	}
}
