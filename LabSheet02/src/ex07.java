import java.util.ArrayList;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		System.out.println("Length = " + numList.size());
		
		numList.add(11);
		numList.add(12);
		numList.add(13);
		numList.add(14);
		
		System.out.println("Length = " + numList.size());
		System.out.println("All element: " + numList);
		
		int update_index = 2;
		int update_element = 20;
		
		numList.set(update_index, update_element);
		System.out.println("All element = " + numList);
		
		numList.remove(2);
		System.out.println("All element = " + numList);
		
		//numList.remove(14); //index 14 
		//System.out.println("All element = " + numList); 
		
		numList.remove(Integer.valueOf(14));
		System.out.println("All element = " + numList);
		
		numList.clear();
		System.out.println("All element = " + numList);
	}

}
