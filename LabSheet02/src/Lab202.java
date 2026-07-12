import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab202 {
    static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        int[] initial_numbers = {10,11,12,13,14,15,16,17,18,19};

        for (int i = 0; i < initial_numbers.length; i++) {
            nums.add(initial_numbers[i]);
        }
        Scanner scn = new Scanner(System.in);

        //add last
        System.out.print("Enter number: ");
        nums.add(scn.nextInt());
        scn.nextLine();
        System.out.println();

        System.out.println("Stu_ID : 2513110243");

        //replace from last stu ID
        System.out.print("Enter number to replace index 3: ");
        int input_num = scn.nextInt();
        scn.nextLine();
        nums.set(3,input_num);

        //replace from 2nd last stu ID
        nums.remove(4);

        //replace from 3rd last stu ID as date you take a class
        nums.set(2,10);

        System.out.println();
        System.out.println("All element = " + nums);
    }
}
