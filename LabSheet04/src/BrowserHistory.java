import java.util.LinkedList;

public class BrowserHistory {
    static void main(String[] args) {
        LinkedList history = new LinkedList();

        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");
        System.out.println(history);

        history.removeLast();
        System.out.println(history);

        history.add("shoppe.com");
        history.add("wikipedia.org");
        history.add("claude.ai");
        System.out.println(history);

        history.remove("youtube.com");
        System.out.println(history);


        System.out.println("current page = "+ history.getLast());

        System.out.println("Visited youtube.com = "+ history.contains("youtube.com"));

        System.out.println("Go back to previous page = " + history.get(history.size()-2));

        System.out.println("Go back to previous page again = " + history.get(history.size()-3));

        history.clear();
        System.out.println(history);
    }
}
