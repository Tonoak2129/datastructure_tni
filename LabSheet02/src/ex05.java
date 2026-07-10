
public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController nums = new ArrayController();
		nums.display("Display and initial dataset: ");
		
		int[] new_nums = new int[nums.getSize()-1];
		
		for(int i = 0; i < new_nums.length; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		System.out.println('\n');
		nums.setNums(new_nums);
		nums.display("Display deleted last num: ");
	}

}
