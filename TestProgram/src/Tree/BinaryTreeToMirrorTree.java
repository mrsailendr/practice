package Tree;

import java.util.Queue;
import java.util.Stack;

import LinkedList.LinkedList;

public class BinaryTreeToMirrorTree {
	
	Node root;
	
	void mirror()
	{
		root=mirror(root);
	}

	private Node mirror(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
		return node;
		
		Node left=mirror(node.left);
		Node right=mirror(node.right);
		
		node.left=right;
		node.right=left;
				
		return node;
	}
	
	void inorder()
	{
		inorder(root);
	}
	
	
	
	private void inorder(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return;
		
		System.out.println(node.data);
		inorder(node.left);
		inorder(node.right);
		
			
		
	}
	
	int diameter()
	{
		int d=diameter(root);
		System.out.println("Diameter="+d);
		
		
		return d;
	}

	private int diameter(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
			return 0;
		int lheight= height(node.left);
		int rheight=height(node.right);
		
		int ldiameter=diameter(node.left);
		int rdiameter=diameter(node.right);
		
		int diameter=Math.max(lheight+rheight+1,Math.max(ldiameter,rdiameter));
		
		return diameter;
	}

	private int height(Node node) {
		// TODO Auto-generated method stub
		if(node==null)
		return 0;
		
		int left=height(node.left);
		int right=height(node.right);
		int h=0;
		if(left>right)
		{
			h=left+1;
		}
		else
			h=right+1;
		
		return h;
	}
	
	void printLevelOrder(Node node)
	{
		Queue<Node> q=new java.util.LinkedList<Node>();
		
		q.add(node);
		
		while(!q.isEmpty())
		{
			Node tempNode= q.poll();
			
			System.out.println(tempNode.data);
			if(tempNode.left!=null)
				q.add(tempNode.left);
			if(tempNode.right!=null)
				q.add(tempNode.right);
		}
	}
	
	void printLevelOrder()
	{
		System.out.println("Level Order Traversal");
		printLevelOrder(root);
	}
	
	void printReverseLevelOrder()
	{
		System.out.println("Reverse Level Order Traversal");
		printReverseLevelOrder(root);
	}
	
	

	private void printReverseLevelOrder(Node node) {
		// TODO Auto-generated method stub
		
		Queue<Node> q=new java.util.LinkedList<Node>();
		Stack<Node> stk=new Stack<Node>();
		
		q.add(node);
		
		while(!q.isEmpty())
		{
			Node temp=q.poll();
			stk.push(temp);
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		
		while(!stk.isEmpty())
		{
			root=stk.peek();
			System.out.println(root.data);
			stk.pop();
		}
		
	}

	public static void main(String[] args) {
		BinaryTreeToMirrorTree tree=new BinaryTreeToMirrorTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.left.right.left=new Node(6);
		tree.mirror();
		tree.inorder();
		tree.diameter();
		tree.printLevelOrder();
		tree.printReverseLevelOrder();
		
	}

}
