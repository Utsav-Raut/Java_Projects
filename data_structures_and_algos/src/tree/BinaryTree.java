package tree;

public class BinaryTree {
	
	Node root;
	
	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		
		if(root == null) {
			root = newNode;
		}else {
			Node focusNode = root;
			Node parent;
			
			while(true) {
				parent = focusNode;
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				}else {
					focusNode = focusNode.rightChild;
					if(focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node focusNode) {
		if(focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void preorderTraverseTree(Node focusNode) {
		if(focusNode != null) {
			System.out.println(focusNode);
			preorderTraverseTree(focusNode.leftChild);
			preorderTraverseTree(focusNode.rightChild);
		}
	}
	
	public void postorderTraverseTree(Node focusNode) {
		if(focusNode != null) {
			postorderTraverseTree(focusNode.leftChild);
			postorderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	public Node findNode(int key) {
		Node focusNode = root;
		while(focusNode.key != key) {
			if(key < focusNode.key) {
				focusNode = focusNode.leftChild;
			}else {
				focusNode = focusNode.rightChild;
			}
			if(focusNode == null) {
				return null;
			}
		}
		return focusNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		
		tree.addNode(50, "Boss");
		tree.addNode(25, "Vice Pres");
		tree.addNode(15, "Office Manager");
		tree.addNode(30, "Secretary");
		tree.addNode(75, "Sales");
		tree.addNode(85, "Salesman 1");
		
		tree.inOrderTraverseTree(tree.root);
		System.out.println();
		tree.preorderTraverseTree(tree.root);
		System.out.println();
		tree.postorderTraverseTree(tree.root);
		System.out.println();
		System.out.println(tree.findNode(30));
	}

}

class Node{
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return name + " has a key " + key;
	}
}
