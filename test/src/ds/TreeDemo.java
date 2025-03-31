package ds;
import java.util.Scanner;
import java.util.Stack;

public class TreeDemo {

	public static void main(String[] args) {
		
		Node node=insertIntoTree();
		preOrderTraversal(node);
		System.out.println();
		inorderTraversal(node);
		System.out.println();
		postorderTraversal(node);
	}


	private static Node insertIntoTree() {
		Node root=null;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("enter value to insert into tree");
			int value=sc.nextInt();
			Node node=new Node();
			node.data=value;
			Node tree=root;
			if(null == root){
				root=node;				
			} else {
				while(tree != null){
					if(tree.data < node.data){
						if(tree.right != null){
							tree=tree.right;
						}else{
							tree.right=node;
							break;
						}						
					}else {
						if(tree.left != null){
							tree=tree.left;
						}else{
							tree.left=node;
							break;
						}
					}
				}
			}
			
			System.out.println("Do you want to add more node ? Y or N");
			char c=sc.next().charAt(0);
			
			if(c == 'n' || c == 'N') {
				break;
			}
		}
		sc.close();
		return root;
	}
	
	private static void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data+"-");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);
		
	}
	

	private static void inorderTraversal(Node node) {
		
		Stack<Node> s=new Stack<Node>();
		Node curr=node;
		
		while(curr != null || s.size() > 0) {
			
			while (curr != null) {
				s.push(curr);
				curr=curr.left;
			}
			
			curr=s.pop();
			
			System.out.print(curr.data+"-");
			
			
			curr=curr.right;
		}
		
	}
	

	private static void postorderTraversal(Node node) {
		
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		Node curr=node;
		
		s1.push(curr);
		
		while(s1.isEmpty() == false) {
			
			Node temp=s1.pop();
			
			s2.push(temp);
			
			if (temp.left != null) {
				s1.push(temp.left);
			}
			
			if (temp.right != null) {
				s1.push(temp.right);
			}
			
		}
		
		System.out.println("Post order: ");
		
		while(s2.isEmpty() == false) {
			System.out.print(s2.pop().data+"-");
		}
		
		
	}

}
