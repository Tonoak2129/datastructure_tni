
public class TreeApp2 {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		System.out.println("----------------------------");
		System.out.println("Binary tree from createTree4()");
		System.out.println("----------------------------");
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		BinaryTree tree2 = new BinaryTree();
		System.out.println("----------------------------");
		System.out.println("Binary tree from createTree5()");
		System.out.println("----------------------------");
		tree2.createTree5();
		tree2.printTree(tree2.getRoot(), 0);
		
		BinaryTree tree3 = new BinaryTree();
		System.out.println("----------------------------");
		System.out.println("Binary tree from createTree6()");
		System.out.println("----------------------------");
		tree3.createTree6();
		tree3.printTree(tree3.getRoot(), 0);
		
		
	}

}
