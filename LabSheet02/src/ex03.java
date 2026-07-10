
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayController nums = new ArrayController();
		nums.display("Display an initial dataset: ");
		
		System.out.println('\n');
		int[] new_nums = new int[nums.getSize()+1];
		
		for (int i = 0; i < nums.getSize(); i++) {
			new_nums[i] = nums.getNums()[i];
		}
		nums.setNums(new_nums);
		nums.display("Display add size: ");
		
		System.out.println('\n');
		nums.getNums()[nums.getSize()-1] = 15;
		nums.display("Display add new number:");
		
	}

}
