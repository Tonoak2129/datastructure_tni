import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch03 {
    static void main(String[] args) {
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

        int result = binarySearch(nums, target);

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

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;
            if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
