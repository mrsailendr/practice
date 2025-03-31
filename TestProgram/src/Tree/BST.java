package Tree;

public class BST {
	
	public static void main(String[] args) {
		
		Node root=null;
		root=insert(root, 50);
		insert(root, 30);
		insert(root, 20);
		insert(root, 40);
		insert(root, 70);
		insert(root, 50);
		inorder(root);
		
	}
	
	
	
	
	
	static void inorder(Node node) {
		// TODO Auto-generated method stub
		
		if(node==null)
			return;
		
		System.out.println(node.data);
		inorder(node.left);
		inorder(node.right);
		
			
		
	}
	
	static Node insert(Node root,int key)
	{
		Node newNode=new Node(key);
		Node x= root;
		Node y=null;
		while(x!=null)
		{
			y=x;
			if(key<x.data)
			{
				x=x.left;
			}
			else
				x=x.right;
		}
		
		if(y==null)
			y=newNode;
		else if(key<y.data)
		{
			y.left=newNode;
		}
		else
			y.right=newNode;
			
	
			
		
		return y;
	}

}
