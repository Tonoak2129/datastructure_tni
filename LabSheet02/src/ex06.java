
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayController nums = new ArrayController();
		
		nums.display("Display and initial dataset: ");
		
		int[] new_nums = new int[nums.getSize()-1];
		
		int delete_index = 2;
		for(int i = 0; i < delete_index; i++) {
			new_nums[i] = nums.getNums()[i];
		}
		
		for(int i = delete_index+1; i < nums.getSize(); i++) {
			new_nums[i-1] = nums.getNums()[i];
		}
		System.out.println('\n');
		nums.setNums(new_nums);
		nums.display("Display deleted num: ");
	}

}
