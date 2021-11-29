package tree;

public class BST_Runner {

	public static void main(String args[]) {
		Binary_Search_Tree tree = new Binary_Search_Tree();
		tree.insert(20);
		tree.insert(71);
		tree.insert(5);
		tree.insert(45);
		tree.insert(3);
		tree.insert(16);
		tree.insert(82);
		
		tree.inorder();
		tree.preorder();
		tree.postorder();
		
		tree.deleteKey(71);
		tree.inorder();
	}
}
