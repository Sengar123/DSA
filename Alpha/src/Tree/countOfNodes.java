package Tree;
import java.util.*;

import Tree.tree.Node;


public class countOfNodes {
	static class Node{
		int data;
		Node left;
		Node right;
		Node(int data){
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static class information{
		int diam;
		int height;
		information(int diam,int height){
			this.diam=diam;
			this.height=height;
		}
	}
	public static int countNode(Node root) {
		if(root==null) {
			return 0;
		}
		int left=countNode(root.left);
		int right=countNode(root.right);
		int totalNodes=left+right+1;
		return totalNodes;
	}
	//sum of nodes
	public static int sumOfNodes(Node root) {
		if(root==null) {
			return 0;
		}
		int sumleft=sumOfNodes(root.left);
		int sumright=sumOfNodes(root.right);
		int sum=sumleft+sumright+root.data;
		return sum;
	}
	public static int heightOfTree(Node root) {
		if(root==null) {
			return 0;
		}
		//O(n)
		int left=heightOfTree(root.left);
		int right=heightOfTree(root.right);
		int height=Math.max(left,right)+1;
		return height;
		
	}
	//diameter===> the number of nodes in the longest path between to leafs.
	public static int diameterOfTree(Node root) {
		//diameter pass through root
		//diameter=lh+rh+1;
		//diameter doesnot pass through root
		//diameter=Math.max(lh+rh+1,left diameter,right diameter);
		if(root==null) {
			return 0;
		}
		int ldiam=diameterOfTree(root.left);
		int rdiam=diameterOfTree(root.right);
		int leftheight=heightOfTree(root.left);
		int rightheight=heightOfTree(root.right);
		int selfdiam=leftheight+rightheight+1;
		int dia=Math.max(Math.max(ldiam,rdiam),selfdiam);
		return dia;
		//Time complexity=O(n^2) it is inefficient
	}
	public static information diameterOfTree1(Node root) {
		if(root==null) {
		return new information(0,0);
		}
		information ldiam=diameterOfTree1(root.left);
		information rdiam=diameterOfTree1(root.right);
		int diam=Math.max(Math.max(ldiam.diam,rdiam.diam),ldiam.height+rdiam.height+1);
		int ht=Math.max(ldiam.height,rdiam.height)+1;
		return new information(diam,ht);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=new Node(1);
		root.left=new Node(2);
		root.right=new Node(3);
		root.left.left=new Node(4);
		root.left.right=new Node(5);
		root.right.left=new Node(6);
//		root.right.right=new Node(7);
		countOfNodes c=new countOfNodes();
		System.out.println(c.countNode(root));
		System.out.println(c.sumOfNodes(root));
		System.out.println(c.diameterOfTree(root));
		System.out.println(c.diameterOfTree1(root).diam);
		
		
		

	}

}
