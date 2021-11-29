package practice;

import java.util.LinkedList;
import java.util.Queue;

class BFS_Tree_Node{
	int data;
	BFS_Tree_Node left, right;
	
	BFS_Tree_Node(int data){
		this.data = data;
		this.left = this.right = null;
	}
}

public class Tree_BFS {
	BFS_Tree_Node node;

	public void traverse_BFS(BFS_Tree_Node node) {
		if(node == null)
			return;
		Queue<BFS_Tree_Node> que = new LinkedList<BFS_Tree_Node>();
		que.add(node);
		
		while(!que.isEmpty()) {
			node = que.poll();
			System.out.println(node.data + ", ");
			if(node.left != null) que.add(node.left);
			if(node.right != null) que.add(node.right);
		}
	}
	public static void main(String[] args) {
		Tree_BFS tree = new Tree_BFS();
		tree.node = new BFS_Tree_Node(25);
		tree.node.left = new BFS_Tree_Node(12);
		tree.node.right = new BFS_Tree_Node(35);
		tree.node.left.left = new BFS_Tree_Node(8);
		tree.node.left.right = new BFS_Tree_Node(10);
		tree.node.right.right = new BFS_Tree_Node(45);
		
		System.out.println("BFS traversal....");
		tree.traverse_BFS(tree.node);
		

	}

}
