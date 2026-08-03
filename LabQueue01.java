import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue01 {
    static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Scanner scn = new Scanner(System.in);

        /*
        while (q.size()<5){
            System.out.print("Enqueue: ");
            q.add(scn.nextInt());
        }
        */
        q.add(101);
        q.add(102);
        q.add(103);
        q.add(104);
        q.add(105);
        System.out.println("Queue => " + q);

        while (!q.isEmpty()) {
            System.out.println();
            System.out.println("Calling number: " + q.peek());
            System.out.println("Providing service number: " + q.remove());
        }



    }
}
