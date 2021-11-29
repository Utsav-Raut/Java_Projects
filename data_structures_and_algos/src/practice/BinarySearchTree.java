package practice;

class BSTNode{
	int data;
	BSTNode left, right;
	
	BSTNode(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class BinarySearchTree {
	
	BSTNode node;
	BinarySearchTree(){
		this.node = null;
	}
	public void insert(int data) {
		node = insertKey(node, data);
	}
	public BSTNode insertKey(BSTNode node, int key) {
		if(node == null) {
			node = new BSTNode(key);
			return node;
		}
		if(key <= node.data)
			node.left = insertKey(node.left, key);
		else if(key > node.data)
			node.right = insertKey(node.right, key);
		
		return node;
	}
	
	public void inOrder() {
		System.out.println("This is inorder traveral:");
		inOrderTrav(node);
		System.out.println();
	}
	
	public void preOrder() {
		System.out.println("This is preorder traveral:");
		preOrderTrav(node);
		System.out.println();
	}
	
	public void postOrder() {
		System.out.println("This is postorder traveral:");
		postOrderTrav(node);
		System.out.println();
	}
	
	public void inOrderTrav(BSTNode node) {
		if(node!=null) {
			inOrderTrav(node.left);
			System.out.print(node.data + " ");
			inOrderTrav(node.right);
		}
	}
	
	public void preOrderTrav(BSTNode node) {
		if(node!=null) {
			System.out.print(node.data + " ");
			preOrderTrav(node.left);
			preOrderTrav(node.right);
		}
	}
	public void postOrderTrav(BSTNode node) {
		if(node!=null) {
			postOrderTrav(node.left);
			postOrderTrav(node.right);
			System.out.print(node.data + " ");
		}
	}
	
	
	public int minV() {
		int minVal = node.data;
		
		while(node.left != null) {
			minVal = node.left.data;
			node = node.left;
		}
		return minVal;
	}
	
	public void deleteKey(int key) {
		node = deleteKeyRec(node, key);
	}
	
	public BSTNode deleteKeyRec(BSTNode node, int key) {
		if(node == null) {
			return node;
		}
		
		if(key < node.data) {
			BSTNode left_node = deleteKeyRec(node.left, key);
		}
		else if(key > node.data) {
			BSTNode right_node = deleteKeyRec(node.right, key);
		}
		else {
			if(node.left == null)
				return node.right;
			else if(node.right == null)
				return node.left;
			else {
				
			}
		}
		
		return node;
	}
	public static void main(String args[]) {
		BinarySearchTree bstObj = new BinarySearchTree();
		bstObj.insert(64);
		bstObj.insert(87);
		bstObj.insert(39);
		bstObj.insert(17);
		bstObj.insert(77);
		
		bstObj.inOrder();
		bstObj.preOrder();
		bstObj.postOrder();
		
		int smallest_val = bstObj.minV();
		System.out.println("The minimum value = "+smallest_val);
		
		
		
		
	}

}
