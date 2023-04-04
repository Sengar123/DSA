package Tree;

public class tree {
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
	static class BinaryTree {
		static int idx=-1;
		public static Node buildtree(int nodes[]) {
			idx++;
			if(nodes[idx]==-1) {
				return null;
			}
			Node newNode=new Node(nodes[idx]);
			newNode.left=buildtree(nodes);
			newNode.right=buildtree(nodes);
			return newNode;
		}
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree b=new BinaryTree();
		Node root=BinaryTree.buildtree(nodes);
		System.out.println(root.data);

	}

}
/* tree is a hierarchical data structures.
 * Binary tree===> which has atmost two children.
 * levels 1 ==> root
 * level==depth;
 * TC---->   O(n)
 * 
*/