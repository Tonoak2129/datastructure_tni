
public class ToDoList {

	public static void main(String[] args) {
		DoublyLinkedList todoList = new DoublyLinkedList();
		
		todoList.insert("Finish Homework");
		todoList.insert("Laundry");
		todoList.insert("Group Meeting");
		System.out.println(todoList.traversal());
		
		todoList.insert(1,"Buy Food");
		System.out.println(todoList.traversal());
		
		todoList.insert(0,"Summit Report");
		System.out.println(todoList.traversal());
		
		todoList.insert("Go To Gym");
		System.out.println(todoList.traversal());


		System.out.println("---------------");
		//4.1
		todoList.remove();
		//4.2
		todoList.remove(3);
		//4.3
		todoList.remove(0);
		//4.4
		System.out.println(todoList.traversal());
		//5
		System.out.println("\nBackward Traversal = " + todoList.backwardTraversal());
	}
}
