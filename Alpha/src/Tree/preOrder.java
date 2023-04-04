package Tree;
import Tree.tree;
import java.util.*;
import Tree.tree.BinaryTree;
import Tree.tree.Node;
public class preOrder {
	
	public static void preOrder(Node root) {
		if(root==null) {
			return ;
		}
		System.out.print(root.data+ " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void postOrder(Node root) {
		if(root==null) {
			return ;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+ " ");
	}
	public static void inOrder(Node root) {
		if(root==null) {
			return ;
		}
		
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
		
	}
	public static void levelOrder(Node root) {
		//breadth first search(BFS)
		if(root==null) {
			return;
		}
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node curr=q.remove();
			if(curr==null) {
				System.out.println();
				if(q.isEmpty()) {
					break;
				}
				else {
					q.add(null);
				}
			}
			else {
				System.out.print(curr.data+ " ");
				if(curr.left!=null) {
					q.add(curr.left);
				}
				if(curr.right!=null) {
					q.add(curr.right);
				}
			}
		}
	}
//height of the tree is the difference between the root and leaf.
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b=new BinaryTree();
		Node root=BinaryTree.buildtree(nodes);
//		System.out.println("PREORDER TRAVERSAL");
//		preOrder.preOrder(root);
//		System.out.println();
//		System.out.println("INORDER TRAVERSAL");
//		preOrder.inOrder(root);
//		System.out.println();
//		System.out.println("POSTORDER TRAVERSAL");
//		preOrder.postOrder(root);
//		System.out.println();
//		System.out.println("LEVELORDER TRAVERSAL");
//		preOrder.levelOrder(root);
		System.out.println(preOrder.heightOfTree(root));
	}

}
/*root--->leftsubtree----->rightsubtree
 
 */
