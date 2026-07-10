import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length;i++) {
			System.out.print("Enter number index " + i + ": ");
			nums[i] = scn.nextInt();
		}
		
		ArrayController numbers = new ArrayController();
		numbers.setNums(nums);
		numbers.display("Display all numbers: ");
		
	}
}
