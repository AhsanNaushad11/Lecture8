package defaultqueue;
import java.util.*;
public class UsingQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList();
		for (int i = 1; i<=10; i++)
			q.add(i);
		System.out.println(q);
		}

}
