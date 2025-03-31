package ds;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MyTree {
	 static TreeNode root;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println(" Please enter item to insert into tree : ");
			int data=sc.nextInt();
			
			root=insertToTree(root,data);
			
			System.out.println("Do you want to add more node ? Y or N");
			char c=sc.next().charAt(0);
			
			if(c == 'n' || c == 'N') {
				break;
			}
		}
		sc.close();
		TreeNode node=root;
		System.out.println("Preorder Traversal :");
		preOrderTraversal(node);
		System.out.println("null");
		System.out.println("Inorder Traversal");
		node=root;
		inorderTraversal(node);
		System.out.println("Postorder Traversal");
		node=root;
		postorderTraversal(node);

		System.out.println("Level traversal");
		levelTraversal(root);
	}

	private static void levelTraversal(TreeNode root) {
		Queue<TreeNode> q = new ArrayDeque<>();
		q.add(root);
		while (q.isEmpty() == false) {
			TreeNode node = (TreeNode) q.remove();
			System.out.println(node.data);
			if (node.left != null) {
				q.add(node.left);
			}
			if (node.right != null) {
				q.add(node.right);
			}
		}
	}


	public static TreeNode insertToTree(TreeNode root, int data) {
		
		TreeNode tree=root;
		
		TreeNode node=new TreeNode();
		node.data=data;
		
		if (root == null) {
			root=node;
		}else {
			while (tree != null) {
				if (tree.data < node.data) {
					if (tree.right != null) {
						tree=tree.right;
					}else {
						tree.right=node;
						break;
					}
				}else {
					if (tree.left != null) {
						tree=tree.left;
					}else {
						tree.left=node;
						break;
					}
				}
			}
		}
		
		System.out.println(root.data);
		
		return root;
		
	}
	
	public static void preOrderTraversal(TreeNode node) {
		
		if (node == null) {
			return;
		}
		
		System.out.print(node.data+" -> ");
		
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
	}
	

	public static void inorderTraversal(TreeNode node) {
		
		if (node == null) {
			return;
		}
		
		inorderTraversal(node.left);
		System.out.println(node.data);
		inorderTraversal(node.right);
		
	}
	
	private static void postorderTraversal(TreeNode node) {
		
		if (node == null) {
			return;
		}
		
		inorderTraversal(node.left);
		inorderTraversal(node.right);
		System.out.println(node.data);
		
	}


}



class TreeNode{
	
	int data;
	TreeNode left=null;
	TreeNode right=null;
	
}
