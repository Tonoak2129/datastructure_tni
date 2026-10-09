import java.util.ArrayList;
import java.util.Scanner;

public class linearSearch03 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.sampleTree();

        tree.printTree(tree.getRoot(), 0);

        ArrayList<Integer> list = traversal(tree.getRoot());
        System.out.println("\nTraveral order : " + list);

        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter target: ");
        int target = sc.nextInt();

        int result = linearSearch(nums, target);

        if (result != -1) {
            System.out.println("The target (" + target + ") at index " + result);
        }
        else {
            System.err.println("Cannot found " + target + " in this tree");
        }
        sc.close();
    }

    public static ArrayList<Integer> traversal(Node root) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        inorder(root, nums);
        return nums;
    }

    public static void inorder(Node node, ArrayList<Integer> nums) {
        if (node == null) return;

        inorder(node.left, nums);
        nums.add(node.data);
        inorder(node.right, nums);
    }

    public static int linearSearch(int[] nums,int target) {
        for (int i=0; i< nums.length; i++) {
            if (target == nums[i]) return i;
        }
        return-1;
    }
}